package Visitors;

import Abstractions.Visitor;
import Models.Doctor;
import Models.Patient;

public class BillingVisitor implements Visitor {
    @Override
    public void visit(Patient patient) {
        System.out.println("Generating bill for patient: " + patient.getName());
    }

    @Override
    public void visit(Doctor doctor) {
        System.out.println("Processing payment for doctor: " + doctor.getName());
    }
}
