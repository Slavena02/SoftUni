package ProgrammingBasicsOnlineExam_1;

import java.util.Scanner;

public class P04Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalSum = 0.00;
        double priceTickets = 5.00;
        int countPeople = 0;

        while (!input.equals("Movie time!")){
            int people =Integer.parseInt(input);
            people++;
            double sum = people * priceTickets;
            if (people % 3 == 0){
                sum = sum - 5.00;
            }
            totalSum  += sum;

        }
    }
}
