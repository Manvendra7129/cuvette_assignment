package com.project.banking_application.repository;

import com.project.banking_application.entity.Branch;
import com.project.banking_application.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BranchRepository extends JpaRepository<Branch, Long> {
    List<Branch> findByBankAndCity(Bank bank, String city);
}
