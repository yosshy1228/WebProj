<%@ page language="java" contentType="text/html; charesat=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>INDEX</title>
</head>
<body>
   <s:form action="HelloStrutsAction">
	<s:submit value="HeloStruts"/>
   </s:form>
   <s:form action="WelcomeAction">
	<s:submit value="Welcome"/>
   </s:form>
</body>
</html>