package schoolmanagementsystemfinal.service;

import schoolmanagementsystemfinal.dtos.ApplicantDtoCreate;
import schoolmanagementsystemfinal.dtos.ApplicantDtoReturn;
import schoolmanagementsystemfinal.models.Applicant;

public interface ApplicantService {
    Applicant registerNewApplicantUsingDto(Applicant applicant);
    ApplicantDtoReturn registerNewApplicantUsingDto(ApplicantDtoCreate applicantDtoCreate);
}
