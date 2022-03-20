package ch.learnbees.restapi.controller;

import ch.learnbees.restapi.entity.Worker;
import ch.learnbees.restapi.entity.WorkingHours;
import ch.learnbees.restapi.service.impl.WorkingHoursServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/working-hours")
public class WorkingHoursController {

    private final WorkingHoursServiceImpl workingHoursService;

    public WorkingHoursController(WorkingHoursServiceImpl workingHoursService) {
        this.workingHoursService = workingHoursService;
    }

    @GetMapping()
    public ResponseEntity<List<WorkingHours>> getWorkingHoursList(){
        List<WorkingHours> workingHoursList = workingHoursService.getWorkingHoursList();
        return new ResponseEntity<List<WorkingHours>>(workingHoursList, HttpStatus.OK) ;
    }

    @PostMapping()
    public ResponseEntity<WorkingHours> createWorkingHours(@RequestBody WorkingHours workingHours){
        WorkingHours newWorkingHours = workingHoursService.createWorkingHours(workingHours);
        return new ResponseEntity<WorkingHours>(newWorkingHours, HttpStatus.CREATED);
    }
}
