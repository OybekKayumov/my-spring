<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <body>
        <h2>Enter your details</h2>

        <br>
        <br>

        <form:form action="showDetails" modelAttribute="employee">
            Name <form:input path="name" />
            <form:errors path="name" />
            <br> <br>

            Surname <form:input path="surname" />
            <form:errors path="surname" />
            <br> <br>
            
            Salary <form:input path="salary" />
            <form:errors path="salary" />
            <br> <br>

            Department
               <form:select path="department">
<%--                   <form:option value="Information Technology" label="IT" />--%>
<%--                   <form:option value="Human Resources" label="HR" />--%>
<%--                   <form:option value="Sales" label="Sales" />--%>
<%--                   <form:option value="Card" label="Card" />--%>

                   <form:options items="${employee.departments}" />
               </form:select>
            <br><br>

            Which car do you want?<br>
<%--                BMW  <form:radiobutton path="carBrand" value="BMW" /><br>--%>
<%--                Audi <form:radiobutton path="carBrand" value="Audi" /><br>--%>
<%--                MB   <form:radiobutton path="carBrand" value="Mercedes-Benz" /><br>--%>
            <form:radiobuttons path="carBrand"
                               items="${employee.carBrands}"/>
            <br><br>
<%--            Foreign Language(s)--%>
<%--&lt;%&ndash;                EN <form:checkbox path="languages" value="English" />&ndash;%&gt;--%>
<%--&lt;%&ndash;                DE <form:checkbox path="languages" value="Deutch" />&ndash;%&gt;--%>
<%--&lt;%&ndash;                FR <form:checkbox path="languages" value="French" />&ndash;%&gt;--%>
<%--                <form:checkboxes path="languages"--%>
<%--                                 items="${employee.languageList}" />--%>
<%--            <br><br>--%>

            Phone Number <form:input path="phoneNumber" />
            <form:errors path="phoneNumber" />
            <br> <br>

            Email <form:input path="email" />
            <form:errors path="email" />
            <br> <br>

            <input type="submit" value="OK">

        </form:form>

    </body>
</html>