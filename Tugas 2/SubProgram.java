import java.util.Scanner;

/* Contoh program yang mengandung prosedur dan fungsi */ 
public class SubProgram { 

    /** Fungsi untuk mencari maksimum dua bilangan bulat */
    public static int maxab(int a, int b) {  
        return (a >= b) ? a : b; 
    }  
    
    /** Prosedur untuk menukar dua bilangan bulat */
    public static void tukar(int a, int b) { 
        int temp; 
        temp = a; 
        a = b; 
        b = temp; 
        System.out.println("Kedua bilangan setelah tukar: a = " + a + ", b = " + b); 
    } 
    
    /*** Program Utama ***/  
    public static void main(String[] args) { 
        // Membaca dua bilangan integer 
        int a, b;  
        Scanner masukan = new Scanner(System.in); 
        
        System.out.print("Maksimum dua bilangan\n"); 
        System.out.print("Ketikkan dua bilangan, pisahkan dengan RETURN:\n"); 
        
        a = masukan.nextInt(); 
        b = masukan.nextInt(); 
        
        System.out.println("Kedua bilangan: a = " + a + ", b = " + b); 
        System.out.println("Maksimum = " + maxab(a, b)); 
        System.out.print("Tukar kedua bilangan...\n"); 
        
        tukar(a, b);  
        
        masukan.close(); // Menutup scanner
    } 
}