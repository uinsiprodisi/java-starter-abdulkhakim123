import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exceotion {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nim: ");
        String nim5tr = input.nextLine();
        int nim = Integer.parseInt(nim5tr);

        System.out.print("Masukkan prodi: ");
        String prodi = input.nextLine();

        System.out.print("Alasan Belajar Java: ");
        String alasan = input.nextLine();

        System.out.print("Halo " + nama + ", dengan NIM" + nim + " Selamat belajar JAVA");
    }
}
