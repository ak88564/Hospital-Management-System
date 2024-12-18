package Entity;

import java.util.UUID;

public class Patient {
    String patientId;
    String patientName;
//    int fees;
//    String feesPayment;

    public Patient(String patientName) {
        this.patientId = UUID.randomUUID().toString();
        this.patientName = patientName;

    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", patientName='" + patientName + '\'' +
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

}
