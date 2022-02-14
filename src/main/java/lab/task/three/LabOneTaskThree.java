package lab.task.three;

import java.util.Scanner;

public class LabOneTaskThree {
    public static void main(String[] args) {
        System.out.println("Input length");
        Scanner console1 = new Scanner(System.in);
        int length = console1.nextInt();
        System.out.println("width");
        Scanner console2 = new Scanner(System.in);
        int width = console2.nextInt();
        System.out.printf("Площадь прямоугольника = %s", square(length, width));
    }

    public static int square(int a , int b){
        return a * b;
    }
}
