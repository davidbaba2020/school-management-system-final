package schoolmanagementsystemfinal.dtos;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import schoolmanagementsystemfinal.enums.GENDER;
import schoolmanagementsystemfinal.enums.ROLE;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApplicantDtoReturn {
    private String name;
    private Integer age;
    private GENDER gender;
    private String email;
    private ROLE role;
    private String levelAppliedFor;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
