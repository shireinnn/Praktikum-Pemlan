package Inheritance ;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kelas Manusia");
        Manusia manusia1 = new Manusia("Eren", "123", true, true);
        System.out.println(manusia1);
        Manusia manusia2 = new Manusia("Fani", "456", false, true);
        System.out.println(manusia2);
        Manusia manusia3 = new Manusia("Shirein", "789", false, false);
        System.out.println(manusia3);
        System.out.println("\nKelas MahasiswaFILKOM");
        MahasiswaFILKOM mahasiswaFILKOM1 = new MahasiswaFILKOM("235150407111035",2.30 , "Aaliyah Shirein", "123", false, false);
        System.out.println(mahasiswaFILKOM1);
        MahasiswaFILKOM mahasiswaFILKOM2 = new MahasiswaFILKOM("235150407111035",3.23 , "Aaliyah Shirein", "123", false, false);
        System.out.println(mahasiswaFILKOM2);
        MahasiswaFILKOM mahasiswaFILKOM3 = new MahasiswaFILKOM("235150407111035",3.93 , "Aaliyah Shirein", "123", false, false);
        System.out.println(mahasiswaFILKOM3);
        System.out.println("\nKelas Pekerja");
        Pekerja pekerja1 = new Pekerja(100, 2022, 1, 1, 2, "Eren", "123", true, true);
        System.out.println(pekerja1);
        Pekerja pekerja2 = new Pekerja(500, 2015, 2, 2, 2, "Fani", "456", true, true);
        System.out.println(pekerja2);
        Pekerja pekerja3 = new Pekerja(800, 2004, 3, 3, 10, "Shirein", "789", false, true);
        System.out.println(pekerja3);
        System.out.println("\nKelas Manager");
        Manager manager = new Manager("HRD", 7500, 2009, 1, 1, 0, "Shirein", "123", true, false);
        System.out.println(manager);
    } 
}

