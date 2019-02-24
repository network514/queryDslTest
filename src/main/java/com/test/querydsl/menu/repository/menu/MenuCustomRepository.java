package com.test.querydsl.menu.repository.menu;

import com.test.querydsl.menu.model.MenuRole;

import java.util.List;

public interface MenuCustomRepository {
    List<MenuRole> getMenuRoleJoin(MenuRole menuRole);
}