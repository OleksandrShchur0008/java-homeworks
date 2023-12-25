package de.ait.testJavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaReadWritePassFile {

    private InputStream inputStream;

    private OutputStream outputStream;

    private String path;

    public JavaReadWritePassFile(String path) {
        this.path = path;
    }

    public void readFile() throws IOException {
        inputStream = new FileInputStream(path);

        int data = inputStream.read();

        char content;

        while(data != -1) {
            content = (char) data;

            System.out.println(content);

            data = inputStream.read();

        }
        inputStream.close();
    }
    public void writeFile(String stringToWrite) throws IOException {

        outputStream =  new FileOutputStream(path);

        outputStream.write(stringToWrite.getBytes());

        outputStream.close();
    }


    public void writeFileTwo(String stringToWrite)  {
        try {
            outputStream =  new FileOutputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }

        try {
            outputStream.write(stringToWrite.getBytes());

            outputStream.close();

        } catch (IOException e) {
            System.out.println("IOException");
        }

    }

}
