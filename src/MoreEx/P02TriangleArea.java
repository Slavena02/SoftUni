package MoreEx;

import java.util.Scanner;

public class P02TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double faceTriangle = a * h / 2;

        System.out.printf("%.2f" , faceTriangle);
    }
}
