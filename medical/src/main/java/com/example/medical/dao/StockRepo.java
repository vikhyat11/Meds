package com.example.medical.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.medical.dto.Stock;

@Repository
@Transactional
public interface StockRepo extends CrudRepository<Stock,Integer>{

}
