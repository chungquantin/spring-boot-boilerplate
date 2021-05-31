package s3818074_s3818487.cosc2440a2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import s3818074_s3818487.cosc2440a2.models.Person;
import s3818074_s3818487.cosc2440a2.repositories.PersonRepository;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class PersonService extends AbstractService<Person, UUID> {

    @Autowired
    public PersonService(PersonRepository repo) {
        super(repo);
    }

    @Override
    public Person updateById(Person updatedPerson, UUID id) {
        Optional<Person> customerOptional = repo.findById(id);
        if (customerOptional.isEmpty()) throw new RuntimeException("Customer not found");
        Person person = customerOptional.get();
        person.setName(Optional.ofNullable(updatedPerson.getName()).orElse(person.getName()));
        person.setAddress(Optional.ofNullable(updatedPerson.getAddress()).orElse(person.getAddress()));
        person.setFax(Optional.ofNullable(updatedPerson.getPhone()).orElse(person.getPhone()));
        person.setEmail(Optional.ofNullable(updatedPerson.getEmail()).orElse(person.getEmail()));
        person.setContactPerson(Optional.ofNullable(updatedPerson.getContactPerson()).orElse(person.getContactPerson()));
        return person;
    }
}
