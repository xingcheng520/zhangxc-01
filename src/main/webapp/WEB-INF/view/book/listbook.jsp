<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/5/15
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title></title>
</head>
<body>
 <center><a href="<%=request.getContextPath()%>/selectlistbook.jhtml">点击查询</a></center>
 <table border="1" cellpadding="0" cellspacing="0" align="center">
    <tr>
      <td>书籍编号</td>
      <td>书籍名称</td>
        <td>操作</td>
    </tr>
   <c:forEach items="${bookList}" var="book">
     <tr>
       <td>${book.bookid}</td>
       <td>${book.bookname}</td>
         <td><input type="button" value="删除" onclick="deletebook(${book.bookid})"></td>
     </tr>
   </c:forEach>
 </table>
</body>
<script>

    function deletebook(bookid){
         //alert(bookid);
        location.href="<%=request.getContextPath()%>/deletebook.jhtml?bookid="+bookid;
    }
</script>
</html>
