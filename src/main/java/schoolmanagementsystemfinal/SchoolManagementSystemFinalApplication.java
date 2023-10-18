package schoolmanagementsystemfinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import schoolmanagementsystemfinal.models.Applicant;
import schoolmanagementsystemfinal.models.Grade;
import schoolmanagementsystemfinal.repositories.ApplicantRepository;

@SpringBootApplication
public class SchoolManagementSystemFinalApplication {
	@Autowired
	ApplicantRepository applicantRepository;

	public SchoolManagementSystemFinalApplication(ApplicantRepository applicantRepository) {
		this.applicantRepository = applicantRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementSystemFinalApplication.class, args);

	}
	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			Applicant applicant = new Applicant();
			applicant.setName("Charles");
			applicant.setAge(49);
//			applicant.setGrade('A');
			applicant.setEmail("charles@gmail.com");
			applicantRepository.save(applicant);
		};
	}

}
