package com.example.JakSim.pay;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayController {
    @GetMapping("/pay")
    public String BeforePay(){
        return "content/pay/Pay";
    }
    //안농
}