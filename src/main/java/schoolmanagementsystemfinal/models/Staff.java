package schoolmanagementsystemfinal.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import schoolmanagementsystemfinal.enums.CATEGORY;

@Getter
@Setter
@Entity
public class Staff extends Person {
    private String staffRegNo;
    private CATEGORY category;


    public Staff() {
        super();
    }
}