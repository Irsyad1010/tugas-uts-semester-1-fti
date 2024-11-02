package BMI;

public class bmi {
    double bmi;
    void setBmi(double bb, double tb) 
         
    {
        bmi = bb / (tb * tb);
    }

    double getBmi() 
        {
        if (bmi < 18)      
        {
             System.out.println("kategori: underweight "
                                
             + " : (konsumsi makanan dengan cukup dan tingkatkan masa otot untuk mencapai BMI yang ideal)");
        }  
        else if (bmi > 18 && bmi <= 24) 
        {
            System.out.println("kategori : normal (berat badan di anggap sehat tetap jaga pola makan dan rutin olahraga)");    
        } 
        else if (bmi > 24 && bmi <= 29)
        {
            System.out.println("kategori :overweight (pertimbangkan perubahan pola makan dan peningkatan aktivitas fisik) ");
        }
        else  if (bmi > 29)
        {
            System.out.println("kategori : obesity (perbaiki pola makan, rutin olahraga, tidur yang cukup, dan perbanyak minum air putih, agar mencapai BMI normal)");
        }
        
        return bmi;
    }
}
