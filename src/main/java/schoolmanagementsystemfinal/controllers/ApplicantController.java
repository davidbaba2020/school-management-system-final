package schoolmanagementsystemfinal.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import schoolmanagementsystemfinal.dtos.ApplicantDtoCreate;
import schoolmanagementsystemfinal.dtos.ApplicantDtoReturn;
import schoolmanagementsystemfinal.models.Applicant;
import schoolmanagementsystemfinal.service.ApplicantService;

@RestController
@RequestMapping("/applicant")
public class ApplicantController {

    @Autowired
    ApplicantService applicantService;

    public ApplicantController(ApplicantService applicantService) {
        this.applicantService = applicantService;
    }

    @GetMapping("/test")
    public String testController() {
        return "Huraaay, my api is workin";
    }

    @PostMapping("/register_applicant")
    public Applicant registerApplicant(@RequestBody Applicant applicant) {
        return applicantService.registerNewApplicantUsingDto(applicant);
    }


    @PostMapping("/register_applicant_dto")
    public ApplicantDtoReturn registerApplicantUsingDto(@RequestBody ApplicantDtoCreate applicant) {
        return applicantService.registerNewApplicantUsingDto(applicant);
    }


}
