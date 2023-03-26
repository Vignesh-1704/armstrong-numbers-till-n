import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to find Armstrong numbe : ");
        int inputNumber = scanner.nextInt();

        for (int iterator = 1; iterator < inputNumber; iterator++) {
            int order = String.valueOf(iterator).length();
            int temp = iterator;
            int sum = 0;
            while (temp > 0) {
                int lastValue = temp % 10;
                sum += Math.pow(lastValue, order);
                temp = temp / 10;
            }
            if (sum == iterator)
                System.out.println(iterator + " : Yes It is a Armstrong no");
        }
    }
}