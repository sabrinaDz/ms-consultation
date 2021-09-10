package com.sihatech.msconsultation.service;

import com.sihatech.msconsultation.data.Consultation;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface ConsultationService {

    Consultation addNewConsultation(Consultation consultation);
    Consultation getConsultationById(UUID consultationId);
    List<Consultation> getConsultationsByPatientId(UUID patientId);
    List<Consultation> getConsultationsByPhysicianId(UUID physicianId);
    List<Consultation> getConsultationsByDate(Date dateConsultation);
}
