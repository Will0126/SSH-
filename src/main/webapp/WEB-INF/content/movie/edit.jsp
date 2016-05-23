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
        <form action="/movie/update.action" method="post">
            <input type="hidden" name="move.id" value="${movie.id}" />
            <legend>编辑影片</legend>
            <label>影片名称</label>
            <input type="text" name="movie.title" value="${movie.title}">
            <label>影片评分</label>
            <input type="text" name="movie.state" value="${movie.state}">
            <label>影片导演</label>
            <input type="text" name="movie.daoyan" value="${movie.daoyan}">
            <label>发行时间</label>
            <input type="text" name="movie.sendtime" value="${movie.sendtime}">
            <label>上映时间</label>
            <input type="text" name="movie.releaseyear" value="${movie.releaseyear}">
            <label>影片简介</label>
            <textarea name="movie.jianjie">${movie.jianjie}</textarea>
            <div class="form-action">
                <button class="btn btn-primary">保存</button>
            </div>
        </form>
    </div>
</body>
</html>
