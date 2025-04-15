package com.jpacourse.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class VisitTO implements Serializable {
    private Long id;
    private String description;
    private LocalDateTime time;

    // TODO dodaj póniej doktorkz
    //private DoctorTO doctor;
    // Include patient details if needed for visit-specific context

    private PatientTO patient;

    public VisitTO() {}

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    // TODO dokończ doktorka
//    public DoctorTO getDoctor() {
//        return doctor;
//    }
//
//    public void setDoctor(DoctorTO doctor) {
//        this.doctor = doctor;
//    }

    public PatientTO getPatient() {
        return patient;
    }

    public void setPatient(PatientTO patient) {
        this.patient = patient;
    }
}
