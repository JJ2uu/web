package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check.do")
public class Check extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Check 서블릿 객체가 하나 만들어짐");
	}
	
	@Override
	public void destroy() {
		System.out.println("서블릿 소멸");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String today = request.getParameter("today");
		if (today.equals("맑음")) {
			out.print("오늘 날씨가 " + today + "이면 나가자!");
		} else if (today.equals("흐림")) {
			out.print("오늘 날씨가 " + today + "이면 집에서 코딩!");
		} else if (today.equals("비")) {
			out.print("오늘 날씨가 " + today + "이면 쇼핑하자!");
		} else {
			out.print("오늘 날씨가 " + today + "이면 그냥 집에 있자!");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String pass = request.getParameter("pass");
		if (pass.equals("나는 왕이다.")) {
			out.print("맞습니다. 들어오세요!" + "<br>");
			out.print("<img src = 'img/ok.png' width = '100px'>");
		} else {
			out.print("틀렸습니다!" + "<br>");
			out.print("<img src = 'img/no.png' width = '100px'>");
		}
	}

}
