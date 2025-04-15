package com.jpacourse.mapper;

import com.jpacourse.dto.PatientTO;
import com.jpacourse.persistance.entity.PatientEntity;
import com.jpacourse.persistance.entity.AddressEntity;
import com.jpacourse.persistance.entity.VisitEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class PatientMapper {

    // Entity -> DTO
    public static PatientTO mapToTO(PatientEntity patientEntity) {
        if (patientEntity == null) return null;

        final PatientTO patientTO = new PatientTO();
        patientTO.setId(patientEntity.getId());
        patientTO.setFirstName(patientEntity.getFirstName());
        patientTO.setLastName(patientEntity.getLastName());
        patientTO.setTelephoneNumber(patientEntity.getTelephoneNumber());
        patientTO.setEmail(patientEntity.getEmail());
        patientTO.setPatientNumber(patientEntity.getPatientNumber());
        patientTO.setDateOfBirth(patientEntity.getDateOfBirth());
        patientTO.setAddress(AddressMapper.mapToTO(patientEntity.getAddress()));

        if (patientEntity.getVisits() != null) {
            for (VisitEntity visit : patientTO.getVisits()) {
                patientEntity.getVisits().add(visit);
            }
        }

        return patientTO;
    }

    // DTO -> Entity
    public static PatientEntity mapToEntity(PatientTO patientTO) {
        if (patientTO == null) return null;

        PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(patientTO.getId());
        patientEntity.setFirstName(patientTO.getFirstName());
        patientEntity.setLastName(patientTO.getLastName());
        patientEntity.setTelephoneNumber(patientTO.getTelephoneNumber());
        patientEntity.setEmail(patientTO.getEmail());
        patientEntity.setPatientNumber(patientTO.getPatientNumber());
        patientEntity.setDateOfBirth(patientTO.getDateOfBirth());
        patientEntity.setAddress(AddressMapper.mapToEntity(patientTO.getAddress()));

        if (patientTO.getVisits() != null) {
            for (VisitEntity visit : patientEntity.getVisits()) {
                patientTO.getVisits().add(visit);
            }
        }

        return patientEntity;
    }
}