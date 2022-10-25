package com.tarjetaucoapi.tarjetaucoapi.services.records;
import com.tarjetaucoapi.tarjetaucoapi.domains.record.Record;
import java.util.List;

public interface IRecordService {

    public List<Record> findAll();

    public Record findById(int id);

    public Record save(Record record);

    void delete(int id);
}
