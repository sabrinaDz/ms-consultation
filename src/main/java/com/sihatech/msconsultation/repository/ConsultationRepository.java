package com.sihatech.msconsultation.repository;

import com.sihatech.msconsultation.data.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ConsultationRepository extends JpaRepository<Consultation, UUID> {
}
