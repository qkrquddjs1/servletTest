package com.ohgiraffers.mvc.menu.model.dao;

import com.ohgiraffers.mvc.menu.model.dto.MenuDTO;

import java.util.List;

public interface MenuMapper {
    MenuDTO selectOneMenuById(String menuCode);

    List<MenuDTO> selectAllMenu();
    

    int insertMenu(MenuDTO menu);

  

    int updateMenu(MenuDTO menu);

    int deleteMenu(String menuCode);
}
