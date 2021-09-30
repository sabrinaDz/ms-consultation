package com.sihatech.msconsultation.data;

import com.sihatech.msconsultation.prescription.model.PrescriptionDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ConsultationDto {

    private UUID id;

    private PrescriptionDto prescriptionDto;

}
