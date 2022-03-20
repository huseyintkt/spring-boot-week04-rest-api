package ch.learnbees.restapi.controller;

import ch.learnbees.restapi.service.impl.CalculateServiceImpl;
import ch.learnbees.restapi.service.impl.WorkingHoursServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculate")
public class CalculateController {

    private final CalculateServiceImpl calculateService;
    private final WorkingHoursServiceImpl workingHoursService;

    public CalculateController(CalculateServiceImpl calculateService, WorkingHoursServiceImpl workingHoursService) {
        this.calculateService = calculateService;
        this.workingHoursService = workingHoursService;
    }

    @GetMapping("/hours")
    public Double calculateWorkingHours(){
        return calculateService.calculateWorkingHours(workingHoursService.getWorkingHoursList());
    }

    @GetMapping("/costs")
    public Double calculateCurrentCost(){
        return calculateService.calculateCurrentCost(workingHoursService.getWorkingHoursList());
    }

}
