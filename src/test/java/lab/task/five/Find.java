package lab.task.five;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Find {
  @Test
  void shouldFindFilesWithExtension() {
    List<String> foundFiles = new ArrayList<>();
    FindFilesWithExtension.find(new File("src/test/java"), ".html", foundFiles);

    assertEquals(foundFiles.size(), 1);
  }
}
