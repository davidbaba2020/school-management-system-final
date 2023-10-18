package schoolmanagementsystemfinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schoolmanagementsystemfinal.models.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {
}
