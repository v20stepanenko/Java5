package goJava.modul11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Map;

/**
 * Created by Vova on 09.02.2017.
 */
public class ThirdTask {
    public static void main(String[] args) {
        try {
            fileContentMerger(FirstTask.getReplacemantMap());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileContentMerger(Map<String, String> map) throws IOException {

        String text = FirstTask.getText(FirstTask.PATH_FROM_FILE);
        text = FirstTask.replace(map,text);
        Files.write(FirstTask.PATH_FILE, text.getBytes(), StandardOpenOption.APPEND);
    }
}
