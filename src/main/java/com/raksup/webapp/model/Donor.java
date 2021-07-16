package com.raksup.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "donors")
public class Donor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private String address;
	
	@Column(nullable = false)
	private int age;
	
	@Column(nullable = false, unique = true)
	private String phoneNumber;
	
	@Column(nullable = false)
	private String bloodGroup;

	@Override
	public String toString() {
		return "Donor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", age=" + age + ", phoneNumber=" + phoneNumber + ", bloodGroup=" + bloodGroup + "]";
	}

	

}
