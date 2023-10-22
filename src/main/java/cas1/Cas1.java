package cas1;

import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URIUtils;

public class Cas1 {
    public static void main(String[] args) {
        URIBuilder uriBuilder = new URIBuilder()
                .setScheme("http")
                .setHost("gitlab.com")
                .setPath("/api/v/projects" + "")
                ;
        System.out.println("Hello world!");
    }
}