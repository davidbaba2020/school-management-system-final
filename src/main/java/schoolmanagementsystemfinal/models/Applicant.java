package schoolmanagementsystemfinal.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "applicant_tbl")
public class Applicant extends Person{
    @OneToOne(
            cascade = {CascadeType.REMOVE,CascadeType.PERSIST},
            orphanRemoval = true
    )
    private EntranceSubjects entranceSubjectsList;
    private Double averageEntranceScore;
    private String levelAppliedFor;
    private char grade='O';

//    private ReportSheet entranceExamsResult;
}
