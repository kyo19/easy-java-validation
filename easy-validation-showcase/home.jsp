<%@ page import="java.util.List,com.easyvalidation.dto.Error" isELIgnored="false"%>
<html>
	<head>
		<link type="text/css" href="includes/ui-lightness/jquery-ui-1.8.9.custom.css" rel="stylesheet" />
		<script type="text/javascript" src="includes/jquery-1.4.4.min.js"></script>
		<script type="text/javascript" src="includes/jquery-ui-1.8.9.custom.min.js"></script>
		    <script src="includes/jquery.toastmessage.js" type="text/javascript"></script>
		    <link href="includes/jquery.toastmessage.css" rel="stylesheet" type="text/css" />
		    <script type="text/javascript">
			    function showStickyErrorToast(errorMessage) {
		            $().toastmessage('showToast', {
		                text: errorMessage,
		                sticky: true,
		                position: 'top',
		                type: 'error',
		                closeText: ''
		            });
		        }
			    
			    $(function() {
					$( "#datepicker" ).datepicker({ dateFormat: 'dd/mm/yy' });
				});
			</script>	
	</head>
	<body>
		<table width="100%">
			<tr>
				<td height="100px" style="background-color: #008B8B;color: #FFFFFF">Easy Validation Showcase</td>
			</tr>
			<tr>
				<td align="center">
		<%
		List<Error> errors = (List<Error>)request.getAttribute("errors");
		if( errors != null && errors.size() > 0){
		%>
				<script type="text/javascript">
				var message = "";
		<%
			for(Error error : errors){
		%>
			
			
				message += '<li><%=	error.getMessage() %></li>';				
		<%				
			}
		%>
		showStickyErrorToast(message);
		</script>
		<%
		}
		
		%>
</td>
</tr>
<tr>
<td align="center">
				<form action="user" method="post">
				<input type="hidden" name="validationName" value="userFormValidation"/>
					<table>
						<tr>
							<td><span style="color: red">*</span>Name : </td>
							<td>
								<input type="text" name="name" value="${userDto.name}"/>
							</td>
						</tr>
						<tr>
							<td><span style="color: red">*</span>Age : </td>
							<td>
								<input type="text" name="age"  value="${userDto.age}"/>
							</td>
						</tr>
											<tr>
							<td>Email : </td>
							<td>
								<input type="text" name="email" value="${userDto.email}"/>
							</td>
						</tr>
						<tr>
							<td>Date of Birth : </td>
							<td>
								<input id="datepicker" type="text" name="dob"  value="${userDto.dob}"/></td>
						</tr>
						<tr>
							<td>Zipcode : </td>
							<td>
								<input type="text" name="zipcode"  value="${userDto.zipcode}"/>
							</td>
						</tr>
						<tr>
							<td>Home Page : </td>
							<td>
								<input type="text" name="url" value="${userDto.url}"/>
							</td>
						</tr>
						
						<tr>
							<td>Credit Card Number : </td>
							<td>
								<input type="text" name="creditcardNo" value="${userDto.creditcardNo}"/>
							</td>
						</tr>
						
						<tr>
							<td>ISBN : </td>
							<td>
								<input type="text" name="isbn" value="${userDto.isbn}"/>
							</td>
						</tr>
						
						<tr>
							<td>IP Address : </td>
							<td>
								<input type="text" name="inetaddress" value="${userDto.inetaddress}"/>
							</td>
						</tr>
						<tr>
							<td colspan="2" align="center">
								<input type="submit" value="Submit"/>
							</td>
						</tr>
					</table>
				</form>
				</td>
			</tr>
		</table>
	</body>
</html>