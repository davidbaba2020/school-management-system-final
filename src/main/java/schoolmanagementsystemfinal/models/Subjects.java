package schoolmanagementsystemfinal.models;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Subjects extends BaseClass{
    private String courseTittle;
    private String courseCode;
    private double testScore;
    private double examsScore;
    private double totalScore;
    private String teacherInCharge;
}