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
import cn.yubo.service.XiuService;

public class XiuServlet extends HttpServlet {
	//修改
	XiuService xs = new XiuService();
	QueryScoreService qss = new  QueryScoreService();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");//解决中文乱码
		HttpSession session = request.getSession();
		
		String stuName = request.getParameter("stuName");
		String className = request.getParameter("className");
		String score = request.getParameter("score");
		try {
			xs.xiu(stuName,className,score);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		//修改后再查询
		List list = null;
		try {
			list = qss.query("","");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		session.setAttribute("scoreList", list);
		//response.sendRedirect(request.getContextPath()+"/stu/stu-info-manage-html/stu-sco-info-man.jsp");
	
		//response.sendRedirect(request.getContextPath()+"/stu/stu-info-manage-html/stu-sco-info-man.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}