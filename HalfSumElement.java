import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sumNumbers = 0;
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > maxNumber) {
                maxNumber = number;
            }
            sumNumbers += number;
        }
        int sumWithoutMaxNumber = sumNumbers - maxNumber;
        if (sumWithoutMaxNumber == maxNumber) {
            System.out.printf("Yes%nSum = %d", sumWithoutMaxNumber);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(maxNumber - sumWithoutMaxNumber));
        }
    }
}
