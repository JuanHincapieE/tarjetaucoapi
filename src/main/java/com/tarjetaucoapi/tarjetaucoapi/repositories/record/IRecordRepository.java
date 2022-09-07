package com.tarjetaucoapi.tarjetaucoapi.repositories.record;

import com.tarjetaucoapi.tarjetaucoapi.domains.record.Record;

import org.springframework.data.repository.CrudRepository;

public interface IRecordRepository extends CrudRepository<Record, Integer> {
}
