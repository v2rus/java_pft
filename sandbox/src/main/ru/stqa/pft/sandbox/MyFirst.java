package ru.stqa.pft.sandbox;

import java.util.Scanner;

public class MyFirst {
    public static void main(String[] args) {
        Scanner Welc = new Scanner(System.in);
        System.out.println("кого попривестсвовать ?");
        String text = Welc.nextLine();
        hello(text);

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
    }

    public static void hello (String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}
