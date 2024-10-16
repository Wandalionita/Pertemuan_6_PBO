package tugas_pertemuan_6;

public class DeretBilangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("- Menghitung Deret bilangan prima dan bukan dari 0 - 20 -");
        System.out.println("BILANGAN PRIMA :");
        for (int i = 0; i <= 20; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nBUKAN BILANGAN PRIMA (Perulangan While) :");
        int j = 0;
        while (j <= 20) {
            if (!isPrima(j)) {
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println("\n\nBUKAN BILANGAN PRIMA (Perulangan do-while) :");
        int k = 0;
        do {
            if (!isPrima(k)) {
                System.out.print(k + " ");
            }
            k++;
        } while (k <= 20);
    }
    static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
