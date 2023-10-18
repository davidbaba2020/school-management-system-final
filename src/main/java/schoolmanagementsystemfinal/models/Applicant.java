package schoolmanagementsystemfinal.models;

import jakarta.persistence.Entity;
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
//    private List<EntranceSubjects> entranceSubjectsList;
    private Double averageEntranceScore;
    private String levelAppliedFor;
    private char grade='O';


//    private ReportSheet entranceExamsResult;
}
