package lab.task.two;

import org.junit.jupiter.api.Assertions;

public class Test {
    @org.junit.jupiter.api.Test
    public void testMax (){
        LabOneTaskTwo test1 = new LabOneTaskTwo();
        int max1 = test1.max(10,7,20);
        Assertions.assertEquals(20,max1);
    }
    @org.junit.jupiter.api.Test
    public void testMin (){
        LabOneTaskTwo test1 = new LabOneTaskTwo();
        int min1 = test1.min(10,7,20);
        Assertions.assertEquals(7,min1);
    }
}
