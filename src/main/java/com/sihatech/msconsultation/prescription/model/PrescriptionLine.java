package com.sihatech.msconsultation.prescription.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class PrescriptionLine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String tradeName;
    private String genericName;
    private String note;

    @ManyToOne
    private Prescription prescription;


}
