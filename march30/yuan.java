package march30;

public class yuan extends  object{
    private double radius=2;
    private double pai=3;

    public yuan(){

    }

    public yuan(double radius,double pai){
        this.radius=radius;
        this.pai=pai;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPai() {
        return pai;
    }

    public void setPai(double pai) {
        this.pai = pai;
    }
    @Override
    public void area(){
        System.out.println("圆的面积是"+pai*radius*radius);
    }
    public void zhou(){
        System.out.println("圆的周长是"+2*pai*radius);
    }
}
