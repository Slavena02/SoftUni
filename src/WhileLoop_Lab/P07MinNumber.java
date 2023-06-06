package WhileLoop_Lab;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int minValueNum = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int num = Integer.parseInt(input);

            if (num < minValueNum) {
                minValueNum = num;
            }
            input = scanner.nextLine();
        }
        System.out.println(minValueNum);
    }
}



