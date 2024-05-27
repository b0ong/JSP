package learn06;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieSvt
 */
@WebServlet("/cookiesvt")
public class CookieSvt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Cookie 생성
		Cookie cookie1 = new Cookie("cook", "cData");
		Cookie cookie2 = new Cookie("msg", URLEncoder.encode("한글", "utf-8"));
		
		// 클라이언트에게 Cookie 전송(응답헤더에 실어 보냄)
		response.addCookie(cookie1);		
		response.addCookie(cookie2);
		
	}
}
