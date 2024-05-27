//package learn06;
//
//import java.io.Console;
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class CookieCalc
// */
//@WebServlet("/cookiecalc")
//public class CookieCalc2 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html; charset=utf-8");
//		
//		Cookie[] cookies = request.getCookies();		// 2차 정보 - 응답헤더에 있는 쿠키값을 가져오기 위함
//		
////		System.out.println("===>" + cookies[0].getValue());
//		
//		String num = request.getParameter("data");
//		String opt = request.getParameter("opt");
//		
//		int result = 0;
//		int y = 0;
//		
//		if(!opt.equals("=")) {
//			Cookie valueCookie = new Cookie("value", num);
//			Cookie opCookie = new Cookie("calcOpt", opt);
//			
//			response.addCookie(opCookie);
//			response.addCookie(valueCookie);
//			
//		} else {
//			for(Cookie c : cookies) {
//				if(c.getName().equals("value")) {
//					int x = Integer.parseInt(c.getValue());
//					x = y;
//					break;
//					
//				}
//			}
//			
//			for(Cookie c : cookies) {
//				if(c.getName().equals("calcOpt")) {
//					opt = c.getValue();
//					break;
//					
//				}
//				
//			}
//			if(opt.equals("+")) {
//				int z = num;
//			}
//		}
//	}
//
//}
