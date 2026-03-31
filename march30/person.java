package march30;

public class person {
    private  String name;
    private int age;
    private String gender;
    public person(){

    }
    public person(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void drive(vehicle v){

        v.move();
        if(v instanceof bicycle){
            bicycle b=(bicycle)v;
            b.ring();
        }
       else if(v instanceof car){
           car c=(car)v;
           c.honk();
        }
       else{
            System.out.println("没有这个对象");
        }
    }
}
