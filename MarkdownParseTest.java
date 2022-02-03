import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void test1() throws IOException{
        String contents = Files.readString(Path.of("./test1.md"));
        ArrayList<String> testList = new ArrayList<>();
        assertEquals(testList, MarkdownParse.getLinks(contents));
    }

    @Test
    public void test2() throws IOException{
        String contents = Files.readString(Path.of("./test2.md"));
        ArrayList<String> testList = new ArrayList<>();
        assertEquals(testList, MarkdownParse.getLinks(contents));
    }

    @Test
    public void test3() throws IOException{
        String contents = Files.readString(Path.of("./test3.md"));
        ArrayList<String> testList = new ArrayList<>();
        assertEquals(testList, MarkdownParse.getLinks(contents));
    }

    @Test
    public void test4() throws IOException{
        String contents = Files.readString(Path.of("./test-file4.md"));
        ArrayList<String> testList = new ArrayList<>();
        testList.add("google");
        assertEquals(testList, MarkdownParse.getLinks(contents));
    }
}
    // only takes 4 second to test all cases

