package com.projetoSpring.SpringBoot.controllers;

import com.projetoSpring.SpringBoot.entities.Sale;
import com.projetoSpring.SpringBoot.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleControler {

    @Autowired
    private SaleService service;
    @GetMapping
    public List<Sale> findSales(){
        return service.findSales();



    }

}
