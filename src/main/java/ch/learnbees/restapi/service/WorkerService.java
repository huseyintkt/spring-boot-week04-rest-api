package ch.learnbees.restapi.service;

import ch.learnbees.restapi.entity.Worker;

import java.util.List;

public interface WorkerService {

    List<Worker> getWorkerList();

    Worker getWorkerById(Long id);

    Worker createWorker(Worker worker);

    void deleteWorker(Long id);

    Worker updateWorker(Long id, Worker worker);
}
