package com.sihatech.msconsultation.prescription.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String info;
    private UUID consultationId;

    @OneToMany(mappedBy = "prescription", cascade = CascadeType.ALL)
    @Fetch(FetchMode.JOIN)
    private Set<PrescriptionLine> prescriptionLineSet;
}
