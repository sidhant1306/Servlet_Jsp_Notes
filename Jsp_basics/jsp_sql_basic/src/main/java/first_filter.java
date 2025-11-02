import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebFilter("/first")
public class first_filter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        // Code before servlet
        System.out.println("yeah yeah yeah bring it onn.");

        // WE NEED HTTP SERVLET REQUESTS BUT WE HAVE ONLY GOTTEN SERVLET REQUEST IN THE PARAMETERS OF THIS FUNCTION :
        // SO TYPECASTING THE SERVLET REQUEST PARAMETER TO HTTP SERVLET :

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        PrintWriter out = res.getWriter();
        // only do chaining(going to the servlet) when the entered id is greater than 1:
        // fetching the value of the id :

        int id = Integer.parseInt(req.getParameter("id"));

        if(id > 1) chain.doFilter(request, response);
        else out.print("Invalid input(id).");

        // Code after servlet
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}