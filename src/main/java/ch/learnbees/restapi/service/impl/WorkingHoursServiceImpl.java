package ch.learnbees.restapi.service.impl;

import ch.learnbees.restapi.entity.WorkingHours;
import ch.learnbees.restapi.repository.WorkingHoursRepository;
import ch.learnbees.restapi.service.WorkingHoursService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkingHoursServiceImpl implements WorkingHoursService {

    private  final WorkingHoursRepository workingHoursRepository;

    public WorkingHoursServiceImpl(WorkingHoursRepository workingHoursRepository) {
        this.workingHoursRepository = workingHoursRepository;
    }

    @Override
    public WorkingHours createWorkingHours(WorkingHours workingHours) {
        return workingHoursRepository.save(workingHours);
    }

    @Override
    public List<WorkingHours> getWorkingHoursList() {
        return (List<WorkingHours>) workingHoursRepository.findAll();
    }
}
