package schoolmanagementsystemfinal.service.serviciveImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import schoolmanagementsystemfinal.dtos.ApplicantDtoCreate;
import schoolmanagementsystemfinal.dtos.ApplicantDtoReturn;
import schoolmanagementsystemfinal.enums.ROLE;
import schoolmanagementsystemfinal.models.Applicant;
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
    public Applicant registerNewApplicantUsingDto(Applicant applicant) {
        log.info("Applicant information,{} ",applicant);
        return applicantRepository.save(applicant);
    }

    @Override
    public ApplicantDtoReturn registerNewApplicantUsingDto(ApplicantDtoCreate applicantDtoCreate) {

        Applicant applicant = new Applicant();
                applicant.setEmail(applicantDtoCreate.getEmail());
                applicant.setName(applicantDtoCreate.getName());
                applicant.setLevelAppliedFor(applicantDtoCreate.getLevelAppliedFor());
                applicant.setAge(applicantDtoCreate.getAge());
                applicant.setRole(ROLE.APPLICANT);

        applicantRepository.saveAndFlush(applicant);

        ApplicantDtoReturn returnedApplicant  = new ApplicantDtoReturn();
        BeanUtils.copyProperties(applicant,returnedApplicant);

        return returnedApplicant;
    }

}
