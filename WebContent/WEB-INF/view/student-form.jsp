<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration form</title>
</head>
<body>
<form:form action ="processForm" modelAttribute="student">
First Name: <form:input path="firstName"/>
<br><br>
Last Name: <form:input path="lastName"/>
<br><br>
Country
<form:select path="country">
<form:options items="${theCountryOptions}"/>
</form:select>
<br><br>
Favorite Language
Java<form:radiobutton path="favoriteLanguage" value ="Java"/>
C#<form:radiobutton path="favoriteLanguage" value ="C#"/>
PHP<form:radiobutton path="favoriteLanguage" value ="PHP"/>
Python<form:radiobutton path="favoriteLanguage" value ="Python"/>
<br><br>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>