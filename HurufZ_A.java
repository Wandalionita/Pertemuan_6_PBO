package tugas_pertemuan_6;

public class HurufZ_A {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("~ Huruf Z - A ~");
        System.out.println("\nMenggunakan Perulangan for :");
        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
        System.out.println("\n\nMenggunakan Perulangan while:");
        char currentChar = 'Z';
        while (currentChar >= 'A') {
            System.out.print(currentChar + " ");
            currentChar--;
        }
        System.out.println("\n\nMenggunakan Perulangan do-while:");
        char doWhileChar = 'Z';
        do {
            System.out.print(doWhileChar + " ");
            doWhileChar--;
        } while (doWhileChar >= 'A');
    }
}

