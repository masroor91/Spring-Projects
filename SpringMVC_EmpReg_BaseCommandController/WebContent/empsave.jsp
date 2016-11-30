<%@taglib uri="http://www.springframework.org/tags/form" prefix="html" %>


<html:form commandName="empsave">

<pre>
Name   : <html:input path="name"/>
Email  : <html:input path="email"/>
Address: <html:input path="address"/>
		 <input type="submit" value="save"/>
</pre>

</html:form>