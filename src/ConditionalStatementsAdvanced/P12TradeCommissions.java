package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double income = Double.parseDouble(scanner.nextLine());

        boolean isValidData = true;
        double commission = 0;

        if (town.equals("Sofia")) {
            if (income >= 0 && income <= 500) {
                commission = income * 0.05;
            } else if (income > 500 && income <= 1000) {
                commission = income * 0.07;
            } else if (income > 1000 && income <= 10000) {
                commission = income * 0.08;
            }  else if (income > 10000) {
                commission = income * 0.12;
            } else {
                isValidData = false;
            }
        } else if (town.equals("Varna")) {
            if (income >= 0 && income <= 500) {
                commission = income * 0.045;
            } else if (income > 500 && income <= 1000) {
                commission = income * 0.075;
            } else if (income > 1000 && income <= 10000) {
                commission = income * 0.1;
            }  else if (income > 10000) {
                commission = income * 0.13;
            } else {
                isValidData = false;
            }
        } else if (town.equals("Plovdiv")) {
            if (income >= 0 && income <= 500) {
                commission = income * 0.055;
            } else if (income > 500 && income <= 1000) {
                commission = income * 0.08;
            } else if (income > 1000 && income <= 10000) {
                commission = income * 0.12;
            }  else if (income > 10000) {
                commission = income * 0.145;
            } else {
                isValidData = false;
            }
        } else {
            isValidData = false;
        }

 //      if (commission > 0) {
 //         System.out.printf("%.2f", commission);
  //      } else {
  //          System.out.println("error");
  //          }

        if (isValidData) {
            System.out.printf("%.2f", commission);
        } else {
            System.out.println("error");
        }
    }
}