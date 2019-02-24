package com.test.querydsl.menu.repository.menu;

import com.test.querydsl.menu.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long>, MenuCustomRepository {
}