package schoolmanagementsystemfinal.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;
import schoolmanagementsystemfinal.enums.GENDER;
import schoolmanagementsystemfinal.enums.ROLE;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Applicant extends Person{
    @OneToOne(
            cascade = {CascadeType.REMOVE,CascadeType.PERSIST},
            orphanRemoval = true
    )
    private EntranceSubjects entranceSubjects;
    private Double averageEntranceScore;
    private String levelAppliedFor;
    private char grade='O';

    public Applicant(String name, Integer age, GENDER gender, String email, ROLE role,  String levelAppliedFor, char grade) {
        super(name, age, gender, email, role);
        this.levelAppliedFor = levelAppliedFor;
        this.grade = grade;
    }


    public Applicant(PersonBuilder<?, ?> b, String levelAppliedFor, char grade) {
        super(b);
        this.levelAppliedFor = levelAppliedFor;
        this.grade = grade;
    }


    //    private ReportSheet entranceExamsResult;
}
