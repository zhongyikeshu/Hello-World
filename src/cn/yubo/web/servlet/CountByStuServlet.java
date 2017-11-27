package cn.yubo.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.dbutils.handlers.MapListHandler;

import cn.yubo.service.CountByStuService;

public class CountByStuServlet extends HttpServlet {
	CountByStuService css = new CountByStuService();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");//解决中文乱码
		HttpSession session = request.getSession();
		String stuId = request.getParameter("stuId");
		String name = request.getParameter("name");
		List list = null;
		try {
			list = css.count(stuId,name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		session.setAttribute("total", list);
		session.setAttribute("stuId", stuId);
		response.sendRedirect(request.getContextPath()+"/stu/stu-info-manage-html/data-cou.jsp");
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}