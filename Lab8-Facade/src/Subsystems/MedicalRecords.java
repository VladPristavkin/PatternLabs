package Subsystems;

public class MedicalRecords {
    public void createRecord(String patientName, String details) {
        System.out.println("Medical record created for " + patientName + " with details: " + details);
    }

    public void updateRecord(String patientName, String details) {
        System.out.println("Medical record for " + patientName + " updated with: " + details);
    }

    public void getRecord(String patientName) {
        System.out.println("Retrieving medical record for " + patientName);
    }
}
