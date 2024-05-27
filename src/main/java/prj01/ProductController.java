package prj01;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/product1")
public class ProductController extends HttpServlet {
    private static final long serialVersionUID =1L;

    ProjectService service;

    public ProductController() {
        service = new ProjectService();
    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        service = new ProjectService();
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String view = "";

        if(action == null){
            getServletContext().getRequestDispatcher("/product1?action=list").forward(request, response);
        }else{
            switch(action){
                case "list":
                    view = list(request, response);
                    break;
                case "info":
                    view = info(request, response);
                    break;
            }
            getServletContext().getRequestDispatcher("/prj01/"+view).forward(request, response);
        }
    }
    private String list(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute ("products", service.findAll());
        return "productList.jsp";
    }
    private String info(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("p", service.find(request.getParameter("id")));
        return "productInfo.jsp";
    }
}