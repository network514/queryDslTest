package com.test.querydsl.menu.repository.menuRole;

import com.test.querydsl.menu.model.MenuRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRoleRepository extends JpaRepository<MenuRole, Long>, MenuRoleCustomRepository {
}