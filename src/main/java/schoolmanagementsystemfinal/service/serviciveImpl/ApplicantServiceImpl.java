package schoolmanagementsystemfinal.service.serviciveImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import schoolmanagementsystemfinal.dtos.ApplicantDtoCreate;
import schoolmanagementsystemfinal.enums.ROLE;
import schoolmanagementsystemfinal.models.Applicant;
import schoolmanagementsystemfinal.models.EntranceSubjects;
import schoolmanagementsystemfinal.repositories.ApplicantRepository;
import schoolmanagementsystemfinal.service.ApplicantService;

@Service
@Slf4j
public class ApplicantServiceImpl implements ApplicantService {

    @Autowired
    ApplicantRepository applicantRepository;

    public ApplicantServiceImpl(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    @Override
    public Applicant applicantApply(Applicant applicant) {
        log.info("Applicant information,{} ",applicant);
        return applicantRepository.save(applicant);
    }

    @Override
    public String applicantApply(ApplicantDtoCreate applicantDtoCreate) {
        String msg = "";
        Applicant applicant = new Applicant();
                applicant.setEmail(applicantDtoCreate.getEmail());
                applicant.setName(applicantDtoCreate.getName());
                applicant.setLevelAppliedFor(applicantDtoCreate.getLevelAppliedFor());
                applicant.setAge(applicantDtoCreate.getAge());

                EntranceSubjects entranceSubjects = EntranceSubjects.builder()
                        .biologyScore(0.00)
                        .englishScore(0.00)
                        .mathematicsScore(0.00)
                        .totalEntranceScore(0.00)
                        .build();

                applicant.setEntranceSubjects(entranceSubjects);
                applicant.setRole(ROLE.APPLICANT);

                if(!applicant.equals(null)) {
                    msg="You have successfully registered, prepare for your entrance exams";
                }
            applicantRepository.saveAndFlush(applicant);


        return msg;
    }

}

