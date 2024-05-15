import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n============Perusahaan NV. Meneer=============\n");
        System.out.print("Masukkan Nomor Registrasi Karyawan: ");
        int registrationNumber = input.nextInt();
        input.nextLine(); 
        System.out.print("Masukkan Nama Karyawan: ");
        String name = input.nextLine();
        System.out.print("Masukkan Gaji Karyawan Per Bulan: ");
        int salaryPerMonth = input.nextInt();
        input.nextLine();
        System.out.println("\n============Koperasi Perusahaan NV. Meneer=============\n");
        System.out.print("Total Banyaknya Invoice Karyawan: ");
        int numOfInvoices = input.nextInt();
        input.nextLine(); 
        Invoice[] invoices = new Invoice[numOfInvoices];
        for (int i = 0; i < numOfInvoices; i++) {
            System.out.println("\nInvoice ke-" + (i + 1));
            System.out.print("Nama Barang: ");
            String productName = input.nextLine();
            System.out.print("Jumlah: ");
            int quantity = input.nextInt();
            input.nextLine(); 
            System.out.print("Harga Barang: ");
            int pricePerItem = input.nextInt();
            input.nextLine();
            invoices[i] = new Invoice(productName, quantity, pricePerItem);
        }
        Employee employee = new Employee(registrationNumber, name, salaryPerMonth, invoices);
    employee.displayEmployeeInfo();
    System.out.println("Total Gaji Setelah dikurangi Belanjaan: " + employee.getPaymentAmount());
    employee.displayInvoiceDetails();
    }
}