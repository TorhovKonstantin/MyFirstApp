package timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class timus_1409 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        int y = a+b-1;
        int h = y - a;
        int l = y - b;
        out.println(h +" "+l);
        out.flush();
    }

}
