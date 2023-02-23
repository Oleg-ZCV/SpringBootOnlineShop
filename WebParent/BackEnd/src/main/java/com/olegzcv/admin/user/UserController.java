package com.olegzcv.admin.user;

import com.olegzcv.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public String usersList(Model model) {
        List<User> users = service.getAllUsers();
        model.addAttribute("usersList", users);
        return "users";
    }

    @GetMapping("users/new")
    public String addNewUser() {
        return "user_form";
    }

    @GetMapping("users/save")
    public String save() {
        return "save_user";
    }
}
