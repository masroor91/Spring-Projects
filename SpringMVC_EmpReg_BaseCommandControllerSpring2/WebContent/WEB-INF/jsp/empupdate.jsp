<form action="./empupdate.ds">

<pre>
Emp ID : <input type="text" name="id"  contenteditable="false" value="<%=request.getParameter("id")%>"/>
<!-- Emp ID : <input type="text" name="id"/> -->
Name   : <input type="text" name="name"/>
Email  : <input type="text" name="email"/>
Address: <input type="text" name="address"/>
		 <input type="submit" value="update"/>
	
</pre>

</form>