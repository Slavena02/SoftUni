package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P06NumberInRange {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner (System.in);

        double num = Double.parseDouble(scanner.nextLine());

        if(num >= -100 && num <=100 && num !=0){
            System.out.println("Yes");

        }else {
            System.out.println("No");
        }

    }
}
