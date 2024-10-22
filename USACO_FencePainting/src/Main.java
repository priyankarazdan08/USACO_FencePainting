import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("paint.in"));

        String firstLine = sc.nextLine();
        int a = Integer.parseInt(firstLine.substring(0, firstLine.indexOf(" ")));
        int b = Integer.parseInt(firstLine.substring(firstLine.indexOf(" ") + 1));
        String secondLine = sc.nextLine();
        int c = Integer.parseInt(secondLine.substring(0, secondLine.indexOf(" ")));
        int d = Integer.parseInt(secondLine.substring(secondLine.indexOf(" ") + 1));
        sc.close();

        int ans = 0;

        if(a < c) {
            if(b > d) {
                ans = b - a;
            }
            if(b < d) {
                ans = (d - a);
            }
        }
        if(a > c) {
            if(b > d) {
                ans = (b - c);
            }
            if(b < d) {
                ans = (d - c);
            }
        }
        PrintWriter pw = new PrintWriter("paint.out");
        pw.println(ans);
        pw.close();
    }
}