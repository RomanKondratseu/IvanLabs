package lab.task.two;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class LabOneTaskTwo {
  public static void main(String[] args) {
    Scanner age = new Scanner(System.in);
    Scanner name = new Scanner(System.in);
    Scanner surname = new Scanner(System.in);
    System.out.println("Введите возраст, имя,фамилию");
    Person first = new Person(age.nextInt(), name.nextLine(), surname.nextLine());
    System.out.println("Введите возраст, имя,фамилию");
    Person two = new Person(age.nextInt(), name.nextLine(), surname.nextLine());
    System.out.println("Введите возраст, имя,фамилию");
    Person three = new Person(age.nextInt(), name.nextLine(), surname.nextLine());
    System.out.println(first.getAge() + " " + first.getName() + " " + first.getSurname());
    System.out.println(two.getAge() + " " + two.getName() + " " + two.getSurname());
    System.out.println(three.getAge() + " " + three.getName() + " " + three.getSurname());
    System.out.printf("Max = %s%n", max(first.getAge(), two.getAge(), three.getAge()));
    System.out.printf("Min = %s%n", min(first.getAge(), two.getAge(), three.getAge()));
    System.out.printf("Aver = %s%n", average(first.getAge(), two.getAge(), three.getAge()));
  }

  public static int max(int... values) {
    int max = 0;
    for (int value : values) {
      if (value > max) {
        max = value;
      }
    }

    return max;
  }

  public static int min(int... values) {
    int min = Integer.MAX_VALUE;
    for (int value : values) {
      if (value < min) {
        min = value;
      }
    }

    return min;
  }

  public static double average(int... values) {
    return new BigDecimal(Arrays.stream(values).sum())
            .divide(new BigDecimal(values.length),  RoundingMode.HALF_UP)
            .doubleValue();
  }
}
