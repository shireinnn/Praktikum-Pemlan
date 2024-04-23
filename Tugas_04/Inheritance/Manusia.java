package Inheritance;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;
    public Manusia() {
    } 
    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public boolean getJenisKelamin() {
        return jenisKelamin;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getNik() {
        return nik;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    public boolean getMenikah() {
        return menikah;
    }
    public double getTunjangan() {
        if (getMenikah()) {
            if (getJenisKelamin()) {
                return 25.0;
            } else {
                return 20.0;
            }
        } else {
            return 15.0;
        }
    }
    public double getPendapatan() {
        return getTunjangan();
    }
    public String toString() {
        String jenisKelaminUser = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        return "\nNama\t\t: " + nama + "\nNIK\t\t: " + nik + "\nJenis Kelamin\t: " + jenisKelaminUser + "\nPendapatan\t: $" + getPendapatan();
    }
}
