<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Will</title>
    <link rel="stylesheet" href="/repo/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <a href="/movie/add.action" class="btn btn-success">新增影片</a>
        <table class="table">
            <thead>
                <tr>
                    <th>影片名称</th>
                    <th>影片评分</th>
                    <th>影片主演</th>
                    <th>#</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${movieList}" var="movie">
                    <tr>
                        <td width="400">${movie.title}</td>
                        <td width="300">
                            <c:forEach items="${movie.actors}" var="actor">
                                ${actor.name}&nbsp;|
                            </c:forEach>
                        </td>
                        <td>${movie.rate}</td>
                        <a href="/movie/edit.action?id=${movie.id}">编辑</a>
                        <a href="javascript:;" class="delLink" rel="${movie.id}">删除</a>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
<script src="/repo/js/jquery.min.js"/>
<script>
    $(function(){
        $(".delLink").click(function(){
            var id =  $(this).attr("rel");
            if(confirm("确定删除？")){
                window.location.href = "/movie/del.action?id="+id;
            }
        });
    })
</script>
</body>
</html>
