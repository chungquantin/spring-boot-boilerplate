package s3818074_s3818487.cosc2440a2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import s3818074_s3818487.cosc2440a2.models.Person;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {
}
