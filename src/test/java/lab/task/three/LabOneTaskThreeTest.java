package lab.task.three;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LabOneTaskThreeTest {
    @Test
    void testSquare(){
        LabOneTaskThree test = new LabOneTaskThree();

        int actual =  test.square(5,5);
        int expected = 25;

        Assertions.assertEquals(expected, actual);
    }
}
