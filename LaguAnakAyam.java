package tugas_pertemuan_6;
import java.util.Scanner;

public class LaguAnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
// Input jumlah anak ayam
        System.out.print("Masukkan Jumlah Anak Ayam : ");
        int jumlahAnakAyam = scanner.nextInt();
// Menggunakan for loop
        System.out.println("\nMenggunakan Perulangan for loop:");
        for (int i = jumlahAnakAyam; i > 0; i--) {
            System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
        }
// Menggunakan while loop
        System.out.println("\nMenggunakan while loop:");
        int j = jumlahAnakAyam;
        while (j > 0) {
            System.out.println("Anak ayam turun " + j + ", mati satu tinggal " + (j - 1));
            j--;
        }
// Menggunakan do-while loop
        System.out.println("\nMenggunakan Perulangan do-while loop:");
        int k = jumlahAnakAyam;
        do {
            System.out.println("Anak ayam turun " + k + ", mati satu tinggal " + (k - 1));
            k--;
        } while (k > 0);
        scanner.close();
    }
    
}