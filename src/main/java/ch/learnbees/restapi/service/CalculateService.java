package ch.learnbees.restapi.service;

import ch.learnbees.restapi.entity.Worker;
import ch.learnbees.restapi.entity.WorkingHours;

import java.util.List;

public interface CalculateService {

    Double calculateWorkingHours(List<WorkingHours> workingHours);

    Double calculateCurrentCost(List<WorkingHours> workingHours);
}
