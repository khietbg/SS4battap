public class ptb2 {
    double a,b,c;
    public ptb2(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double delta(){
        return b*b - (4*a*c);
    }
    public void nghiem(){
        double x1 = 0,x2 = 0;
        double delta = delta();
        if (delta<0){
            System.out.println("phuong tring vo nghiem");
        }else if (delta==0){
            x1=x2=-b/2*a;
            System.out.println("phuong tring co nghiem kep x1=x2= "+x1);
        }else {
            x1 = (-b-Math.sqrt(delta()))/(2*a);
            x2 = (-b+Math.sqrt(delta()))/(2*a);
            System.out.println("nghiem x1: " + x1 +", "+ "x2: " + x2);
        }


    }
}
