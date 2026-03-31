package march25;

public class phone1 extends smartdevice{
    @Override
    public double payment() {

      double  payment = super.payment();
       payment = payment*0.9;
       return payment;


    }
}
