package march30;

public class chang extends  object{
   private double kuan=2;
   private double gao=2;

   public chang(){

   }
   public chang(double kuan,double gao){
       this.kuan=kuan;
       this.gao=gao;
   }
    public double getKuan() {
        return kuan;
    }

    public void setKuan(double kuan) {
        this.kuan = kuan;
    }

    public double getGao() {
        return gao;
    }

    public void setGao(double gao) {
        this.gao = gao;

    }
    @Override
    public void area(){
        System.out.println("长方形的面积是"+kuan*gao);
    }
    public void zhou(){
        System.out.println("长方形的周长是"+2*(kuan+gao));
    }
}
