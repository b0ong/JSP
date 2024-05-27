package learn03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calc01
 */
@WebServlet("/calc01")
public class Calc01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NumberFormatException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String opt = request.getParameter("opt");
		
		int result = 0;
		
		switch (opt) {
		case "sum" : 
			result = num1 + num2;
			break;
			
		case "sub" :
			result = num1 - num2;
			break;
			
		case "mul" :
			result = num1 * num2;
			break;
			
		case "div" :
			result = num1 / num2;
			break;
			
		}
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.append("<!doctype html><html><head><title>Calculator Servlet</title></head><body>")
		.append("<h2>간단한 계산기 서블릿</h2>")
		.append("계산결과 : " + result)
		.append("</body></html>");
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
