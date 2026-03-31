package march30;

import javax.naming.Name;
import javax.naming.NameNotFoundException;

public class test1 {
   public  static void main(String[] args) {

    student s1=new student("zhangsan","male");
    System.out.println(s1.getName());
    System.out.println(s1.getSex());
    yuan y1=new yuan();
    chang c1=new chang();
    s1.show(y1);
    s1.show(c1);


    }

}
