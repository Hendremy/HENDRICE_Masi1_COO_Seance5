package cas3;

import cas1.MyHttpURLConnection;

import javax.net.ssl.HttpsURLConnection;
import java.net.HttpURLConnection;
import java.net.URL;

public class Cas3 {
    public static void main(String[] args) throws Exception {
        final String gitlabAPI = "https://gitlab.com/api/v4/projects/";
        UriBuilder uriBuilder;
        HttpURLConnection connection = new MyHttpURLConnection(new URL("spec"));
        System.out.println("Hello world!");
    }
}