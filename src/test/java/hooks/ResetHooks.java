package hooks;

import cucumber.api.java.Before;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by liudi on 5/5/15.
 */
public class ResetHooks {

    @Before
    public void deleteFruitFile() throws Exception {
        Path path = FileSystems.getDefault().getPath("fruit.json");
        Files.deleteIfExists(path);
    }
}
