import java.util.Scanner;

public class division_numbers {

    public static void main(String[] args) {

        try {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a numberOne: ");
        int numberOne = in.nextInt();

        System.out.print("Input a numberTwo other than zero: ");
        int numberTwo = in.nextInt();

        int Result = numberOne/numberTwo;

        System.out.printf("Your division result is: %d \n", Result);
        in.close();

    } catch (ArithmeticException e) {
        }
        throw new ArithmeticException("Таки решили поделить на ноль");
    }}
// 