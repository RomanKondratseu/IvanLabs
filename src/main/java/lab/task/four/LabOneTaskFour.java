package lab.task.four;

import java.io.File;

public class LabOneTaskFour {
    public static void main(String args[])
    {
        try {
            // Возьмите файл
            File f = new File("src/main/resources/task4.html");
            //Создайте новый файл
            // Убедитесь, что он не существует
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}

