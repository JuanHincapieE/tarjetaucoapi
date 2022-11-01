package com.tarjetaucoapi.tarjetaucoapi.services.records;

import com.tarjetaucoapi.tarjetaucoapi.domains.record.Record;
import com.tarjetaucoapi.tarjetaucoapi.domains.store.Store;
import com.tarjetaucoapi.tarjetaucoapi.repositories.record.IRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RecordServicelml implements IRecordService{
    @Autowired
    private IRecordRepository recordRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Record> findAll() {
        return (List<Record>) recordRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Record findById(int id) {
        return recordRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Record save(Record record) {
        return recordRepository.save(record);
    }
    @Override
    @Transactional
    public void delete(int id) {
        recordRepository.deleteById(id);
    }
}
