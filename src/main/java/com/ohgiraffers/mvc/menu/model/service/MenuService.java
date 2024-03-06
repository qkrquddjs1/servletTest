package com.ohgiraffers.mvc.menu.model.service;

import com.ohgiraffers.mvc.menu.model.dao.MenuMapper;
import com.ohgiraffers.mvc.menu.model.dto.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.mvc.common.mybatis.Template.getSqlSession;

public class MenuService {

    private MenuMapper menuMapper;

    public MenuDTO selectOneMenuById(String menuCode) {

        SqlSession sqlSession = getSqlSession();
        // 확인하는 문구
        System.out.println("sqlSession : " + sqlSession);

        menuMapper = sqlSession.getMapper(MenuMapper.class);

        MenuDTO selectedMenu = menuMapper.selectOneMenuById(menuCode);

        sqlSession.close();

        return selectedMenu;
    }

   public List<MenuDTO> selectAllMenu() {
       SqlSession sqlSession = getSqlSession();
       menuMapper = sqlSession.getMapper(MenuMapper.class);
       List<MenuDTO> menuList = menuMapper.selectAllMenu();
       sqlSession.close();
       return menuList;
   }


   public int insertMenu(MenuDTO menu) {
       SqlSession sqlSession = getSqlSession();

       menuMapper = sqlSession.getMapper(MenuMapper.class);

       int result = menuMapper.insertMenu(menu);

       if(result > 0) {
           sqlSession.commit();
       } else {
           sqlSession.rollback();
       }

       sqlSession.close();

       return result;
   }

    public int uqdateMenu(MenuDTO menu) {
        SqlSession sqlSession = getSqlSession();

        menuMapper = sqlSession.getMapper(MenuMapper.class);

        int result = menuMapper.updateMenu(menu);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result;
    }

    public int deleteMenu(String menuCode) {

        SqlSession session = getSqlSession();
        menuMapper = session.getMapper(MenuMapper.class);

        int result = menuMapper.deleteMenu(menuCode);

        if(result > 0) {
            session.commit();
        } else {
            session.rollback();
        }

        session.close();

        return result;
    }

}
