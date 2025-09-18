import java.util.Scanner;

public class SistemKantin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kantin kantin = new Kantin();

        // Tambah menu awal
        kantin.tambahMakanan(new Makanan("Nasi Goreng", 15000));
        kantin.tambahMakanan(new Makanan("Ayam Geprek", 18000));
        kantin.tambahMakanan(new Makanan("Es Teh", 5000));

        boolean jalan = true;
        while (jalan) {
            System.out.println("\n=== MENU KANTIN ===");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Beli Makanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    kantin.tampilkanMenu();
                    break;
                case 2:
                    kantin.tampilkanMenu();
                    System.out.print("Pilih nomor makanan (pisahkan dengan spasi, akhiri dengan 0): ");
                    sc.nextLine(); // buang newline
                    String[] input = sc.nextLine().split(" ");
                    int[] pesanan = new int[input.length];
                    int j = 0;
                    for (String s : input) {
                        int idx = Integer.parseInt(s);
                        if (idx == 0) break;
                        pesanan[j++] = idx;
                    }
                    int total = kantin.hitungTotal(pesanan);
                    System.out.println("Total bayar: Rp" + total);
                    break;
                case 0:
                    jalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        sc.close();
    }
}
