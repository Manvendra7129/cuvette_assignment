package com.project.banking_application.controller;

import com.project.banking_application.entity.Branch;
import com.project.banking_application.entity.BankServiceOffering;
import com.project.banking_application.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BankController {

    private final BankService bankService;

    @GetMapping("/bank/{bankName}/branches")
    public String getBranches(@PathVariable String bankName, Model model) {
        List<Branch> branches = bankService.getBranches(bankName, "Bangalore");
        model.addAttribute("bankName", bankName);
        model.addAttribute("branches", branches);
        return "branches";
    }

    @GetMapping("/bank/{bankName}/services")
    public String getServices(@PathVariable String bankName, Model model) {
        List<BankServiceOffering> services = bankService.getServices(bankName);
        model.addAttribute("bankName", bankName);
        model.addAttribute("services", services);
        return "services";
    }
}
