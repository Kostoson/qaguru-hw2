package testswhithfiles.testwithjsonfile;

import com.google.gson.Gson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testswhithfiles.data.Inoske;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JsonTest {
    @DisplayName("Проверяем содержимое JSON файла")
    @Test
    void JsonTest() throws IOException {
        ClassLoader classLoader = JsonTest.class.getClassLoader();
        Gson gson = new Gson();

        try (InputStream is = classLoader.getResourceAsStream("Inoske.json");
             InputStreamReader inputStreamReader = new InputStreamReader(is)) {
            Inoske inoske = gson.fromJson(inputStreamReader, Inoske.class);
            Assertions.assertEquals("bullterier", inoske.getBreed());
            Assertions.assertEquals("Inoske", inoske.getName());
            Assertions.assertEquals(1, inoske.getAge());
            Assertions.assertEquals("Kostya", inoske.getOwners().get(0));
            Assertions.assertEquals("Alina", inoske.getOwners().get(1));
            Assertions.assertTrue(inoske.getIsGoodBoy());
            Assertions.assertEquals("long", inoske.getAppearance().getEars());
            Assertions.assertEquals("grunting", inoske.getAppearance().getNose());

        }
    }

}
