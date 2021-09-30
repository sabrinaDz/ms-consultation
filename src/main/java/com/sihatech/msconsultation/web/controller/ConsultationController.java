package com.sihatech.msconsultation.web.controller;


import com.sihatech.msconsultation.data.Consultation;
import com.sihatech.msconsultation.data.ConsultationDto;
import com.sihatech.msconsultation.prescription.model.PrescriptionDto;
import com.sihatech.msconsultation.repository.ConsultationRepository;
import com.sihatech.msconsultation.service.ConsultationService;
import com.sihatech.msconsultation.service.prescriptions.PrescriptionsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/consultations")
@Slf4j
public class ConsultationController {

    private ConsultationService consultationService;
    private PrescriptionsService prescriptionsService;


    public ConsultationController(ConsultationService consultationService, PrescriptionsService prescriptionsService) {
        this.consultationService = consultationService;
        this.prescriptionsService = prescriptionsService;
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Consultation addNewConsultation(@RequestBody Consultation consultation){
        return consultationService.addNewConsultation(consultation);
    }

    @GetMapping("/{consultationId}")
    public ResponseEntity<Consultation>getConsultationById(@PathVariable("consultationId") UUID consultationId){
        return new ResponseEntity<Consultation>(consultationService.getConsultationById(consultationId),HttpStatus.OK);
    }

    @GetMapping("/consultationsByPatientId/{patientId}")
    public ResponseEntity<List<Consultation>>getConsultationsByPatientId(@PathVariable("patientId") UUID patientId){
        return new ResponseEntity<List<Consultation>>(consultationService.getConsultationsByPatientId(patientId),HttpStatus.OK);
    }

    @GetMapping("/consultationsByPhysicianId/{physicianId}")
        public ResponseEntity<List<Consultation>>getConsultationsByPhysiciansId(@PathVariable("physicianId") UUID physiciansId){
        return new ResponseEntity<List<Consultation>>(consultationService.getConsultationsByPhysicianId(physiciansId),HttpStatus.OK);
    }

    @GetMapping("/detailsConsultation/{consultationId}")
    public ResponseEntity<ConsultationDto>getConsultationDetailsByConsultationId(@PathVariable("consultationId") UUID consultationId){
        PrescriptionDto prescriptions=prescriptionsService.getPrescriptionsByConsultationId(consultationId);
        ConsultationDto consultationDto=new ConsultationDto();
        consultationDto.setId(consultationId);
        consultationDto.setPrescriptionDto(prescriptions);
        return new ResponseEntity<>(consultationDto,HttpStatus.OK);
    }
}
