import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.next().charAt(0);
        b = sc.next().charAt(0);
        System.out.printf("%c %c", b,a);
    }
}
