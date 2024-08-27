package com.project.banking_application.service;

import com.project.banking_application.entity.Branch;
import com.project.banking_application.entity.BankServiceOffering;

import java.util.List;

public interface BankService {
    List<Branch> getBranches(String bankName, String city);
    List<BankServiceOffering> getServices(String bankName);
}
