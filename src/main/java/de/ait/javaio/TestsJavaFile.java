package de.ait.javaio;

import java.io.File;
import java.io.IOException;

public class TestsJavaFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("myFile.txt");
        System.out.println(myFile.getAbsoluteFile());
        System.out.println(myFile.getPath());
        System.out.println(myFile.createNewFile());

    }
}
