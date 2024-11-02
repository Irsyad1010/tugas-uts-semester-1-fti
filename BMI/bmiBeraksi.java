
package BMI;

public class bmiBeraksi {
   public static void main(String[]args)
   {
       bmi bmiKu = new bmi();
    
       bmiKu.setBmi(80, 1.50);
        System.out.println("ukuran BMI pria"); 
        System.out.println("BMI saya: "+Math.round(bmiKu.getBmi()));
        System.out.println();
   
   
   }
}
