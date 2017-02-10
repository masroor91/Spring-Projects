<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<html>
<body>
	<h1>${headerMsg}</h1>
	
	<form:errors path="student.*"/>
	<form action="login" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Hobby</td>
				<td><input type="text" name="hobby"></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile">	</td>
			</tr>
			
			<tr>
				<td>DOB</td>
				<td><input type="text" name="dob">	</td>
			</tr>
			
			<tr>
				<td>SkillSet</td>
				<td><select name="skillSet" multiple="multiple">
						<option value="Java Core">Java Core</option>
						<option value="Spring Core">Spring Core</option>
						<option value="Spring MVC">Spring MVC</option>
					</select> 
				</td>
			</tr>
			
			<tr>
				<td>Address</td>
				<td>
					<table>
						<tr>
							<td>Street:</td>
							<td><input type="text" name="address.street">	</td>	
						</tr>
						<tr>
							<td>City:</td>
							<td><input type="text" name="address.city"></td>	
						</tr>
						<tr>
							<td>Country:</td>
							<td><input type="text" name="address.country"></td>	
						</tr>
						<tr>
							<td>Pincode: </td>
							<td><input type="text" name="address.pincode"></td>	
						</tr>	
					
					</table>
				</td>	
			</tr>
			
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>	
		</table>
		
	</form>
</body>
</html>