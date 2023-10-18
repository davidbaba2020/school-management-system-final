package schoolmanagementsystemfinal.models;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
public class Student extends Person{
    private String regNumber;
    private String level;
//    private List<Subjects> subjectsOffering;
    private int strike;


    public Student() {
        super();
    }
}
