package s3818074_s3818487.cosc2440a2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "people")
public class Person extends BaseEntity {
    @Column
    private String name;

    public Person() {
    }

    public Person(UUID id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
