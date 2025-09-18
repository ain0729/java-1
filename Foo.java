import java.util.Scanner;

public class Foo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number:"); 
        String name = scanner.nextLine(); 
        System.out.println("Hello, " + name + "!");
        String old = scanner.nextLine(); 
        scanner.close();
    }
}

