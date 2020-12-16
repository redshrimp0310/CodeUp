import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	String st = sc.nextLine();
    	String[] s = st.split("\\.");
    	int part1 = Integer.parseInt(s[0]);
    	int part2 = Integer.parseInt(s[1]);
    	int part3 = Integer.parseInt(s[2]);
    	
    	System.out.printf("%04d.%02d.%02d",part1,part2,part3);
    	
    	
    }
}
