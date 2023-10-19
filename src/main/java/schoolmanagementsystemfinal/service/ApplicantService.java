package schoolmanagementsystemfinal.service;

import schoolmanagementsystemfinal.dtos.ApplicantDtoCreate;
import schoolmanagementsystemfinal.dtos.ApplicantDtoReturn;
import schoolmanagementsystemfinal.models.Applicant;

public interface ApplicantService {
    Applicant applicantApply(Applicant applicant);
    String applicantApply(ApplicantDtoCreate applicantDtoCreate);
}
