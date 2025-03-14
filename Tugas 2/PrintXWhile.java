import java.util.Scanner;

/* Contoh baca nilai x, */ 
/* Jumlahkan nilai yang dibaca dengan WHILE */  
public class PrintXWhile { 

    public static void main(String[] args) { 
        // Kamus
        int Sum; 
        int x; 
        Scanner masukan = new Scanner(System.in); 
        
        // Program
        Sum = 0; // Inisialisasi 

        System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");  
        x = masukan.nextInt(); // First Element
        
        while (x != 999) { // Kondisi berhenti 
            Sum = Sum + x; // Proses 
            System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");  
            x = masukan.nextInt(); // Next Element
        } 
        
        System.out.println("Hasil penjumlahan = " + Sum); // Terminasi
        
        masukan.close(); // Menutup scanner
    } 
}