package com.splyzateam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParentMenu {
    private String parentMenuNme;
    private String icon;
    private String routerLink;
    List<ChildMenu> children;

}


