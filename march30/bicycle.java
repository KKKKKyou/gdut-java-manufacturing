package march30;

public class bicycle extends  vehicle{
    public bicycle(){
        super();
    }
    public bicycle(String brand,double speed){
        super(brand,speed);
    }
    @Override
    public void move(){
        System.out.println(getBrand()+"bicycle is moving in"+getSpeed());

    }
    public void ring(){
        System.out.println("ring ring ring");
    }
}
