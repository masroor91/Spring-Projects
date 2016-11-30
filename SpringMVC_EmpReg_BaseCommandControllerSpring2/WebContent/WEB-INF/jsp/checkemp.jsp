
<form action="./checkemp.ds">

<pre>
Enter the Employee you need to update
Emp ID : <input type="text" name="id"/>
		 <input type="submit" value="update"/>
</pre>
<% request.setAttribute("id", request.getAttribute("id"));%>
</form>