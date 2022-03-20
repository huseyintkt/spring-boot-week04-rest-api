package ch.learnbees.restapi;

import ch.learnbees.restapi.entity.Worker;
import ch.learnbees.restapi.entity.WorkingHours;
import ch.learnbees.restapi.repository.WorkerRepository;
import ch.learnbees.restapi.repository.WorkingHoursRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class RestapiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(RestapiApplication.class, args);

		WorkerRepository workerRepository = configurableApplicationContext.getBean(WorkerRepository.class);

		Worker worker1 = new Worker("Ali", "Demir", "Good");
		Worker worker2 = new Worker("Ahmet", "Demir", "Disabled");
		Worker worker3 = new Worker("Mehmet", "Demir", "Lazy");
		Worker worker4 = new Worker("Okkes", "Demir", "Child");

		workerRepository.save(worker1);
		workerRepository.save(worker2);
		workerRepository.save(worker3);
		workerRepository.save(worker4);

		WorkingHoursRepository workingHoursRepository = configurableApplicationContext.getBean(WorkingHoursRepository.class);

		WorkingHours workingHours1 = new WorkingHours(worker1, 1, 10.0);
		WorkingHours workingHours2 = new WorkingHours(worker1, 2, 30.0);
		WorkingHours workingHours3 = new WorkingHours(worker1, 3, 20.0);
		WorkingHours workingHours4 = new WorkingHours(worker2, 1, 10.0);
		WorkingHours workingHours5 = new WorkingHours(worker3, 1, 10.0);
		WorkingHours workingHours6 = new WorkingHours(worker3, 2, 20.0);
		WorkingHours workingHours7 = new WorkingHours(worker4, 1, 30.0);

		workingHoursRepository.save(workingHours1);
		workingHoursRepository.save(workingHours2);
		workingHoursRepository.save(workingHours3);
		workingHoursRepository.save(workingHours4);
		workingHoursRepository.save(workingHours5);
		workingHoursRepository.save(workingHours6);
		workingHoursRepository.save(workingHours7);
	}
}
