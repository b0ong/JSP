package learn03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddAry
 */
@WebServlet("/addary")
public class AddAry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doPost(request, response);
//
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
				
		String[] numList = request.getParameterValues("n");
				
		int result = 0;
				
		for(int i = 0; i < numList.length; i++) {
			System.out.printf("[%d]: %s", i, numList);
			int num = Integer.parseInt(numList[i]); 
			result += num;
					
		}
				
		PrintWriter out = response.getWriter();
		out.append("<!doctype html><html><head><title>Calculator Servlet</title></head><body>")
		.append("계산결과 : " + result)
		.append("</body></html>");
		
	}

}
