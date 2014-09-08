package com.borodatos.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class InfoController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		out.write("Server name: " + request.getServerName() + "<br/>");
		out.write("Server port: " + request.getServerPort() + "<br/>");
		out.write("Servlet path: " + request.getServletPath() + "<br/>");
		out.flush();

		return null;
	}
}