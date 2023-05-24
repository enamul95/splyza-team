package com.splyzateam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChildMenu {
    private String menuName;
    private String icon;
    private String routerLink;
}
