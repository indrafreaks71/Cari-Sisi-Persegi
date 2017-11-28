import java.util.Scanner;
public class carisisi {
public static void main (String args []){
double Sisi,Luas;
Scanner masuk = new Scanner (System.in);
System.out.println("Program Mencari Sisi Bujur Sangkar / Persegi");
System.out.print("Masukkan Luas : ");
Luas = masuk.nextDouble();
        
Sisi = Luas / 2;
System.out.println("Hasil :");
System.out.print("Sisinya Adalah = "+Sisi); 
System.out.println(" x "+Sisi);
System.out.println("=================");
System.out.println("Rumus : L = s x s");
    }
    
}
