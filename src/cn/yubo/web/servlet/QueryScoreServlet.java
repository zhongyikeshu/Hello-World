package cn.yubo.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.yubo.service.QueryScoreService;

public class QueryScoreServlet extends HttpServlet {
	
	QueryScoreService qss = new QueryScoreService();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");//解决中文乱码
		HttpSession session = request.getSession();
		List list = null;
		String stuId = request.getParameter("stuId");
		String className = request.getParameter("className");
		try {
			list = qss.query(stuId,className);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		session.setAttribute("scoreList", list);
		response.sendRedirect(request.getContextPath()+"/stu/stu-info-manage-html/stu-sco-info-man.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}