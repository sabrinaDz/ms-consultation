package com.sihatech.msconsultation.service;

import com.sihatech.msconsultation.data.Consultation;
import com.sihatech.msconsultation.repository.ConsultationRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ConsultationServiceImpl implements ConsultationService{

    private ConsultationRepository consultationRepository;

    public ConsultationServiceImpl(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Consultation addNewConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    @Override
    public Consultation getConsultationById(UUID consultationId) {
        return null;
    }

    @Override
    public List<Consultation> getConsultationsByPatientId(UUID patientId) {
        return null;
    }

    @Override
    public List<Consultation> getConsultationsByPhysicianId(UUID physicianId) {
        return null;
    }

    @Override
    public List<Consultation> getConsultationsByDate(Date dateConsultation) {
        return null;
    }
}
