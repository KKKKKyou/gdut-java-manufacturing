package march30;

public class vehicle {

        private String brand;
        private double speed;
        public vehicle(){

        }
        public vehicle(String brand,double speed){
            this.brand=brand;
            this.speed=speed;
        }

        public void setBrand(String brand){
            this.brand=brand;
        }
        public String getBrand(){
            return brand;
        }
        public void setSpeed(double speed){
            this.speed=speed;
        }
        public double getSpeed(){
            return speed;
        }
        public void move(){
            System.out.println("The"+brand+" vehicle is moving in"+ speed+"km/s");
        }
    }


