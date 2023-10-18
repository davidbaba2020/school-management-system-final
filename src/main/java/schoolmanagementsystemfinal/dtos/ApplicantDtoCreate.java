package schoolmanagementsystemfinal.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import schoolmanagementsystemfinal.enums.GENDER;

@Getter
@Setter
@Builder
public class ApplicantDtoCreate {
    private String levelAppliedFor;
    private String name;
    private Integer age;
    private GENDER gender;
    private String email;
}
