public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = {
                new KueJadi("Klepon", 3000.0, 1.0),
                new KuePesanan("Onde-onde", 8000, 1.5),
                new KueJadi("Dadar Gulung", 3000.0, 1.0),
                new KuePesanan("Kue Lapis", 80000, 1.0),
                new KueJadi("Kue Lumpur", 3000.0, 2.0),
                new KuePesanan("Kue Cubit", 80000, 1.5),
                new KueJadi("Kue Mangkok", 3000.0, 1.0),
                new KuePesanan("Putri Salju", 18000, 0.5),
                new KueJadi("Brownies", 35000, 2),
                new KuePesanan("Kue Cubit", 80000, 1.5),
                new KuePesanan("Bolu Gulung", 22000, 1.2),
                new KueJadi("Kue Talam", 15000, 4),
                new KuePesanan("Kue Lapis", 45000, 1.5),
                new KueJadi("Kue Mangkok", 12000, 12),
                new KuePesanan("Kue Putri Salju", 18000, 1),
                new KueJadi("Nastar", 30000, 20),
                new KuePesanan("Putri Salju", 18000, 1),
                new KueJadi("Lapis Legit", 40000, 1),
                new KuePesanan("Sus Kue", 2000, 0.8),
                new KueJadi("Brownies", 35000, 2),
        };
        for (int i = 0; i < daftarKue.length; i++) {
            System.out.println(daftarKue[i] + "\n");
        }
        double total = 0;
        double totalHargaKuePesanan = 0;
        double totalHargaKueJadi = 0;
        double totalBerat = 0;
        double totalJumlah = 0;
        for (int i = 0; i < daftarKue.length; i++) {
            total += daftarKue[i].hitungHarga();
            if(daftarKue[i] instanceof KuePesanan) {
                totalHargaKuePesanan += daftarKue[i].hitungHarga();
                totalBerat += ((KuePesanan)daftarKue[i]).getBerat();
            } else if(daftarKue[i] instanceof KueJadi) {
                totalHargaKueJadi += daftarKue[i].hitungHarga();
                totalJumlah += ((KueJadi)daftarKue[i]).getJumlah();
            }
        }
        System.out.println("=============[STATS]=============");
        System.out.println("TOTAL HARGA SEMUA KUE\t: Rp " + total);
        System.out.println("\nTOTAL HARGA KUE PESANAN\t: Rp " + totalHargaKuePesanan);
        System.out.println("TOTAL BERAT KUE PESANAN\t: " + totalBerat + " gram");
        System.out.println("\nTOTAL HARGA KUE JADI\t: Rp " + totalHargaKueJadi);
        System.out.println("TOTAL JUMLAH KUE JADI\t: " + totalJumlah + " buah");
        double hargaTertinggi = 0;
        String namaKueTertinggi = "";
        String jenisKueTertinggi = "";
        for (int i = 0; i < daftarKue.length; i++) {
            if(daftarKue[i].hitungHarga() > hargaTertinggi) {
                hargaTertinggi = daftarKue[i].hitungHarga();
                namaKueTertinggi = daftarKue[i].getNama();
                jenisKueTertinggi = (daftarKue[i] instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi";
            }
        }
        System.out.println("\nKUE DENGAN HARAGA TERTINGGI");
        System.out.println("Berdasarkan Jenis\t: " + jenisKueTertinggi);
        System.out.println("Berdasarkan Nama Kue\t: " + namaKueTertinggi);
    }
}
