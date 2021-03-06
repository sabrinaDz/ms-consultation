package com.sihatech.msconsultation.data;


import com.sihatech.msconsultation.prescription.model.PrescriptionDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Consultation {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private LocalDate dateConsultation;

    private  String differentialDiagnosis;
    private String provisionalDiagnosis;
    private String diagnosis;
    private UUID patientId;
    private UUID physicianId;





}
