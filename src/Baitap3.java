import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fan fan= new Fan();
        System.out.println("nhap 1 de bat quat");
        int bat = sc.nextInt();
        if (bat == 1 ){fan.setStatus(fan.on);}
        System.out.println("nhap toc do");
        int speed = sc.nextInt();
        fan.setSpeed(speed);
        fan.display();
    }
}
