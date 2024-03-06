package com.ohgiraffers.mvc.menu.controller;

import com.ohgiraffers.mvc.menu.model.service.MenuService;
import com.ohgiraffers.mvc.menu.model.service.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/menu/delete")
public class DeleteMenuServlet extends HttpServlet {
    /* 삭제 성공 시 직원 목록으로
    * 삭제 실패 시 에러 페이지로 처리*/
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String menuCode = request.getParameter("menuCode");

        MenuService menuService = new MenuService();
        int result = menuService.deleteMenu(menuCode);

        if(result > 0) {
            response.sendRedirect(request.getContextPath() + "/menu/list");
        } else {
            request.setAttribute("message", "메뉴 정보 삭제에 실패하였습니다.");
            request.getRequestDispatcher("/WEB-INF/views/common/errorPage.jsp").forward(request, response);
        }
    }
}
