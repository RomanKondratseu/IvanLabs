package lab.task.two;

import java.util.Scanner;

public class LabOneTaskTwo {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        Scanner surname = new Scanner(System.in);
        System.out.println("Введите возраст, имя,фамилию");
        Head first = new Head(age.nextInt(), name.nextLine(), surname.nextLine());
        System.out.println("Введите возраст, имя,фамилию");
        Head two = new Head(age.nextInt(), name.nextLine(), surname.nextLine());
        System.out.println("Введите возраст, имя,фамилию");
        Head three = new Head(age.nextInt(), name.nextLine(), surname.nextLine());
        System.out.println(first.age + " " + first.name + " " + first.surname);
        System.out.println(two.age + " " + two.name + " " + two.surname);
        System.out.println(three.age + " " + three.name + " " + three.surname);
        max(first.age, two.age, three.age);
        min(first.age, two.age, three.age);
        aver(first.age, two.age, three.age);
    }

    public static int max(int first, int two, int three) {
        int max = 0;
        if (first > two && first > three) {
            max = first;
        }
        if (two > first && two > first) {
            max = two;
        }
        if (three > first && three > two) {
            max = three;
        }
        System.out.println("Max= " + max);
        return max;
    }

    public static int min(int first, int two, int three) {
        int min = 0;
        if (first < two && first < three) {
            min = first;
        }
        if (two < first && two < first) {
            min = two;
        }
        if (three < first && three < two) {
            min = three;
        }
        System.out.println("Min= " + min);
        return min;
    }

    public static void aver(int first, int two, int three) {
        int aver = (first + two + three) / 3;
        System.out.println("Aver =" + aver);
    }
}
