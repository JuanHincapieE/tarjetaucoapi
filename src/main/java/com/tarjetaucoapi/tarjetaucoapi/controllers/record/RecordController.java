package com.tarjetaucoapi.tarjetaucoapi.controllers.record;


import com.tarjetaucoapi.tarjetaucoapi.domains.record.Record;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class RecordController {
    @GetMapping("/stores")
    public Record getRecord() {
        Record recordEntity= new Record(1,"record",1);
        return recordEntity;
    }

    @PostMapping("/stores")
    public String  postRecord(@RequestParam(required = true) String id, String description, int idPurchase){
        return "Creando un registro en el historial";
    }
}
