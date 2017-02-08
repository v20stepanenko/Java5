package goJava.modul11;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Vova on 09.02.2017.
 */
public class FourthTask {
    public static void main(String[] args) {
        System.out.println(checkWord("one"));
    }

    public static int checkWord(String wordFromSearch ) {
        StringBuilder builder = new StringBuilder();
        methodTryWithResource(builder, FirstTask.PATH_FILE);
//        methodWithTry(builder, FirstTask.PATH_FILE);
        String text = builder.toString();
        int index = text.indexOf(wordFromSearch);
        int count = 0;
        while(index >= 0) {
            index = text.indexOf(wordFromSearch, index+1);
            count++;
        }
        return count;
    }

    private static String methodTryWithResource(StringBuilder builder, Path path) {
        String text = null;
        try (BufferedReader reader = Files.newBufferedReader(path)){
            while ((text = reader.readLine())!=null){
                builder.append(text);
            }
            text = builder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    private static String methodWithTry(StringBuilder builder, Path path) {
        String text = null;
        try {
            BufferedReader reader = Files.newBufferedReader(path);
            while ((text = reader.readLine())!=null){
                builder.append(text);
            }
            text = builder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
