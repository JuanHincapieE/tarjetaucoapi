package com.tarjetaucoapi.tarjetaucoapi.controllers.record;
import com.tarjetaucoapi.tarjetaucoapi.domains.record.Record;
import com.tarjetaucoapi.tarjetaucoapi.domains.store.Store;
import com.tarjetaucoapi.tarjetaucoapi.services.records.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

public class RecordController {
    @Autowired
    private IRecordService recordService;

    @GetMapping("/record")
    public List<Record> index(){
        return recordService.findAll();
    }

    @GetMapping("/record/{id}")
    public Record show(@PathVariable int id){
        return recordService.findById(id);
    }

    @PostMapping("/records")
    @ResponseStatus(HttpStatus.CREATED)
    public Record create(@RequestBody Record record){
        return recordService.save(record);
    }

    @PutMapping("/records/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Record update(@RequestBody Record record,@PathVariable int id){
        Record currentRecord = recordService.findById(id);
        currentRecord.setDescription(record.getDescription());
        currentRecord.setIdPurchase(record.getIdPurchase());
        return recordService.save(currentRecord);
    }
    @DeleteMapping("/records/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        recordService.delete(id);
    }
}
