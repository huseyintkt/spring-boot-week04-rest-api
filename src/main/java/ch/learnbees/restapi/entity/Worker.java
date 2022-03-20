package ch.learnbees.restapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String type;

    public Worker() {}

    public Worker(String firstName, String lastName, String type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
    }
}
