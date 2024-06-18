package Models;

import Abstractions.Visitable;
import Abstractions.Visitor;

public class Patient implements Visitable {
    private String name;
    private String medicalHistory;

    public Patient(String name, String medicalHistory) {
        this.name = name;
        this.medicalHistory = medicalHistory;
    }

    public String getName() {
        return name;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
