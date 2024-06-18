package Facades;

import Subsystems.AppointmentScheduling;
import Subsystems.Billing;
import Subsystems.MedicalRecords;
import Subsystems.PatientManagement;

public class ClinicFacade {
    private PatientManagement patientManagement;
    private Billing billing;
    private AppointmentScheduling appointmentScheduling;
    private MedicalRecords medicalRecords;

    public ClinicFacade() {
        patientManagement = new PatientManagement();
        billing = new Billing();
        appointmentScheduling = new AppointmentScheduling();
        medicalRecords = new MedicalRecords();
    }

    public void registerNewPatient(String name) {
        patientManagement.registerPatient(name);
        medicalRecords.createRecord(name, "Initial record created.");
    }

    public void scheduleNewAppointment(String name, String date) {
        appointmentScheduling.scheduleAppointment(name, date);
    }

    public void generatePatientBill(String name) {
        billing.generateBill(name);
    }

    public void processPatientPayment(String name, double amount) {
        billing.processPayment(name, amount);
    }

    public void getPatientInfo(String name) {
        patientManagement.getPatientDetails(name);
        medicalRecords.getRecord(name);
    }

    public void updatePatientRecord(String name, String record) {
        patientManagement.updatePatientRecord(name, record);
        medicalRecords.updateRecord(name, record);
    }

    public void cancelPatientAppointment(String name, String date) {
        appointmentScheduling.cancelAppointment(name, date);
    }

    public void reschedulePatientAppointment(String name, String oldDate, String newDate) {
        appointmentScheduling.rescheduleAppointment(name, oldDate, newDate);
    }

    public void printPatientInvoice(String name) {
        billing.printInvoice(name);
    }
}
