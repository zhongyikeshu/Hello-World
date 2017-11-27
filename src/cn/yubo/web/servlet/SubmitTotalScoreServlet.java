package cn.yubo.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.yubo.service.SubmitTotalScoreService;

public class SubmitTotalScoreServlet extends HttpServlet {
	SubmitTotalScoreService sss = new SubmitTotalScoreService();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");//解决中文乱码
		
		String stuId = request.getParameter("stuId");
		String totalScore = request.getParameter("totalScore");
		String avgScore = request.getParameter("avgScore");
		try {
			sss.save(stuId,totalScore,avgScore);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect(request.getContextPath()+"/stu/stu-info-manage-html/data-cou.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
