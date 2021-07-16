package com.raksup.webapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.raksup.webapp.dao.DonorRepository;
import com.raksup.webapp.model.Donor;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class DonorRepositoryTests {
	@Autowired
	private DonorRepository donorRepo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateDonor() {
		
		Donor donor = new Donor();
		donor.setFirstName("Roshan");
		donor.setLastName("Pandey");
		donor.setAddress("Kathmandu");
		donor.setAge(26);
		donor.setPhoneNumber("9841414141");
		donor.setBloodGroup("A+");
		
		Donor savedDonor = donorRepo.save(donor);
		
//		Donor existDonor = entityManager.find(Donor.class, savedDonor.getPhoneNumber());
//
//		assertThat(existDonor.getPhoneNumber()).isEqualTo(donor.getPhoneNumber());
	}

}
