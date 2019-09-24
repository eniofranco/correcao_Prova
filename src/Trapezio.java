
public class Trapezio {
    
   private double b = 2.5;
   private double a = 5.5;
   private double h = 5.2;

   public double getA(){
       return this.a;
   }
   public double getB(){
       return this.b;
   }
   public double getH(){
       return this.h;
   }
   
   public void setA(double a1){
       this.a=a1;
   }
   public void setB(double b1){
       this.b=b1;
   }
   public void setH(double h1){
       this.h=h1;
   }
   
   double calcularArea(){
       double A = (a + b) * 2 / h;
       return A;
   }
}

