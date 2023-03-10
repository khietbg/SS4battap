public class Fan {
    final int SLOW = 1;
    final int MEDIUM =2;
    final int FAST = 3;
    final boolean off=false;
    final boolean on=true;
private boolean status =  false;
private int speed = 1;
private String color= "Blue";

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
        if (this.status) {System.out.println("quat da bat");}
        else  {
            System.out.println("quat da tat");
        } ;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        switch (this.speed){
            case SLOW:
                System.out.println("qua dang o che do cham");
                break;
            case MEDIUM:
                    System.out.println("quat dang o che do binh thuong");
                break;
            case FAST:
                System.out.println("quat dang o che do nhanh ");
                break;
        }
    }
    public void display(){
        System.out.println("quat dang bat"+"\n"+"quat dang o che do: "+ speed + "\n"+"mau cua quat la: "+ color);
    }
}
