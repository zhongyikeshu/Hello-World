package cn.yubo.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.yubo.service.CountByClassService;

public class CountByClassServlet extends HttpServlet {
	CountByClassService ccs = new CountByClassService();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");//解决中文乱码
		HttpSession session = request.getSession();
		String className = request.getParameter("className");
		List list = null;
		try {
			list = ccs.count(className);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		session.setAttribute("list", list);
		session.setAttribute("className", className);
		response.sendRedirect(request.getContextPath()+"/stu/stu-info-manage-html/data-cou.jsp");
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
