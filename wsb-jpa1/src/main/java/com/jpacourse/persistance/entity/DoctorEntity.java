package com.jpacourse.persistance.entity;

import com.jpacourse.persistance.enums.Specialization;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "DOCTOR")
public class DoctorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private String telephoneNumber;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String doctorNumber;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Specialization specialization;


	// RELACJE
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ADDRESS_ID")
	private AddressEntity adress;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "DOCTOR_ID")
	private ArrayList<VisitEntity> visits;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDoctorNumber() {
		return doctorNumber;
	}

	public void setDoctorNumber(String doctorNumber) {
		this.doctorNumber = doctorNumber;
	}

	public Specialization getSpecialization() {
		return specialization;
	}

	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}

	public AddressEntity getAdress() {
		return adress;
	}

	public void setAdress(AddressEntity adress) {
		this.adress = adress;
	}

	public ArrayList<VisitEntity> getVisits() {
		return visits;
	}

	public void setVisits(ArrayList<VisitEntity> visits) {
		this.visits = visits;
	}
}
