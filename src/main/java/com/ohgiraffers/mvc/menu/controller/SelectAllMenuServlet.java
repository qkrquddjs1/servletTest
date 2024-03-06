package com.ohgiraffers.mvc.menu.controller;

import com.ohgiraffers.mvc.menu.model.dto.MenuDTO;
import com.ohgiraffers.mvc.menu.model.service.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/menu/list")
public class SelectAllMenuServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MenuService menuService = new MenuService();
        List<MenuDTO> menuList = menuService.selectAllMenu();

        String path = "";
        if(menuList != null && !menuList.isEmpty()){
            path = "/WEB-INF/views/menu/menuList.jsp";
            req.setAttribute("menuList", menuList);
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            req.setAttribute("message", "메뉴 전체 목록이 조회 안됨.");
        }

        req.getRequestDispatcher(path).forward(req, resp);
    }
}
