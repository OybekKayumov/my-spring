<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>--%>

<%--
  Created by IntelliJ IDEA.
  User: Oybek
  Date: 8/6/2024
  Time: 8:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Employees</title>
</head>
<body>
    <h2>All Employees</h2>
    <br>

    <table>
        <tr>
            <th>Name</th>
            <th>Surame</th>
            <th>Department</th>
            <th>Salary</th>
            <th>Operations</th>
        </tr>

        <c:forEach var="emp" items="${allEmps}">
            <c:url var="updateButton" value="/updateInfo">
                <c:param name="empId" value="${emp.id}" />
            </c:url>

            <c:url var="deleteButton" value="/deleteEmployee">
                <c:param name="empId" value="${emp.id}" />
            </c:url>

            <tr>
                <td>${emp.name}</td>
                <td>${emp.surname}</td>
                <td>${emp.department}</td>
                <td>${emp.salary}</td>
                <td>
                    <input type="button" value="Update"
                           onclick="window.location.href='${updateButton}'"/>
           
                    <input type="button" value="Delete"
                           onclick="window.location.href='${deleteButton}'"/>
                </td>
            </tr>
        </c:forEach>
    </table>

    <input type="button" value="Add" onclick="window.location.href = 'addNewEmployee'">

</body>
</html>
