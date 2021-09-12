package com.sihatech.msconsultation.web.controller;


import com.sihatech.msconsultation.data.Consultation;
import com.sihatech.msconsultation.repository.ConsultationRepository;
import com.sihatech.msconsultation.service.ConsultationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/consultations")
@Slf4j
public class ConsultationController {

    private ConsultationService consultationService;


    public ConsultationController(ConsultationService consultationService) {
        this.consultationService=consultationService;    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Consultation addNewConsultation(@RequestBody Consultation consultation){
        return consultationService.addNewConsultation(consultation);
    }

}
