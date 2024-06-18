package Models;

import Abstractions.Visitable;
import Abstractions.Visitor;

public class Doctor implements Visitable {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
