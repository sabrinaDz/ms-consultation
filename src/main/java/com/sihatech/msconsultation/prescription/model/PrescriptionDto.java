package com.sihatech.msconsultation.prescription.model;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;


public class PrescriptionDto {

    private List<Prescription> prescriptionList;

    public PrescriptionDto() {
    }

    public PrescriptionDto(List<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }

    public List<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(List<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }
}
