import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int n1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int n2 = input.nextInt();

        System.out.print("Enter number 3: ");
        int n3 = input.nextInt();

        MyMath math = new MyMath(n1, n2, n3);

        System.out.println("Add: " + math.add());
        System.out.println("Divide: " + math.divide());
        System.out.println("Multiply: " + math.multiply());

        input.close();
    }
}
