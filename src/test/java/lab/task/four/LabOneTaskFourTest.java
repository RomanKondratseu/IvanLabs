package lab.task.four;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LabOneTaskFourTest {
  @Test
  void shouldFindFile() throws IOException {
    LabOneTaskFour.generateFile();

    File f = new File(LabOneTaskFour.PATH);
    assertTrue(f.exists() && !f.isDirectory());
  }
}
