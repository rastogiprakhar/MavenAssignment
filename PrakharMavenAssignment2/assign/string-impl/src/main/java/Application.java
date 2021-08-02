import java.util.Scanner;

public class Application {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to perform operation : ");
        String input=sc.nextLine();
        System.out.println();

        System.out.println("Press one of the following digit: ");
        System.out.println("1) Reverse a string");
        System.out.println("2) Find length of the string");
        System.out.println("3) Perform both Operations");
        System.out.print("Input : ");

        int choice = Integer.parseInt(sc.nextLine());
        System.out.println();

        StringFunctions obj = new StringFunctions();

        if (choice == 1) {
            String output=obj.stringReverse(input);
            System.out.println("Reversed String is : "+output);
        } else if (choice == 2) {
            int length=obj.lengthString(input);
            System.out.println("Length of the String is : "+length);
        } else if (choice == 3) {
            String output = obj.stringReverse(input);
            System.out.println("Reversed String is : "+output);
            int length=obj.lengthString(input);
            System.out.println("Length of the String is : "+length);
        } else {
            System.out.println("PLEASE ENTER CORRECT CHOICE!!");
        }
    }
}
