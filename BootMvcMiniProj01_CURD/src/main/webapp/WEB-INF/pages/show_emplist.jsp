<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:choose>
<c:when test="${!empty EmpList}">
	<h1 style="text-align: center" ;color:red>Employee Data</h1>
	<table border="1" align="center" bgcolor="cyan">
		<tr style="color: red">
			<th>empno</th>
			<th>emp name</th>
			<th>job</th>
			<th>salary</th>
			<th>deptno</th>
			<th>Operations</th>
		</tr>

		<c:forEach var="emp" items="${EmpList}">
			<tr style="color: blue">
				<td>${emp.empno }</td>
				<td>${emp.ename }</td>
				
				<td>${emp.job }</td>
				<td>${emp.sal }</td>
				<td>${emp.deptno }</td>
				<td><a href="delete?no=${emp.empno}"> delete</a></td>
				<td><a href="edit"> edit</a></td>
			</tr>
		</c:forEach>

	</table>
<h1 Style="text-align:center;color:green">${resultmsg}</h1>	
</c:when>
<c:otherwise>

<h1 style="text-align:center;color:red">Employee Not Found</h1>

</c:otherwise>
</c:choose>
<a href="register">Add Employee</a>