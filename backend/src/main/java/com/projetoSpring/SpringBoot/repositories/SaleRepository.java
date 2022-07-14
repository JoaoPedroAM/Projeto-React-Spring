package com.projetoSpring.SpringBoot.repositories;

import com.projetoSpring.SpringBoot.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {


}
