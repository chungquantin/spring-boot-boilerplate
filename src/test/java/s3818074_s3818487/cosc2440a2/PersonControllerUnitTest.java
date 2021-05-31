package s3818074_s3818487.cosc2440a2;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import s3818074_s3818487.cosc2440a2.controllers.PersonController;
import s3818074_s3818487.cosc2440a2.models.*;
import s3818074_s3818487.cosc2440a2.repositories.PersonRepository;
import s3818074_s3818487.cosc2440a2.services.PersonService;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class PersonControllerUnitTest extends AbstractControllerUnitTest<Person> {

    @InjectMocks
    @Autowired
    private PersonController controller;

    public PersonControllerUnitTest() {
        super("customers");
    }

    @MockBean
    protected PersonRepository repository;

    @InjectMocks
    @Autowired
    protected PersonService service;

    @BeforeEach
    public void init() {
        setup(controller, service, repository);
    }

    @Override
    protected Person populateData() {
        return new Person(uuid(), "Chung Quan Tin");
    }

    @Override
    protected List<Person> populateListOfData() {
        return Arrays.asList(
                new Person(uuid(), "Tin 1"),
                new Person(uuid(), "Tin 2"),
                new Person(uuid(), "Tin 3"),
                new Person(uuid(), "Tin 4")
        );
    }
}



