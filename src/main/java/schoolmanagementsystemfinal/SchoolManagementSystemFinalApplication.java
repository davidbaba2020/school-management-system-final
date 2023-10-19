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

//Implementation steps
//    1.Applicant should apply and take exams
//    2. Check if the staff has the right to admit the student as an admin officer
//    2. Applicant should have an average score of 50%
//    3. If not successful report sheet stating so should be created and all performance record
//    4. Placed in a (Added to the class list) class by being offered admission on his/her report sheet and added to the s school student list
//    5. Subjects being allocated to the student
