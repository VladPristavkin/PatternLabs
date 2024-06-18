package Subsystems;

public class Billing {
    public void generateBill(String patientName) {
        System.out.println("Bill generated for " + patientName);
    }

    public void processPayment(String patientName, double amount) {
        System.out.println("Payment of $" + amount + " processed for " + patientName);
    }

    public void printInvoice(String patientName) {
        System.out.println("Invoice printed for " + patientName);
    }
}
