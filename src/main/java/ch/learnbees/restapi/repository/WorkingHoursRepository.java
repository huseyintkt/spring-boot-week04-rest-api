package ch.learnbees.restapi.repository;

import ch.learnbees.restapi.entity.WorkingHours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface WorkingHoursRepository extends CrudRepository<WorkingHours, Long> {

}
