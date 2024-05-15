public class Employee implements Payable{
    int registrationNumber;
    String name;
    int salaryPerMonth;
    Invoice[] invoices;
    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }
    double total= 0;
    public double getPaymentAmount() {
        for (Invoice invoice : invoices) {
            total += invoice.getPaymentAmount();
        }
        return salaryPerMonth - total;
    }
    public void displayInvoiceDetails() {
        System.out.println("\n=========Invoice Karyawan=========");
        for (Invoice invoice : invoices) {
            System.out.println("\nProduk: " + invoice.productName + "\nJumlah: " + invoice.quantity + "\nHarga: " + invoice.pricePerItem + "\nTotal: " + invoice.getPaymentAmount());
        }
        System.out.println("\nTotal Belanjaan Karyawan: " + total);
    }
    public void displayEmployeeInfo() {
        System.out.println("\n================Data Karyawan================");
        System.out.println("Nomor Registrasi Karyawan: " + registrationNumber + "\nNama Karyawan: " + name + "\nTotal Gaji Perbulan: " + salaryPerMonth);
    }
}