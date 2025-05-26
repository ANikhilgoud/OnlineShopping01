<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<frm:form modelAttribute="emp" >


<table align="center" bgcolor="green">
<tr>
<td>Employee Number::</td>
<td><frm:input path="Empno" readonly="true"/></td>
</tr>

<tr>
<td>Employee Name::</td>
<td><frm:input path="Ename" /></td>
</tr>

<tr>
<td>Employee Job::</td>
<td><frm:input path="job"/></td>
</tr>

<tr>
<td>Employee salary::</td>
<td><frm:input path="sal" /></td>
</tr>

<tr>
<td>Employee DepatmentNo::</td>
<td><frm:input path="deptno"/></td>
</tr>
<tr>
<td><input type="submit" value="update"></td>
<td><input type="reset" value="cancel"></td>
</tr>
</table>
</frm:form>