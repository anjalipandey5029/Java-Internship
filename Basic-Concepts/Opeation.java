import java.util.Scanner;

public class Opeation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter first no :" + a);
        System.out.println("Enter second no : " + b);
        
        int res = a + b;
        System.out.println("Sum of a and b " + res);

       float ress = a/b;
       System.out.println("Division of a by b " + ress);
    }
}
