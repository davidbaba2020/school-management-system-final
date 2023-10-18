package schoolmanagementsystemfinal.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ReportSheet extends BaseClass {
    private String name;
    private Date date = new Date();
    private String studentLevel;
//    private Map<String , Double> subjectsSatFor;
    private double averageScore;
    private String teachersRemark;
    private char grade;
}
