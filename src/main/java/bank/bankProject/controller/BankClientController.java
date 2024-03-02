package bank.bankProject.controller;

import bank.bankProject.service.BankClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Client")
public class BankClientController {
    private BankClientService bankClientService;

    @Autowired
    public BankClientController(BankClientService bankClientService) {
        this.bankClientService = bankClientService;
    }

    @GetMapping("loginPanel")
    public String loginPanel() {
        return "login-panel";
    }
    @GetMapping("registerPanel")
    public String registerPanel() {
        return "register-panel";
    }
}
