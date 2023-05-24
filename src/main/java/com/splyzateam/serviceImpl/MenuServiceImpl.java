package com.splyzateam.serviceImpl;

import com.splyzateam.model.ChildMenu;
import com.splyzateam.model.ParentMenu;
import com.splyzateam.service.MenuService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Override
    public List<ParentMenu> parentMenus() {
        return getMenus();
    }


    public List<ParentMenu> getMenus(){
        List<ParentMenu> list = new ArrayList<>();



        ParentMenu menu1 = new ParentMenu();
        menu1.setMenuName("User Approval");
        menu1.setIcon("people");
        menu1.setRouterLink("/user/approval");
        list.add(menu1);


        ParentMenu menu2 = new ParentMenu();
        menu2.setMenuName("User Set up");
        menu2.setIcon("people");
        menu2.setRouterLink("");

        List<ChildMenu> childList1 = new ArrayList<>();
        // child 1
        ChildMenu menuChild1 = new ChildMenu();
        menuChild1.setMenuName("Add User");
        menuChild1.setIcon("people");
        menuChild1.setRouterLink("/user/add-user");
        childList1.add(menuChild1);

        ChildMenu menuChild2 = new ChildMenu();
        menuChild2.setMenuName("Add User Right");
        menuChild2.setIcon("people");
        menuChild2.setRouterLink("/app-home");
        childList1.add(menuChild2);
        menu2.setChildren(childList1);

        list.add(menu2);


        // Menu 3

        ParentMenu menu3 = new ParentMenu();
        menu3.setMenuName("Report");
        menu3.setIcon("assignment");
        menu3.setRouterLink("");

        List<ChildMenu> childList2 = new ArrayList<>();
        // child 1
        ChildMenu menuChild3 = new ChildMenu();
        menuChild3.setMenuName("Users");
        menuChild3.setIcon("people");
        menuChild3.setRouterLink("/user/users");
        childList2.add(menuChild3);

        ChildMenu menuChild4 = new ChildMenu();
        menuChild4.setMenuName("Utility Bill Pays");
        menuChild4.setIcon("info");
        menuChild4.setRouterLink("/bills/utility-bill-report");
        childList2.add(menuChild4);
        menu3.setChildren(childList2);
        list.add(menu3);
        return list;
    }

}
