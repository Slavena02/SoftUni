package WhileLoopMoreExercises;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());

        int transaction = 1;
        double sumCard = 0.00;
        double sumMoney = 0.00;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            double sum = Double.parseDouble(scanner.nextLine());
            transaction++;

            if (transaction % 2 == 0) {
                if (sum < 10) {
                    System.out.println("Error in transaction");
                } else {
                    sumCard += sum;
                    System.out.println("Product sold!");
                }

            } else {
                if (sum > 100) {
                    System.out.println("Error in transaction");
                } else {
                    sumMoney += sum;
                    System.out.println("Product sold!");
                }
                transaction++;
            }


            double averagesCard = sumCard / transaction;
            double averagesMoney = sumMoney / transaction;


            if (sumMoney >= budget) {
                System.out.printf("Average CS: %.2f", averagesMoney);
                System.out.printf("Average CC: %.2f", averagesCard);
            }


        }
        System.out.println("Failed to collect required money for charity.");
    }
}
