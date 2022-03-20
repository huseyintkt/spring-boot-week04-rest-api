package ch.learnbees.restapi.service;

import ch.learnbees.restapi.entity.WorkingHours;

import java.util.List;

public interface WorkingHoursService {

    WorkingHours createWorkingHours(WorkingHours workingHours);

    List<WorkingHours> getWorkingHoursList();
}
