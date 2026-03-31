package march30;

public class pet {
    private int age;
    private String color;
    public pet(){

    }
    public pet(int age,String color){
        this.age=age;
        this.color=color;
    }
    public void eat (String  food){
        System.out.println("吃"+food);
    }
}
