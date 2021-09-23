package com.sihatech.msconsultation.repository;

import com.sihatech.msconsultation.data.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, UUID> {

    @Query("select c from Consultation c where c.patientId = :patientId")
    List<Consultation>getConsultationsByPatientId(UUID patientId);

    @Query("select c from Consultation c where c.physicianId = :physicianId")
    List<Consultation> getConsultationsByPhysicianId(UUID physicianId);
}
