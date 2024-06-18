import Facades.ClinicFacade;

public class Main {
    public static void main(String[] args) {
        ClinicFacade clinicFacade = new ClinicFacade();

        clinicFacade.registerNewPatient("John Doe");
        clinicFacade.scheduleNewAppointment("John Doe", "2024-06-15");
        clinicFacade.generatePatientBill("John Doe");
        clinicFacade.processPatientPayment("John Doe", 100.0);
        clinicFacade.getPatientInfo("John Doe");
        clinicFacade.updatePatientRecord("John Doe", "Updated with new allergy information.");
        clinicFacade.cancelPatientAppointment("John Doe", "2024-06-15");
        clinicFacade.reschedulePatientAppointment("John Doe", "2024-06-15", "2024-06-20");
        clinicFacade.printPatientInvoice("John Doe");
    }
}
