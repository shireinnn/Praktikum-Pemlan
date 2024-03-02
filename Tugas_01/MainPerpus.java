import java.util.Scanner;
public class MainPerpus {
    public static void main(String[] args) {
        System.out.println("=======Perpustakaan=====\n" + "Pilihlah kategori dibawah ini untuk menampilkan buku:\n" 
        + "-teknologi\n" + "-filsafat\n" + "-sejarah\n" + "-agama\n" + "-psikologi\n" + "-politik\n" + "-fiksi\n");
        
        Perpus isi= new Perpus();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kategori buku yang ingin ditampilkan: ");
        String kategori = input.next();

        switch (kategori) {
            case "teknologi":
               isi.tampilkankategori(isi.teknologi, "teknologi");
                break;
            case "filsafat":
                isi.tampilkankategori(isi.filsafat, "filsafat");
                break;
            case "sejarah":
                isi.tampilkankategori(isi.sejarah, "sejarah");
                break;
            case "agama":
                isi.tampilkankategori(isi.agama, "agama");
                break;
            case "psikologi":
                isi.tampilkankategori(isi.psikologi, "psikologi");
                break;
            case "politik":
                isi.tampilkankategori(isi.politik, "politik");
                break;
            case "fiksi":
                isi.tampilkankategori(isi.fiksi, "fiksi");
                break;
            default:
                System.out.println("Kategori tidak ditemukan.");
        }
    }
}
