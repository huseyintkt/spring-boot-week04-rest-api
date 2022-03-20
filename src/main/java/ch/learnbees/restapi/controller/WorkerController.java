package ch.learnbees.restapi.controller;

import ch.learnbees.restapi.entity.Worker;
import ch.learnbees.restapi.service.impl.WorkerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workers")
public class WorkerController {

    private final WorkerServiceImpl workerService;

    public WorkerController(WorkerServiceImpl workerService) {
        this.workerService = workerService;
    }

    @GetMapping()
    public ResponseEntity<List<Worker>> getWorkerList(){
        List<Worker> workerList = workerService.getWorkerList();
        return new ResponseEntity<List<Worker>>(workerList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> getWorkerById(@PathVariable("id") Long id){
        Worker worker = workerService.getWorkerById(id);
        return new ResponseEntity<Worker>(worker, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Worker> createWorker(@RequestBody Worker worker){
        Worker newWorker = workerService.createWorker(worker);
        return new ResponseEntity<Worker>(newWorker, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorker(@PathVariable("id") Long id){
        workerService.deleteWorker(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Worker> updateWorker(@PathVariable("id") Long id, @RequestBody Worker worker){
        Worker updatedWorker = workerService.updateWorker(id, worker);
        return new ResponseEntity<Worker>(updatedWorker, HttpStatus.OK);
    }
}
