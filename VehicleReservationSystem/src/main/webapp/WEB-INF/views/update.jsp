<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="addVehicles.html">Add Product</a>
<br>
<table border="1" >
<tr>
<td> <center> <span style="color:gray">Vehicle Number</span>
</td>
<td> <center> <span style="color:gray">Branch</span>
</td>
<td> <center> <span style="color:gray">Insurance Expiry</span>
</td>
<td> <center> <span style="color:gray">Last Service</span>
</td>
<td> <center> <span style="color:gray">Service Due</span>
</td>
<td> <center> <span style="color:gray">Vehicle Type</span>
</td>
</tr>
<c:forEach var="vehicle"  items="${vehicle}">
<tr>
<td> <center> <span style="color:gray">${vehicle.vehicleNumber}</span>
</td>
<td> <center> <span style="color:gray">${vehicle.branch}</span>
</td>
<td> <center> <span style="color:gray">${vehicle.insuranceExpiry}</span>
</td>
<td> <center> <span style="color:gray">${vehicle.lastService}</span>
</td>
<td> <center> <span style="color:gray">${vehicle.serviceDue}</span>
</td>
<td> <center> <span style="color:gray">${vehicle.vehicleType}</span>
</td>
</tr>
</c:forEach>


</table>
</body>
</html>