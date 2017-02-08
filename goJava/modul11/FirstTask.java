package goJava.modul11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vova on 08.02.2017.
 */
public class FirstTask {

    public static final String PATH_FROM_FILE = "goJava/modul11/input.txt";
    public static final Path PATH_FILE = Paths.get(PATH_FROM_FILE);

    public static void main(String[] args) {
        String text="";
        try {
            text = getText(PATH_FROM_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String newText = replace(getReplacemantMap(), text);
        System.out.println(newText);
    }

    public static String getText(String pathFile) throws IOException {
        StringBuilder builder = new StringBuilder();
        Files.readAllLines(PATH_FILE).forEach(lines -> builder.append(lines+"\n"));
        return builder.toString();
    }

    public static Map<String, String> getReplacemantMap() {

        Map<String, String> mapReplacemant = new HashMap<>();
        mapReplacemant.put("1", "one");
        mapReplacemant.put("2", "two");
        return mapReplacemant;
    }

    public static String replace(Map<String, String> mapReplacemant, String textForReplace) {

        String replaceText = textForReplace;
        for (String key : mapReplacemant.keySet()) {
        replaceText = replaceText.replaceAll(key, mapReplacemant.get(key));
        }
//        mapReplacemant.keySet().forEach(key->replaceText.replaceAll(key, mapReplacemant.get(key)));
        return replaceText;
    }

}
