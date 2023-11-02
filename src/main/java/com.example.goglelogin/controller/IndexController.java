package com.example.goglelogin.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.goglelogin.dto.UserDTO;


import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final HttpSession httpSession;

    @GetMapping(value="/")
    public String test(Model model) throws IOException{
        UserDTO.Session user = (UserDTO.Session)httpSession.getAttribute("user");

        if(user != null) {
            model.addAttribute("currentuser", user);
        }




        return "index";
    }






    @GetMapping("/mainlogin")
    public String mainlogin(Model model) {

        return "mainlogin";
    }

    @GetMapping("/logout")
    public String logout(Model model) {
        httpSession.invalidate();
        return "index";
    }




}