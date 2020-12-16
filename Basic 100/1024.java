import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
        
        for(char ch : charArray){
            System.out.println("'"+ch+"'");
        }
    }
}
