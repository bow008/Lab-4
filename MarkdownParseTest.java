// import statements necessary to use JUnit
import static org.junit.Assert.*; 
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest { // class declaration for the tester
   @Test // indicates that what follows is a JUnit test
   public void addition() { // method declaration for the test
      assertEquals(2, 1 + 1); // statement that checks to make sure the first and second
      // parameters are the same thing - if not, it shows as a failure upon execution
   }

   @Test
   public void testGetLinks() throws IOException {
      List<String> list = List.of("https://something.com", "some-thing.html");
      Path fileName = Path.of("/Users/boyuwang/Documents/GitHub/markdown-parser-main/test-file.md");
      String content = Files.readString(fileName);
      ArrayList<String> links = MarkdownParse.getLinks(content);
      assertEquals(list, links);
   }
}
