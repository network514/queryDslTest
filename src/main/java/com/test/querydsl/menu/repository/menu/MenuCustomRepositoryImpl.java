package com.test.querydsl.menu.repository.menu;

import com.querydsl.jpa.impl.JPAQuery;
import com.test.querydsl.menu.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Transactional
public class MenuCustomRepositoryImpl implements MenuCustomRepository {

    @Autowired
    EntityManager entityManager;

    @Override
    public List<MenuRole> getMenuRoleJoin(MenuRole menuRole) {
        JPAQuery query = new JPAQuery(entityManager);
        QMenu qMenu = QMenu.menu;
        QRole qRole = QRole.role;
        QMenuRole qMenuRole = QMenuRole.menuRole;

        return query.from(qMenuRole).leftJoin(qMenu)
                .leftJoin(qRole)
                .fetch();
    }
}