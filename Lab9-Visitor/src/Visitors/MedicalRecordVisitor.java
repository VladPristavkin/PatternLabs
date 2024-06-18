package Visitors;

import Abstractions.Visitor;
import Models.Doctor;
import Models.Patient;

public class MedicalRecordVisitor implements Visitor {
    @Override
    public void visit(Patient patient) {
        System.out.println("Reviewing medical record for patient: " + patient.getName());
        System.out.println("Medical History: " + patient.getMedicalHistory());
    }

    @Override
    public void visit(Doctor doctor) {
        System.out.println("Reviewing doctor profile: " + doctor.getName());
        System.out.println("Specialization: " + doctor.getSpecialization());
    }
}
