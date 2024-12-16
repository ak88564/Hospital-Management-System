package Entity;

import java.util.UUID;

public class Patient {
    String patientId;
    String patientName;
    int fees;
    String feesPayment;

    public Patient(String patientName, int fees, String feesPayment) {
        this.patientId = UUID.randomUUID().toString();
        this.patientName = patientName;
        this.fees = fees;
        this.feesPayment = feesPayment;

    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", patientName='" + patientName + '\'' +
                ", fees=" + fees +
                ", feesPayment='" + feesPayment + '\'' +
                '}';
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getFeesPayment() {
        return feesPayment;
    }

    public void setFeesPayment(String feesPayment) {
        this.feesPayment = feesPayment;
    }
}
