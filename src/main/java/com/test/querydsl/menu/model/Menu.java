package com.test.querydsl.menu.model;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Menu {
    @Id @GeneratedValue
    Long menuId;

    String menuCode;

    String menuName;

    String menuDescription;

    @OneToMany(mappedBy = "menu")
    Set<MenuRole> menuRoles = new LinkedHashSet<>();

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    public Set<MenuRole> getMenuRoles() {
        return menuRoles;
    }

    public void setMenuRoles(Set<MenuRole> menuRoles) {
        this.menuRoles = menuRoles;
    }
}