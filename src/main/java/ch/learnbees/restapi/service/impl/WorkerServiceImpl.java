package ch.learnbees.restapi.service.impl;

import ch.learnbees.restapi.entity.Worker;
import ch.learnbees.restapi.repository.WorkerRepository;
import ch.learnbees.restapi.service.WorkerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerServiceImpl implements WorkerService {

    private final WorkerRepository workerRepository;

    public WorkerServiceImpl(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Override
    public List<Worker> getWorkerList() {
        return (List<Worker>) workerRepository.findAll();
    }

    @Override
    public Worker getWorkerById(Long id) {
        return workerRepository.findById(id).get();
    }

    @Override
    public Worker createWorker(Worker worker) {
        return workerRepository.save(worker);
    }

    @Override
    public void deleteWorker(Long id) {
        workerRepository.deleteById(id);
    }

    @Override
    public Worker updateWorker(Long id, Worker worker) {
        Worker oldWorker = workerRepository.findById(id).get();
        oldWorker.setFirstName(worker.getFirstName());
        oldWorker.setLastName(worker.getLastName());
        oldWorker.setType(worker.getType());
        return workerRepository.save(oldWorker);
    }
}
