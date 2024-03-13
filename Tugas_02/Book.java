public class Book {
    private String judul;
    private String penulis;
    private int jumlahhal;
    private int tahun;
    private String penerbit;
    private String sinopsis;
    public Book(){
    }
    public Book (String judul, String penulis, int jumlahhal,int tahun,String penerbit,String sinopsis){
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahhal = jumlahhal;
        this.tahun = tahun;
        this.penerbit = penerbit;
        this.sinopsis = sinopsis;
    }
    public int hitungsinopsis() {
        String[] kata = sinopsis.split(" ");
        return kata.length;
    }
    public void tampilkankategori(){
        System.out.println("1. Judul buku: " +judul);
        System.out.println("2. Penulis: " + penulis);
        System.out.println("3. Jumlah Halaman: " + jumlahhal);
        System.out.println("4. Tahun Terbit: " + tahun);
        System.out.println("5. Penerbit: " + penerbit);
        System.out.println("6. Sinopsis: " + sinopsis);
        System.out.println("7. Jumlah kata di sinopsis: " + hitungsinopsis());
    }
    public void isi(Book[] kategori){
        int i = 0;
        for (Book buku : kategori) {
            i++;
            if (i <= kategori.length) 
                System.out.println("\nBuku ke-" + i);
            buku.tampilkankategori();
        }
    } 
}