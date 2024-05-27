package learn06;

import java.io.Console;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieCalc
 */
@WebServlet("/cookiecalc")
public class CookieCalc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		Cookie[] cookies = request.getCookies();
		
//		System.out.println("===>" + cookies[0].getValue());
		
		String v_ = request.getParameter("data");
		String opt = request.getParameter("opt");
		
		int y = 0;
		
		if(!v_.equals("") | v_!=null) {
			Integer.parseInt(v_);
		}
		
		if(opt.equals("=")) {
			int x = 0;
			for(Cookie c : cookies) {
				if(c.getName().equals("data")) {
					x = Integer.parseInt(c.getValue());
					break;
					
				}
			}
			
		} else {
			Cookie num1 = new Cookie("data", v_);
			Cookie calcOpt = new Cookie("calcOpt", opt);
			
			
		}
		
		
	}

}
