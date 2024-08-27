package com.project.banking_application.repository;

import com.project.banking_application.entity.BankServiceOffering;
import com.project.banking_application.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankServiceOfferingRepository extends JpaRepository<BankServiceOffering, Long> {
    List<BankServiceOffering> findByBank(Bank bank);
}
