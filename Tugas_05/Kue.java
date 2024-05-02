public abstract class Kue{
    private String nama;
    private double harga;
    abstract double hitungHarga();
    public Kue(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }  
    public void setHarga(double harga){
        this.harga = harga;
    }
    public double getHarga(){
        return harga;
    }
    public String toString(){
        String data = "Nama\t: " + nama + "\n";
        if(this instanceof KuePesanan) {
            data+= "Harga\t: Rp " + harga + "\nJenis\t: Kue Pesanan";
        } else if(this instanceof KueJadi) {
            data += "Harga\t: Rp " + harga + "\nJenis\t: Kue Jadi";
        }
        return data;
    }
}
