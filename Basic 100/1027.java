import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	String[] arrOfStr = s.split("\\.");
    	int year = Integer.parseInt(arrOfStr[0]);
    	int month = Integer.parseInt(arrOfStr[1]);
    	int day = Integer.parseInt(arrOfStr[2]);
    	System.out.printf("%02d-%02d-%04d",day,month,year);
        
    }
}
