package march30;

public class test {
    public static void main(String[] args) {
        person p1 = new person("monk",20,"男");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getGender());
        bicycle b1 = new bicycle("xiaomi",5000);
        p1.drive(b1);
        car c1 = new car("xiaomi",5000);
        p1.drive(c1);




    }
}
