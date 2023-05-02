import java.util.Scanner;

/**
 * ClassName: Random
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Yang, Yuanbo
 * @Create 2023-04-24 10:57 a.m.
 * @Version 1.0
 */
public class Random {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many random integers do you want ?");
        int number = scanner.nextInt();

        System.out.println("Enter minimum: ");
        String minString = scanner.nextLine();
       scanner.nextLine();

        System.out.println("Enter max: ");
        String maxString = scanner.nextLine();
        int min, max;

        try {
            min = Integer.parseInt(minString);
            max = Integer.parseInt(maxString);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
            return;
        }


        if(min > max){
            System.out.println("Error, min should less than max");
           return;
        }

        double result = Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(result);

    }
}
