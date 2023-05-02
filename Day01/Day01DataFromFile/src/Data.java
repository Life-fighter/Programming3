import javax.security.auth.callback.TextOutputCallback;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * ClassName: Data
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Yang, Yuanbo
 * @Create 2023-04-24 1:04 p.m.
 * @Version 1.0
 */
public class Data {

    static ArrayList<String> namesList = new ArrayList<>();
    static ArrayList<Double> numsList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {



        Scanner input = new Scanner(new File("D:\\Jac\\Programming3\\Day01\\Day01DataFromFile\\input.txt"));

        // Read in data from file
        while (input.hasNext()) {
            String line = input.nextLine();
            try {
                Double num = Double.parseDouble(line);
                numsList.add(num);
            } catch (NumberFormatException e) {
                namesList.add(line);
            }
        }
        Collections.sort(namesList);
        Collections.sort(numsList);

        System.out.println("Names sorted: " + namesList);
        System.out.println("Numbers sorted: " + numsList);


        // average length of items

        double totalCharacts = 0;
        for(String name : namesList){
            totalCharacts += name.length();
        }
        System.out.printf("Average length of names: %.2f ", totalCharacts/namesList.size());


    }

}
