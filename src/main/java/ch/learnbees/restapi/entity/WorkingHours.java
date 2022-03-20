package ch.learnbees.restapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class WorkingHours {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Worker worker;

    private int weekNumber;

    private Double hour;
}
