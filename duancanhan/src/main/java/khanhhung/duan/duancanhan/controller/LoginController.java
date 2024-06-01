package khanhhung.duan.duancanhan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import khanhhung.duan.duancanhan.model.Account;
import khanhhung.duan.duancanhan.services.AccountService;

@Controller
public class LoginController {
    @Autowired
    private AccountService accountService;

    @GetMapping("/login")
    public String showLogin() {
        return "admin/login";
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam String username, @RequestParam String password, Model model) {
        Account account = accountService.findByUsername(username);
        if (account != null && password.equals(account.getPassword())) {
            model.addAttribute("account", account);
            return "redirect:/admin";
        } else {
            model.addAttribute("loginFailed", true);
            return "admin/login";
        }
    }

}
