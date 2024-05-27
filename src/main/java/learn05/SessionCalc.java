package learn05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Single
 */
@WebServlet("/singlesession")
public class SessionCalc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("data")); 
		String opt = request.getParameter("opt");
		
		HttpSession session = request.getSession();
		
		if(opt.equals("=")) {
			int num1 = (int) session.getAttribute("num1");
			String calc = (String) session.getAttribute("calc");
			
			long res = 0;
			
			switch (calc) {
			case "+": 
				System.out.println("num1: " + num1 + "num2: " + num);
				System.out.println("calc: " + calc);
				res = num1 + num;
				System.out.println("-=====> " + num1);
			case "-": 
				num1 += num;
			case "/": 
				num1 += num;
			case "*": 
				num1 += num;
			
			}
			
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.append("<html><body>")
			.append("게산결과: " + res)
			.append("</body></html");
			
		} else {
			session.setAttribute("num1", num);	// num1 값 session에 저장
			session.setAttribute("calc", opt);	// 연산자 값 session에 저장
			
		}
		
	}
}
