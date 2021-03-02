package jp.prac.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MainServlet extends HttpServletRequestWrapper{

	public MainServlet(HttpServletRequest request) {
		super(request);
	}

}
