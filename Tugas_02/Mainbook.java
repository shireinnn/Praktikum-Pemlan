import java.util.Scanner;
public class Mainbook{
    public static void main(String[] args) {
        System.out.println("=======Perpustakaan=====\n" + "Pilihlah kategori dibawah ini untuk menampilkan buku:\n" 
        + "-teknologi\n" + "-filsafat\n" + "-sejarah\n" + "-agama\n" + "-psikologi\n" + "-politik\n" + "-fiksi\n");
        Book isi= new Book();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kategori buku yang ingin ditampilkan: ");
        String kategori = input.next();
        switch (kategori) {
            case "teknologi":
                Book buku1teknologi = new Book("Kecerdasan Buatan: Pengantar dan Implementasinya", "Budi Santoso", 300, 2020, "Penerbit Teknologi Indonesia","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku2teknologi = new Book("Internet of Things: Konsep dan Aplikasi", "Andi Wijaya", 250, 2019, "Penerbit Informatika","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku3teknologi = new Book("Blockchain: Dasar-Dasar Teknologi dan Implementasinya", "Dian Utama", 200, 2021, "Penerbit Teknik Komputer","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku4teknologi = new Book("Rekayasa Perangkat Lunak: Metode dan Praktikum", "Rudi Susanto", 350, 2018, "Penerbit Informatika","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku5teknologi = new Book("Sibersecurity: Ancaman dan Perlindungan", "Cindy Rahayu", 280, 2022, "Penerbit Media Informasi","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book[] teknologi = {buku1teknologi, buku2teknologi, buku3teknologi, buku4teknologi, buku5teknologi};
                isi.isi(teknologi);
                break;
            case "filsafat":
                Book buku1filsafat = new Book("Sejarah Filsafat Barat", "Ahmad Zaini", 400, 2017, "Penerbit Ilmu Budaya","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku2filsafat = new Book("Pengantar Filsafat: Konsep-Konsep Dasar", "Bambang Widodo", 280, 2019, "Penerbit Universitas Negeri","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku3filsafat = new Book("Filsafat Ilmu: Teori, Metode, dan Etika Penelitian", "Retno Wulandari", 320, 2020, "Penerbit Gajah Mada Press","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku4filsafat = new Book("Etika: Pendekatan Filsafat dan Praktik", "Haryono Setiadi", 250, 2018, "Penerbit Cakrawala","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku5filsafat = new Book("Filsafat Hidup: Memahami Arti dan Makna Kehidupan", "I Wayan Sunarta", 300, 2021, "Penerbit Visimedia","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book[] filsafat = {buku1filsafat, buku2filsafat, buku3filsafat, buku4filsafat, buku5filsafat};
                isi.isi(filsafat);
                break;
            case "sejarah":
                Book buku1sejarah = new Book("Sejarah Indonesia: Dari Zaman Batu Hingga Kemerdekaan", "Slamet Muljana", 500, 2016, "Penerbit Kompas","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku2sejarah = new Book("Peradaban Mesir Kuno: Kisah Agung Firaun dan Piramida", "Adi Prasetiyo", 350, 2019, "Penerbit Pustaka Sejati","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku3sejarah = new Book("Sejarah Asia Tenggara: Perjalanan Bangsa-Bangsa di Nusantara", "I Gede Putra", 400, 2018, "Penerbit Lentera Abadi","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku4sejarah = new Book("Sejarah Revolusi Prancis: Perjalanan Menuju Republik", "Ani Susanti", 320, 2020, "Penerbit Cendekia","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku5sejarah = new Book("Sejarah Dunia Modern: Dari Perang Dunia I Hingga Globalisasi", "Dwi Purnomo", 450, 2021, "Penerbit Pusaka Budaya","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book[] sejarah = {buku1sejarah, buku2sejarah, buku3sejarah, buku4sejarah, buku5sejarah};
                isi.isi(sejarah);
                break;
            case "agama":
                Book buku1agama = new Book("Islam: Sejarah dan Ajaran", "Ahmad Dahlan", 300, 2017, "Penerbit Mizan","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku2agama = new Book("Kristen: Doktrin dan Praktik", "Maria Retno", 280, 2019, "Penerbit Andi Offset","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku3agama = new Book("Buddha: Filsafat dan Ajaran", "I Ketut Sudarsana", 320, 2020, "Penerbit Kanisius","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku4agama = new Book("Hindu: Sejarah dan Tradisi", "Made Gde", 250, 2018, "Penerbit Wacana Prima","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku5agama = new Book("Kepercayaan Lokal: Kearifan Lokal dalam Budaya Nusantara", "Nyoman Wirasuta", 280, 2021, "Penerbit Jogja Media","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book[] agama = {buku1agama, buku2agama, buku3agama, buku4agama, buku5agama};
                isi.isi(agama);
                break;
            case "psikologi":
                Book buku1psikologi = new Book("Psikologi Kepribadian: Teori dan Pengukuran", "Ratih Dewi", 350, 2016, "Penerbit Salemba Humanika","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku2psikologi = new Book("Psikologi Abnormal: Konsep dan Penanganannya", "Ahmad Firmansyah", 280, 2019, "Penerbit Rajawali Press","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku3psikologi = new Book("Psikologi Sosial: Teori dan Aplikasi", "Dini Pratiwi", 320, 2020, "Penerbit PT Remaja Rosdakarya","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku4psikologi = new Book("Psikologi Pendidikan: Teori dan Praktik", "Indra Gunawan", 250, 2018, "Penerbit Kencana Prenada Media","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku5psikologi = new Book("Psikologi Perkembangan: Teori dan Aspeknya", "Ani Wulandari", 280, 2021, "Penerbit Pustaka Cendekia","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book[] psikologi = {buku1psikologi, buku2psikologi, buku3psikologi, buku4psikologi, buku5psikologi};
                isi.isi(psikologi);
                break;
            case "politik":
                Book buku1politik = new Book("Sistem Politik Indonesia: Struktur dan Dinamika", "Ahmad Sudirman", 300, 2017, "Penerbit Ghalia Indonesia","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku2politik = new Book("Teori Politik: Konsep-Konsep Dasar", "Andi Suryadi", 280, 2019, "Penerbit Universitas Indonesia Press","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku3politik = new Book("Politik Global: Tantangan dan Perspektif", "Denny Kartika", 320, 2020, "Penerbit Rineka Cipta","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku4politik = new Book("Politik Ekonomi: Interaksi antara Kekuasaan dan Ekonomi", "Rina Mahayanti", 250, 2018, "Penerbit Nuansa Cendekia","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku5politik = new Book("Demokrasi: Teori dan Praktik", "Bambang Susilo", 280, 2021, "Penerbit Djambatan","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book[] politik = {buku1politik, buku2politik, buku3politik, buku4politik, buku5politik};
                isi.isi(politik);
                break;
            case "fiksi":
                Book buku1fiksi = new Book("Laskar Pelangi", "Andrea Hirata", 400, 2005, "Penerbit Bentang","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku2fiksi = new Book("Ayat-Ayat Cinta", "Habiburrahman El Shirazy", 350, 2004, "Penerbit Republika","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku3fiksi = new Book("Perahu Kertas", "Dee Lestari", 320, 2008, "Penerbit Bentang","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku4fiksi = new Book("Bumi Manusia", "Pramoedya Ananta Toer", 450, 1980, "Penerbit Hasta Mitra","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book buku5fiksi = new Book("Sang Pemimpi", "Andrea Hirata", 380, 2006, "Penerbit Bentang","Lorem ipsum dolor sit, amet consectetur adipisicing elit. Porro, vel,");
                Book[] fiksi = {buku1fiksi, buku2fiksi, buku3fiksi, buku4fiksi, buku5fiksi};
                isi.isi(fiksi);
                break;    
            default:
                System.out.println("Kategori tidak ditemukan.");
        }
    }
}
