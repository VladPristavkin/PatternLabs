package Subsystems;

public class AppointmentScheduling {
    public void scheduleAppointment(String patientName, String date) {
        System.out.println("Appointment scheduled for " + patientName + " on " + date);
    }

    public void cancelAppointment(String patientName, String date) {
        System.out.println("Appointment canceled for " + patientName + " on " + date);
    }

    public void rescheduleAppointment(String patientName, String oldDate, String newDate) {
        System.out.println("Appointment for " + patientName + " rescheduled from " + oldDate + " to " + newDate);
    }
}
