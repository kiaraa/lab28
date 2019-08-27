<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@ taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weather</title>
</head>
<body>
	<h3>Show with custom latitude and longitude</h3>
	<form action="newLatLong">
		<input type="text" placeholder="Latitude" name="lat">
		<input type="text" placeholder="Longitude" name="long">
		<input type="submit" value="Submit">
	</form>

	<c:forEach items="${forecast.time.startPeriodName }" var="day"
		varStatus="i">
		<b>${forecast.time.startPeriodName[i.index-1] }</b>
		<br>
			
		${forecast.data.text[i.index-1] }<br>
		<br>

	</c:forEach>



</body>
</html>