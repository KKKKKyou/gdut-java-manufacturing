package march30;

public class student {
   private String name;
   private String sex;

   public student(){

   }
   public student(String name,String sex){
       this.name=name;
       this.sex=sex;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void show(object o){
        System.out.println("use image");
        if(o instanceof yuan){
            yuan y=(yuan)o;
            o.area();
            o.zhou();
            System.out.println("半径为"+y.getRadius());
        }
        else if(o instanceof chang){
            chang c=(chang)o;
            o.area();
            o.zhou();
            System.out.println("宽为"+c.getKuan());
        }
        else{
            System.out.println("没有这个对象");
        }
    }
}
