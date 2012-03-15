/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.easyvalidation.showcase.filter;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.easyvalidation.Validator;
import com.easyvalidation.dto.Error;
import com.easyvalidation.showcase.UserDto;

public class CheckValidationFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {

		String validationName = request.getParameter("validationName");

		Map<String, Object> parameters = new HashMap<String, Object>();
		Enumeration<String> reqParams = request.getParameterNames();
		while (reqParams.hasMoreElements()) {
			String paramName = reqParams.nextElement();
			String value = request.getParameter(paramName);
			parameters.put(paramName, value);
		}
		List<Error> errors = Validator.checkValidations(validationName,
				parameters);
		RequestDispatcher rd = null;
		if (errors != null && errors.size() > 0) {
			request.setAttribute("errors", errors);

			UserDto userDto = getUserFormValues(request);
			request.setAttribute("userDto", userDto);
			rd = request.getRequestDispatcher("/home.jsp");
			rd.forward(request, response);
		} else {
			filterChain.doFilter(request, response);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	// Set field value in request scope if errors occurs (It is just for
	// value persist
	// purpose)
	private UserDto getUserFormValues(ServletRequest request) {
		UserDto userDto = new UserDto();
		userDto.setName(request.getParameter("name"));
		userDto.setAge(request.getParameter("age"));
		userDto.setEmail(request.getParameter("email"));
		userDto.setDob(request.getParameter("dob"));
		userDto.setZipcode(request.getParameter("zipcode"));
		userDto.setUrl(request.getParameter("url"));
		userDto.setCreditcardNo(request.getParameter("creditcardNo"));
		userDto.setIsbn(request.getParameter("isbn"));
		userDto.setInetaddress(request.getParameter("inetaddress"));
		return userDto;
	}
}
