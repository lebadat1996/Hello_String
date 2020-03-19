import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        String useInput;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:  ");
        useInput = scanner.nextLine();
        System.out.println("Hello " + useInput);
    }
}
