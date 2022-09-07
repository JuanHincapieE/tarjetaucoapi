package com.tarjetaucoapi.tarjetaucoapi.controllers.record;
import com.tarjetaucoapi.tarjetaucoapi.domains.record.Record;
import com.tarjetaucoapi.tarjetaucoapi.services.records.IRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

public class RecordController {
    @Autowired
    private IRecordService recordService;

    @GetMapping("/records")
    public List<Record> index(){
        return recordService.findAll();
    }

    @GetMapping("/records/1")
    public Record storeById(){
        return recordService.findById(1);
    }

}
