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

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {



        System.out.println("How many random integers do you want ?");
        int number = scanner.nextInt();
        scanner.nextLine();

        if(number < 0){
            System.out.println("Error, number must be a positive integer.");
            return;
        }

        System.out.println("What's your name?");
        String name = scanner.nextLine();
        if(name.equals("")){
            System.out.println("Error: name must not be empty");
            return;
        }


        System.out.println("Enter minimum: ");
        int min = scanner.nextInt();


        System.out.println("Enter max: ");
        int max = scanner.nextInt();



        if(min > max){
            System.out.println("Error, min should less than max");
           return;
        }

        double result = Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(result);

    }
}
