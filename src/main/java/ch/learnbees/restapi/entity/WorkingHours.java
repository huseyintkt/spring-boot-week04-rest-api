package ch.learnbees.restapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class WorkingHours {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int weekNumber;

    private Double hour;

    @ManyToOne
    private Worker worker;

    public WorkingHours(){};

    public WorkingHours(Worker worker, int weekNumber, Double hour) {
        this.worker = worker;
        this.weekNumber = weekNumber;
        this.hour = hour;
    }
}
