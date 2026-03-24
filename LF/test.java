package LF;

public class test {
    public static void main(String[] args) {
        student s=new student();
        s.setName("mok");
        s.setAge(18);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        student o=new student("e",18);
        System.out.println(o.getName());
        System.out.println(o.getAge());

    }
}
