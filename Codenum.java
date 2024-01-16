// making the code  name based upon given input
import java.util.Scanner;
public class Hello{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your first  name: ");
        String fname = scanner.nextLine();

        System.out.print("Your Last  name: ");
        String lname = scanner.nextLine();

        System.out.print("Your age: ");
        int age = scanner.nextInt();
        //char firstletter = fname.charAt(0);

        // first it conversts integer to string and gets the value based upon index and again back to int
        int num1 = Character.getNumericValue(Integer.toString(age).charAt(0));
        int num2 = Character.getNumericValue(Integer.toString(age).charAt(1));


        System.out.print("Your code name is: "+fname.toUpperCase().charAt(0) +lname.charAt(lname.length() - 1)+  num2 + num1);
        // to uppercase makes the first letter capital despite being small.












    }
}
