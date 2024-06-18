package Subsystems;

public class PatientManagement {
    public void registerPatient(String name) {
        System.out.println("Patient " + name + " registered.");
    }

    public void getPatientDetails(String name) {
        System.out.println("Details for patient " + name);
    }

    public void updatePatientRecord(String name, String record) {
        System.out.println("Record for patient " + name + " updated with: " + record);
    }
}

