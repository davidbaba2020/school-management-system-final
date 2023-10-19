package schoolmanagementsystemfinal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Builder
@Entity(name = "EntranceSubjects")
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "entrace_subjects_tken")
public class EntranceSubjects extends BaseClass{
    private double englishScore;
    private double mathematicsScore;
    private double biologyScore;
    private double totalEntranceScore;
}
