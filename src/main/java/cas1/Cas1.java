package cas1;

import org.apache.http.client.utils.URIBuilder;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class Cas1 {
    public static void main(String[] args) throws Exception {
        int inkscape = 3472737;
        int gitlabFoss = 13083;

        System.out.println("Inkscape : " + getDescription(inkscape));
        System.out.println("Gitlab FOSS : " + getDescription(gitlabFoss));
    }

    private static String getDescription(int projectId) throws Exception{
        String path = "api/v4/projects";

        URIBuilder uriBuilder = new URIBuilder()
                .setScheme("https")
                .setHost("gitlab.com");

        URL url = uriBuilder.setPath(String.format("/%s/%d", path, projectId)).build().toURL();

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();

        if (responseCode == 200) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result

            JSONTokener tokener = new JSONTokener(response.toString());
            JSONObject root = new JSONObject(tokener);

            return root.getString("description");
        } else {
            return "GET request failed";
        }
    }
}