<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="java.util.Locale"%>

<%
	String lang=request.getHeader("accept-language");
	Locale l = new Locale(lang);
	
	ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring.xml");
	
	String value = ap.getMessage("label", null, l);
	 
%>

<form action="./hello">
	<%=value %>:<input type="text" name="name">
				<input type="submit" value="Submit">
</form>
