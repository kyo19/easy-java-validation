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

package com.easyvalidation.rules.impl;

/**
 * Rule to checks URL format. It checks the URL format with regular expression
 * as ^((http|https|ftp)\\://)?[a-zA-Z0-9\\-\\.]+\\.[a-zA-Z]{2,3}(/\\S*)?$
 * 
 */
public class URLRule extends ExpressionRule {

	private static final String URL_REG_EX = "^((http|https|ftp)\\://)?[a-zA-Z0-9\\-\\.]+\\.[a-zA-Z]{2,3}(/\\S*)?$";

	@Override
	public final String getExpression() {
		return URL_REG_EX;
	}

	@Override
	public final boolean isRegEx() {
		return true;
	}

}