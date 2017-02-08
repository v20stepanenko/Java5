package goJava.modul11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Vova on 08.02.2017.
 */
public class SecondTask {

    private static String text;

    public static void main(String[] args) {
        try {
            fileContentReplacer(FirstTask.PATH_FROM_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileContentReplacer(String pathFile) throws IOException {
        text = FirstTask.getText(pathFile);
        text = FirstTask.replace(FirstTask.getReplacemantMap(), text);
        Files.write(Paths.get(pathFile), text.getBytes(), StandardOpenOption.CREATE);
    }
}
