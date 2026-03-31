package march30;

public class dog extends  pet{
    public dog(){
        super();
    }
    public dog(int age,String sex){
        super(age,sex);

    }
    @Override
    public void eat(String gutou){
        System.out.println("吃"+gutou);
    }
    public void lookhouse(){
        System.out.println("看家");
    }
}
