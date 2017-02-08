package goJava.modul11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Vova on 09.02.2017.
 */
public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        String text = "1\n2\n3\n1\n2\n3";
        Files.write(Paths.get(FirstTask.PATH_FROM_FILE),text.getBytes(), StandardOpenOption.CREATE);
    }
}
