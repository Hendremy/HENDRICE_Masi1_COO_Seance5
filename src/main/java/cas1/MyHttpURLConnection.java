package cas1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyHttpURLConnection extends HttpURLConnection {
    public MyHttpURLConnection(URL u) {
        super(u);
    }

    @Override
    public void disconnect() {

    }

    @Override
    public boolean usingProxy() {
        return false;
    }

    @Override
    public void connect() throws IOException {

    }
}
