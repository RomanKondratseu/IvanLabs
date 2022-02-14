package lab.task.three;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLabOneTaskThree {
    @Test
    public void testSquare(){
        LabOneTaskThree test = new LabOneTaskThree();
        int square =  test.square(5,5);
        Assertions.assertEquals(25,square);
    }

}
