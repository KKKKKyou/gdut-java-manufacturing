package march30;

public class car extends  vehicle{
    public car(){
        super();
    }
    public car(String brand,double speed){
        super(brand,speed);

    }
@Override
    public void move(){
        System.out.println(getBrand()+"car is moving in"+getSpeed());
}
    public void honk (){
        System.out.println("honk");
    }
}
