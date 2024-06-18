package Abstractions;

import Models.Doctor;
import Models.Patient;

public interface Visitor {
    void visit(Patient patient);
    void visit(Doctor doctor);
}

