package schoolmanagementsystemfinal.dtos;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EntranceSubjectsDTo {
    private double englishScore;
    private double mathematicsScore;
    private double biologyScore;
    private double totalEntranceScore;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
