import java.util.Scanner;

public class Faktorial21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Minta input dari pengguna
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        // Validasi input
        if (n < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long hasil = 1;

            // Hitung faktorial dengan perulangan
            for (int i = 1; i <= n; i++) {
                hasil *= i;
            }

            // Tampilkan hasil
            System.out.println("Faktorial dari " + n + " adalah " + hasil);
        }

        input.close();
    }
}