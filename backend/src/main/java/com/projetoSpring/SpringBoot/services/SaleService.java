package com.projetoSpring.SpringBoot.services;

import com.projetoSpring.SpringBoot.entities.Sale;
import com.projetoSpring.SpringBoot.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;


    public List<Sale> findSales() {
        return repository.findAll();
    }
}