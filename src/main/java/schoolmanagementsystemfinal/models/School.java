package schoolmanagementsystemfinal.models;

import lombok.*;

import java.util.List;


@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class School extends BaseClass{
    private String name;
//    private List<Student> studentInThisSchool;
//    private List<Staff> staffInThisSchool;
//    private List<Subjects> subjectsThisSchool;
}
