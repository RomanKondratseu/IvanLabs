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
        square(length,width);
    }
    public static int square(int a , int b){
        int s = a*b;
        System.out.println("Площадь прямоугольника=" +s);
        return s;
    }
}
