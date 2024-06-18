import Models.Doctor;
import Models.Patient;
import Visitors.BillingVisitor;
import Visitors.MedicalRecordVisitor;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("John Doe", "Allergic to penicillin");
        Patient patient2 = new Patient("Jane Smith", "Diabetic");

        Doctor doctor1 = new Doctor("Dr. Brown", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Green", "Neurology");

        MedicalRecordVisitor medicalRecordVisitor = new MedicalRecordVisitor();
        BillingVisitor billingVisitor = new BillingVisitor();

        patient1.accept(medicalRecordVisitor);
        patient1.accept(billingVisitor);

        patient2.accept(medicalRecordVisitor);
        patient2.accept(billingVisitor);

        doctor1.accept(medicalRecordVisitor);
        doctor1.accept(billingVisitor);

        doctor2.accept(medicalRecordVisitor);
        doctor2.accept(billingVisitor);
    }
}
