package lab.task.request;

import lab.task.four.LabOneTaskFour;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RequestUrlTest {
  @Test
  void shouldRequestAndSave() throws IOException {
    RequestUrl.main(new String[]{"https://www.google.by/", "src/main/resources/task6.html"});

    File f = new File("src/main/resources/task6.html");
    assertTrue(f.exists() && !f.isDirectory());
  }
}
