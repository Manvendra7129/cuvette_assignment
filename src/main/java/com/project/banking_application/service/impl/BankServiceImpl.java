package com.project.banking_application.service.impl;

import com.project.banking_application.entity.Branch;
import com.project.banking_application.entity.BankServiceOffering;
import com.project.banking_application.entity.Bank;
import com.project.banking_application.repository.BankRepository;
import com.project.banking_application.repository.BranchRepository;
import com.project.banking_application.repository.BankServiceOfferingRepository;
import com.project.banking_application.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BankServiceImpl implements BankService {

    private final BankRepository bankRepository;
    private final BranchRepository branchRepository;
    private final BankServiceOfferingRepository bankServiceOfferingRepository;

    @Override
    public List<Branch> getBranches(String bankName, String city) {
        Bank bank = bankRepository.findByName(bankName)
                .orElseThrow(() -> new RuntimeException("Bank not found"));
        return branchRepository.findByBankAndCity(bank, city);
    }

    @Override
    public List<BankServiceOffering> getServices(String bankName) {
        Bank bank = bankRepository.findByName(bankName)
                .orElseThrow(() -> new RuntimeException("Bank not found"));
        return bankServiceOfferingRepository.findByBank(bank);
    }
}
