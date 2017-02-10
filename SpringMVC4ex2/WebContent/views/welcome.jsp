<html>
	<body>
	
		<h1>${headerMsg}</h1>
		<h3>Congratulations!! the Engineering college has processed your Application Form Successfully</h3>
	
		<h2>Details submitted by you are: </h2>
		
		<table>
			<tr>
				<td>Student Name:</td>
				<td>${student.name }</td>
			</tr>
			<tr>
				<td>Student Hobby:</td>
				<td>${student.hobby }</td>
			</tr>
			<tr>
				<td>Student Mobile:</td>
				<td>${student.mobile }</td>
			</tr>
			<tr>
				<td>Student Date Of Birth:</td>
				<td>${student.dob }</td>
			</tr>
			<tr>
				<td>Student SkillSet:</td>
				<td>${student.skillSet }</td>
			</tr>
			
			<tr>
				<td>Student Address:</td>
				<td>
					<table>
						<tr>
							<td>Street: </td>
							<td>${student.address.street}</td>
						</tr>
						<tr>
							<td>City: </td>
							<td>${student.address.city}</td>
						</tr>
						<tr>
							<td>Country: </td>
							<td>${student.address.country}</td>
						</tr>
						<tr>
							<td>Pincode: </td>
							<td>${student.address.pincode}</td>
						</tr>
					
					</table>
				
				
				</td>
			</tr>
			
		</table>
	
	</body>
</html>