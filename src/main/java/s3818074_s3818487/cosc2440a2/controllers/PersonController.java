package s3818074_s3818487.cosc2440a2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import s3818074_s3818487.cosc2440a2.models.Person;
import s3818074_s3818487.cosc2440a2.services.PersonService;

import java.util.UUID;

@RestController
@RequestMapping("/customers")
public class PersonController extends AbstractController<Person, UUID> {

    @Autowired
    public PersonController(PersonService service) {
        super(service);
    }
}
