package com.sihatech.msconsultation.service.prescriptions;

import com.sihatech.msconsultation.prescription.model.PrescriptionDto;

import java.util.UUID;

public interface PrescriptionsService {
    PrescriptionDto getPrescriptionsByConsultationId(UUID uuid);
}
