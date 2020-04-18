package com.example.medical.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.medical.dto.Bill;

@Repository
@Transactional
public interface BillRepo extends CrudRepository<Bill,Integer>{

}
