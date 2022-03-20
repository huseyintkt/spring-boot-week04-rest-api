package ch.learnbees.restapi.repository;

import ch.learnbees.restapi.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface WorkerRepository extends CrudRepository<Worker, Long> {

}
