package com.test.querydsl.menu.repository.role;

import com.test.querydsl.menu.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>, RoleCustomRepository {
}