package filter;

import java.io.IOException;
import jakarta.servlet.Filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class ServletRequestFilter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		String requestURL = request.getRequestURL().toString();
		System.out.printf("Requête interceptée : %s\n", requestURL);
		arg2.doFilter(arg0, arg1);
	}
	
	@Override
	public void destroy() {
		System.out.println("Destruction de l'objet de filtre");
		Filter.super.destroy();
	}

}
