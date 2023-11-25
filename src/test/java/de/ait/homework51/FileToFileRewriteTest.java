package de.ait.homework51;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.*;

class FileToFileRewriteTest {

    //private LogCaptor logCaptor = LogCaptor.forClass(FileToFileRewrite.class);
    private FileToFileRewrite fileTextWorker;

    @BeforeEach
    private void setUp() {
        fileTextWorker = new FileToFileRewrite();
    }


    @Test
    void writeReverseTextToFileSuccess() throws IOException {
        String testToReverse = "Lesson";
        StringReader stringReader = new StringReader(testToReverse);
        StringWriter stringWriter = new StringWriter();
        FileToFileRewrite.writeReverseTextToFile(stringReader, stringWriter);
    }

    @Test
    void reverseStringSuccess() {
        String reverseResult = FileToFileRewrite.reverseString("Amazon");
        assertEquals("nozamA", reverseResult);
    }

    @Test
    void reverseString() {
    }
}