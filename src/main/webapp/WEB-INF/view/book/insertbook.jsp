<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/5/15
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="<%=request.getContextPath()%>/insertbook.jhtml" method="post">
 <table>
     <tr>
       <td>书籍名称</td>
       <td><input type="text" name="bookname" />></td>
     </tr>
   <tr>
     <td colspan="2"><input type="submit"  value="提交" /></td>
   </tr>
 </table>
</form>
</body>
</html>
