<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<!DOCTYPE html>
<html>
    <body>
        <h2>You are welcome!</h2>
        <br>
        <br>
        <h1>Your name is: ${employee.name}</h1>
        <br>
        <h1>Your surname is: ${employee.surname}</h1>
        <br>
        <h1>Your salary is: ${employee.salary}</h1>
        <br>
        <h1>Your department is: ${employee.department}</h1>
        <br>
        <h1>Your car is: ${employee.carBrand}</h1>
        <br>
        <h1>Your phone number is: ${employee.phoneNumber}</h1>
        <br>
        <h1>Your email is: ${employee.email}</h1>
        <br>
<%--        <h1>Your language(s):--%>
<%--            <ul>--%>
<%--                <c:forEach var="lang" items="${employee.languages}" />--%>
<%--                <li>${lang}</li>--%>
<%--            </ul>--%>
<%--            ${employee.carBrand}</h1>--%>
    </body>
</html>