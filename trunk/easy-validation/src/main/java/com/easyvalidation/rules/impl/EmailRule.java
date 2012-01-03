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
 * The class checks the entered email address is in correct format. It checks
 * the value with regular expression as
 * (^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-
 * Za-z0-9-])+((\\.com)|(\\.net)|(\\.org
 * )|(\\.info)|(\\.edu)|(\\.mil)|(\\.gov)|(\
 * \.biz)|(\\.ws)|(\\.us)|(\\.tv)|(\\.cc
 * )|(\\.aero)|(\\.arpa)|(\\.coop)|(\\.int)|
 * (\\.jobs)|(\\.museum)|(\\.name)|(\\.pro
 * )|(\\.travel)|(\\.nato)|(\\..{2,3})|(\\..{2,3}\\..{2,3}))$)
 */
public class EmailRule extends ExpressionRule {

	private static final String EMAIL_REG_EX = "\\b(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-])+((\\.com)|(\\.net)|(\\.org)|(\\.info)|(\\.edu)|(\\.mil)|(\\.gov)|(\\.biz)|(\\.ws)|(\\.us)|(\\.tv)|(\\.cc)|(\\.aero)|(\\.arpa)|(\\.coop)|(\\.int)|(\\.jobs)|(\\.museum)|(\\.name)|(\\.pro)|(\\.travel)|(\\.nato)|(\\..{2,3})|(\\..{2,3}\\..{2,3}))$)\\b";

	@Override
	public final String getExpression() {
		return EMAIL_REG_EX;
	}

	@Override
	public final boolean isRegEx() {
		return true;
	}
}
