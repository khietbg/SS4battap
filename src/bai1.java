import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap a");
        a= input.nextDouble();
        System.out.println("nhap b");
        b=input.nextDouble();
        System.out.println("nhap c");
        c= input.nextDouble();
       ptb2 pt = new ptb2(a,b,c);
        pt.nghiem();
    }
}