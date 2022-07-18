package com.crocoder.sport.filters;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtRequestFilter extends OncePerRequestFilter {
	 @Autowired
	    private com.crocoder.sport.security.MyUserDetailsService userDetailsService;

	    @Autowired
	    private com.crocoder.sport.util.JwtUtil jwtUtil;
	    
		@Value("${permitted-url}")
		private String permittedUrl = "";

	    @Override
	    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
	            throws ServletException, IOException
	    {

	        final String authorizationHeader = request.getHeader("Authorization");

	        String username = null;
	        String jwt = null;

	        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
	            jwt = authorizationHeader.substring(7);
	            username = jwtUtil.extractUsername(jwt);
	        }


	        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {

	            UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);

	            if (jwtUtil.validateToken(jwt, userDetails)) {

	                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
	                        userDetails, null, userDetails.getAuthorities());
	                usernamePasswordAuthenticationToken
	                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
	                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
	            }
	        }
	        response.setHeader("Access-Control-Allow-Origin", permittedUrl);
			response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
			response.setHeader("Access-Control-Max-Age", "3600");
		    response.setHeader("Access-Control-Allow-Credentials", "true");
			response.setHeader("Access-Control-Allow-Headers",
					"x-requested-with, authorization, Content-Type, Authorization, credential, X-XSRF-TOKEN");
			
			if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
				response.setStatus(HttpServletResponse.SC_OK);
			} else {
				chain.doFilter(request, response);
			}
	    }

}
