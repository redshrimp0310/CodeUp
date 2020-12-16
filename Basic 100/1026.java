import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.nextLine();
    	String[] arrOfStr = s.split("\\:");
    	int second = Integer.parseInt(arrOfStr[1]);
    	
    	if (second < 10)
    	System.out.printf("%1d", second);
    	else 
    	System.out.printf("%d", second);
    	
    // 	System.out.printf("%02d", second);

    
    }
}

