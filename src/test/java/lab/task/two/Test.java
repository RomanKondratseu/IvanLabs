package lab.task.two;

import org.junit.jupiter.api.Assertions;

class Test {
  @org.junit.jupiter.api.Test
  void testMax() {
    LabOneTaskTwo test1 = new LabOneTaskTwo();
    int max1 = test1.max(10, 7, 20);
    Assertions.assertEquals(20, max1);
  }
}
