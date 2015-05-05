package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import fruit.FruitServer;

/**
 * Created by liudi on 5/5/15.
 */
public class ServerHooks {
    public static final int PORT = 8887;

    private FruitServer server;

    @Before
    public void startServer() throws Exception {
        server = new FruitServer(PORT);
        server.start();
    }

    @After
    public void stopServer() throws Exception {
        server.stop();
    }
}
