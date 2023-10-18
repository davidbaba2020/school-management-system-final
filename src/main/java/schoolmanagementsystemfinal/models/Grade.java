package schoolmanagementsystemfinal.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Grade extends BaseClass{
    private String name;
    private String formTeacherName;
    private String session;
//    private List<Student> classMembers;
}
