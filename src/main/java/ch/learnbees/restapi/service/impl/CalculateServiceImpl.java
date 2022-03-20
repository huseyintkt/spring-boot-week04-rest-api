package ch.learnbees.restapi.service.impl;

import ch.learnbees.restapi.entity.Worker;
import ch.learnbees.restapi.entity.WorkingHours;
import ch.learnbees.restapi.service.CalculateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculateServiceImpl implements CalculateService {

    private final double COST_PER_HOUR_OF_DISABLED = 10;
    private final double COST_PER_HOUR_OF_LAZY = 23;
    private final double COST_PER_HOUR_OF_CHILD = 10;
    private final double COST_PER_HOUR_OF_GOOD = 40;

    @Override
    public Double calculateWorkingHours(List<WorkingHours> workingHours) {
        double totalWorkingHour = 0;

        for (int index = 0; index < workingHours.size(); index++) {
            totalWorkingHour += workingHours.get(index).getHour();
        }

        return totalWorkingHour;
    }

    @Override
    public Double calculateCurrentCost(List<WorkingHours> workingHours) {
        double totalCost = 0;

        for (int index = 0; index < workingHours.size(); index++) {
            String workerType = workingHours.get(index).getWorker().getType();

            switch (workerType){
                case "Disabled":
                    totalCost += workingHours.get(index).getHour() * COST_PER_HOUR_OF_DISABLED;
                    break;
                case "Lazy":
                    totalCost += workingHours.get(index).getHour() * COST_PER_HOUR_OF_LAZY;
                    break;
                case "Child":
                    totalCost += workingHours.get(index).getHour() * COST_PER_HOUR_OF_CHILD;
                    break;
                case "Good":
                    totalCost += workingHours.get(index).getHour() * COST_PER_HOUR_OF_GOOD;
                    break;
            }
        }

        return totalCost;
    }
}
