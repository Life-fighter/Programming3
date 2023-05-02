import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Yang, Yuanbo
 * @Create 2023-04-25 10:47 a.m.
 * @Version 1.0
 */
public class Main {
    static ArrayList<Todo> todolist = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = -1;
        while (choice != 0) {
            System.out.println("Please make a choice [0-4]:");
            System.out.println("1. Add a todo");
            System.out.println("2. List all todos (numbered)");
            System.out.println("3. Delete a todo");
            System.out.println("4. Modify a todo");
            System.out.println("0. Exit");
            System.out.print("Your choice is: ");
            choice = input.nextInt();
            //input.nextLine(); // consume newline character

            switch (choice){
                case 1:
                    addTodo();
                    break;
                case 2:
                    listTodos();
                    break;
                case 3:
                    deleteTodo();
                    break;
                case 4:
                    modifyTodo();
                    break;
                case 0:
                    System.out.println("Exiting. Good bye!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }



        }



        private static void addTodo(){
            System.out.println("do sth");
            return;
        }

        private static void listTodos(){
            System.out.println("list sth");
            return;

        }

        private static void deleteTodo(){
            System.out.println("delete sth");
            return;

        }

        private static void modifyTodo(){
            System.out.println("modify sth");
            return;
        }




}
