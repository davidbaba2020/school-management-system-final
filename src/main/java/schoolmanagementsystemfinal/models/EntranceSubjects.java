package schoolmanagementsystemfinal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EntranceSubjects extends BaseClass{
    private double englishScore;
    private double mathematicsScore;
    private double biologyScore;
    private double totalEntranceScore;
}
