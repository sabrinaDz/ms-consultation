package com.sihatech.msconsultation.service.prescriptions;


import com.sihatech.msconsultation.prescription.model.PrescriptionDto;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@Service
@ConfigurationProperties(value="sihatech.prescription",ignoreUnknownFields = false)
public class PrescriptionServiceImpl implements PrescriptionsService{

    public final String PRESCRIPTION_PATH_V1="/api/v1/prescriptions";
    private String prescriptionHost;
    private final RestTemplate restTemplate;

    public PrescriptionServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        restTemplate = restTemplateBuilder.build();
    }

    public void setPrescriptionHost(String prescriptionHost) {
        this.prescriptionHost = prescriptionHost;
    }


    public PrescriptionDto getPrescriptionsByConsultationId(UUID uuid){
        return restTemplate.getForObject(prescriptionHost+PRESCRIPTION_PATH_V1+"/prescriptionsByConsultationId/"+uuid.toString(),PrescriptionDto.class);
    }
}
