public class Perpus {
    public String[][] teknologi = {
        {"Kecerdasan Buatan: Pengantar dan Implementasinya", "Budi Santoso", "300", "2020", "Penerbit Teknologi Indonesia"},
        {"Internet of Things: Konsep dan Aplikasi", "Andi Wijaya", "250", "2019", "Penerbit Informatika"},
        {"Blockchain: Dasar-Dasar Teknologi dan Implementasinya", "Dian Utama", "200", "2021", "Penerbit Teknik Komputer"},
        {"Rekayasa Perangkat Lunak: Metode dan Praktikum", "Rudi Susanto", "350", "2018", "Penerbit Informatika"},
        {"Sibersecurity: Ancaman dan Perlindungan", "Cindy Rahayu", "280", "2022", "Penerbit Media Informasi"}
    };    
    public String[][] filsafat = {
        {"Sejarah Filsafat Barat", "Ahmad Zaini", "400", "2017", "Penerbit Ilmu Budaya"},
        {"Pengantar Filsafat: Konsep-Konsep Dasar", "Bambang Widodo", "280", "2019", "Penerbit Universitas Negeri"},
        {"Filsafat Ilmu: Teori, Metode, dan Etika Penelitian", "Retno Wulandari", "320", "2020", "Penerbit Gajah Mada Press"},
        {"Etika: Pendekatan Filsafat dan Praktik", "Haryono Setiadi", "250", "2018", "Penerbit Cakrawala"},
        {"Filsafat Hidup: Memahami Arti dan Makna Kehidupan", "I Wayan Sunarta", "300", "2021", "Penerbit Visimedia"}
    };    
    public String[][] sejarah = {
        {"Sejarah Indonesia: Dari Zaman Batu Hingga Kemerdekaan", "Slamet Muljana", "500", "2016", "Penerbit Kompas"},
        {"Peradaban Mesir Kuno: Kisah Agung Firaun dan Piramida", "Adi Prasetiyo", "350", "2019", "Penerbit Pustaka Sejati"},
        {"Sejarah Asia Tenggara: Perjalanan Bangsa-Bangsa di Nusantara", "I Gede Putra", "400", "2018", "Penerbit Lentera Abadi"},
        {"Sejarah Revolusi Prancis: Perjalanan Menuju Republik", "Ani Susanti", "320", "2020", "Penerbit Cendekia"},
        {"Sejarah Dunia Modern: Dari Perang Dunia I Hingga Globalisasi", "Dwi Purnomo", "450", "2021", "Penerbit Pusaka Budaya"}
    };    
    public String[][] agama = {
        {"Islam: Sejarah dan Ajaran", "Ahmad Dahlan", "300", "2017", "Penerbit Mizan"},
        {"Kristen: Doktrin dan Praktik", "Maria Retno", "280", "2019", "Penerbit Andi Offset"},
        {"Buddha: Filsafat dan Ajaran", "I Ketut Sudarsana", "320", "2020", "Penerbit Kanisius"},
        {"Hindu: Sejarah dan Tradisi", "Made Gde", "250", "2018", "Penerbit Wacana Prima"},
        {"Kepercayaan Lokal: Kearifan Lokal dalam Budaya Nusantara", "Nyoman Wirasuta", "280", "2021", "Penerbit Jogja Media"}
    };    
    public String[][] psikologi = {
        {"Psikologi Kepribadian: Teori dan Pengukuran", "Ratih Dewi", "350", "2016", "Penerbit Salemba Humanika"},
        {"Psikologi Abnormal: Konsep dan Penanganannya", "Ahmad Firmansyah", "280", "2019", "Penerbit Rajawali Press"},
        {"Psikologi Sosial: Teori dan Aplikasi", "Dini Pratiwi", "320", "2020", "Penerbit PT Remaja Rosdakarya"},
        {"Psikologi Pendidikan: Teori dan Praktik", "Indra Gunawan", "250", "2018", "Penerbit Kencana Prenada Media"},
        {"Psikologi Perkembangan: Teori dan Aspeknya", "Ani Wulandari", "280", "2021", "Penerbit Pustaka Cendekia"}
    };    
    public String[][] politik = {
        {"Sistem Politik Indonesia: Struktur dan Dinamika", "Ahmad Sudirman", "300", "2017", "Penerbit Ghalia Indonesia"},
        {"Teori Politik: Konsep-Konsep Dasar", "Andi Suryadi", "280", "2019", "Penerbit Universitas Indonesia Press"},
        {"Politik Global: Tantangan dan Perspektif", "Denny Kartika", "320", "2020", "Penerbit Rineka Cipta"},
        {"Politik Ekonomi: Interaksi antara Kekuasaan dan Ekonomi", "Rina Mahayanti", "250", "2018", "Penerbit Nuansa Cendekia"},
        {"Demokrasi: Teori dan Praktik", "Bambang Susilo", "280", "2021", "Penerbit Djambatan"}
    };    
    public String[][] fiksi = {
        {"Laskar Pelangi", "Andrea Hirata", "400", "2005", "Penerbit Bentang"},
        {"Ayat-Ayat Cinta", "Habiburrahman El Shirazy", "350", "2004", "Penerbit Republika"},
        {"Perahu Kertas", "Dee Lestari", "320", "2008", "Penerbit Bentang"},
        {"Bumi Manusia", "Pramoedya Ananta Toer", "450", "1980", "Penerbit Hasta Mitra"},
        {"Sang Pemimpi", "Andrea Hirata", "380", "2006", "Penerbit Bentang"}
    };    
    public void tampilkankategori(String[][] kategori, String jenisKategori) {
     System.out.printf("\nBuku dalam kategori %s:%n%n", jenisKategori);
            for (int i = 0; i < kategori.length; i++) {
                System.out.printf("Buku ke-%d%n", i+1);
                System.out.printf("1. Nama Buku: %s%n", kategori[i][0]);
                System.out.printf("2. Penulis: %s%n", kategori[i][1]);
                System.out.printf("3. Jumlah Halaman: %s%n", kategori[i][2]);
                System.out.printf("4. Tahun Terbit: %s%n", kategori[i][3]);
                System.out.printf("5. Penerbit: %s%n%n", kategori[i][4]);
            }
    }
}