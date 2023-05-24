package com.splyzateam.controller;

import com.splyzateam.model.ParentMenu;
import com.splyzateam.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/menu/")
public class MenuController {

    @Autowired
    private MenuService menuService;


    @GetMapping("menu-list")
    public List<ParentMenu> parentMenus() {
        return menuService.parentMenus();
    }
}
