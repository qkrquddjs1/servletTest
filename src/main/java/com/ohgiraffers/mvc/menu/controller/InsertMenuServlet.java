package com.ohgiraffers.mvc.menu.controller;

import com.ohgiraffers.mvc.menu.model.dto.MenuDTO;
import com.ohgiraffers.mvc.menu.model.service.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/menu/insert")
public class InsertMenuServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String menuName = req.getParameter("menuName");
        int menuPrice = Integer.parseInt(req.getParameter("menuPrice"));
        int categoryCode = Integer.parseInt(req.getParameter("categoryCode"));
        String  orderableStatus= req.getParameter("orderableStatus");

        MenuDTO menu = new MenuDTO();
        menu.setMenuName(menuName);
        menu.setMenuPrice(menuPrice);
        menu.setCategoryCode(categoryCode);
        menu.setOrderableStatus(orderableStatus);


        System.out.println("insert request emp : " + menu);

        MenuService menuService = new MenuService();
        int result = menuService.insertMenu(menu);

        if(result > 0) {

            resp.sendRedirect(req.getContextPath() + "/menu/list");

        } else {
            req.setAttribute("message", "신규 메뉴 등록에 실패하였습니다.");
            req.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(req, resp);
        }
    }
}
