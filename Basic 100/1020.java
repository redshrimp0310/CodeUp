import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sa = s.split("-");
        
        int part1 = Integer.parseInt(sa[0]);
        int part2 = Integer.parseInt(sa[1]);
        
        System.out.printf("%06d%07d",part1,part2);
    }
}
