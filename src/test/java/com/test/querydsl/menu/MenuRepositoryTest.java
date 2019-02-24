package com.test.querydsl.menu;

import com.test.querydsl.menu.model.Menu;
import com.test.querydsl.menu.model.MenuRole;
import com.test.querydsl.menu.model.Role;
import com.test.querydsl.menu.repository.menu.MenuRepository;
import com.test.querydsl.menu.repository.menuRole.MenuRoleRepository;
import com.test.querydsl.menu.repository.role.RoleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MenuRepositoryTest {

    @Autowired
    MenuRepository menuRepository;

    @Autowired
    MenuRoleRepository menuRoleRepository;

    @Autowired
    RoleRepository roleRepository;

    @Test
    public void findAllTest() {
        menuRepository.findAll();
    }

    @Test
    public void initData() {
        Menu menu = new Menu();
        MenuRole menuRole = new MenuRole();
        Role role = new Role();

        menu.setMenuCode("M001");
        menu.setMenuDescription("M001 description");
        menu.setMenuName("menu1");
        menuRepository.saveAndFlush(menu);

        menu.setMenuCode("M002");
        menu.setMenuDescription("M002 description");
        menu.setMenuName("menu2");
        menuRepository.saveAndFlush(menu);

        menu.setMenuCode("M003");
        menu.setMenuDescription("M003 description");
        menu.setMenuName("menu3");
        menuRepository.saveAndFlush(menu);

        menu.setMenuCode("M004");
        menu.setMenuDescription("M004 description");
        menu.setMenuName("menu4");
        menuRepository.saveAndFlush(menu);

        role.setRoleGroupName("admin");
        role.setRoleName("admin1");
        roleRepository.saveAndFlush(role);

        role.setRoleGroupName("admin");
        role.setRoleName("admin2");
        roleRepository.saveAndFlush(role);

        role.setRoleGroupName("user");
        role.setRoleName("user1");
        roleRepository.saveAndFlush(role);

        role.setRoleGroupName("user");
        role.setRoleName("user2");
        roleRepository.saveAndFlush(role);

        role.setRoleGroupName("user");
        role.setRoleName("user3");
        roleRepository.saveAndFlush(role);

        role.setRoleGroupName("any");
        role.setRoleName("any1");
        roleRepository.saveAndFlush(role);

        /*
        Optional<Menu> menuOptional = menuRepository.findById(1L);
        Optional<Role> roleOptional = roleRepository.findById(1L);
        menuRole.setMenu(menuOptional.get());
        menuRole.setRole(roleOptional.get());
        menuRoleRepository.saveAndFlush(menuRole);

        menuOptional = menuRepository.findById(1L);
        roleOptional = roleRepository.findById(2L);
        menuRole.setMenu(menuOptional.get());
        menuRole.setRole(roleOptional.get());
        menuRoleRepository.saveAndFlush(menuRole);

        menuOptional = menuRepository.findById(2L);
        roleOptional = roleRepository.findById(3L);
        menuRole.setMenu(menuOptional.get());
        menuRole.setRole(roleOptional.get());
        menuRoleRepository.saveAndFlush(menuRole);

        menuOptional = menuRepository.findById(2L);
        roleOptional = roleRepository.findById(4L);
        menuRole.setMenu(menuOptional.get());
        menuRole.setRole(roleOptional.get());
        menuRoleRepository.saveAndFlush(menuRole);

        menuOptional = menuRepository.findById(2L);
        roleOptional = roleRepository.findById(5L);
        menuRole.setMenu(menuOptional.get());
        menuRole.setRole(roleOptional.get());
        menuRoleRepository.saveAndFlush(menuRole);

        menuOptional = menuRepository.findById(3L);
        roleOptional = roleRepository.findById(6L);
        menuRole.setMenu(menuOptional.get());
        menuRole.setRole(roleOptional.get());
        menuRoleRepository.saveAndFlush(menuRole);

        menuOptional = menuRepository.findById(4L);
        roleOptional = roleRepository.findById(6L);
        menuRole.setMenu(menuOptional.get());
        menuRole.setRole(roleOptional.get());
        menuRoleRepository.saveAndFlush(menuRole);
        */
    }

    @Test
    public void findAllMenuRoleJoin() {
    }
}