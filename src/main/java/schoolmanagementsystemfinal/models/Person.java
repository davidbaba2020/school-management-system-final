package schoolmanagementsystemfinal.models;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import schoolmanagementsystemfinal.enums.GENDER;
import schoolmanagementsystemfinal.enums.ROLE;

@Getter
@Setter
@SuperBuilder
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person extends BaseClass{
    private String name;
    private Integer age;
    private GENDER gender;
    private String email;
    private ROLE role;
}
