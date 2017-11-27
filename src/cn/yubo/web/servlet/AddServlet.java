package cn.yubo.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.yubo.service.AddService;
import cn.yubo.service.QueryScoreService;

public class AddServlet extends HttpServlet {
	
	AddService as = new AddService();
	QueryScoreService qss = new QueryScoreService();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");//解决中文乱码
		HttpSession session = request.getSession();
		String stuName = request.getParameter("stuName");
		String className = request.getParameter("className");
		String score = request.getParameter("score");
		try {   
			as.add(stuName,className,score);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		//添加成功后再进行查询
		List list = null;
		try {
			list = qss.query("","");
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