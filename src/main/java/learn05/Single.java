package learn05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Single
 */
@WebServlet("/Single")
public class Single extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num =  request.getParameter("data");
		String op = request.getParameter("opt");
		
		ServletContext application = request.getServletContext();
		
		System.out.println("num: " + num + " op: " + op);
		
		if(!op.equals("=")) {		// 저장소에서 값을 저장한다.
			application.setAttribute("num1", num);
			application.setAttribute("calcOpt", op);
			
//			String num1 = (String) application.getAttribute("num1");
//			System.out.println("num1: " + num1);
			
		} else {		// 현재 입력 값과 저장된 값을 연산한다.
			String a = (String) application.getAttribute("num1");
			int num1 = Integer.parseInt(a);
			String calcOpt = (String) application.getAttribute("calcOpt");
			int num2 = Integer.parseInt(num);
			
			System.out.println("num1: " + num1);
			System.out.println("num2: " + num2);
			
			long res = 0;
			switch (calcOpt) {
			case "+": 
				res = num1 + num2;
				break;
			case "-":
				res = num1 - num2;
				break;
			
			}
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.append("<html><body>")
			.append("게산결과: " + res)
			.append("</body></html");
			
		}
	}
}
