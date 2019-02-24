package com.test.querydsl.menu.model;

import javax.persistence.*;

// ManyToMany로 하면 됨.
@Entity
public class MenuRole {
    @Id @GeneratedValue
    Long menuRoleId;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    Menu menu;

    @ManyToOne
    @JoinColumn(name = "role_id")
    Role role;

    public Long getMenuRoleId() {
        return menuRoleId;
    }

    public void setMenuRoleId(Long menuRoleId) {
        this.menuRoleId = menuRoleId;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}