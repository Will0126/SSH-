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
        <form action="/movie/save.action" method="post">
            <legend>新增</legend>
            <label>影片名称</label>
            <input type="text" name="movie.title">
            <label>影片评分</label>
            <input type="text" name="movie.state">
            <label>影片导演</label>
            <input type="text" name="movie.daoyan">
            <label>发行时间</label>
            <input type="text" name="movie.sendtime">
            <label>上映时间</label>
            <input type="text" name="movie.releaseyear">
            <label>影片简介</label>
            <textarea name="movie.jianjie"></textarea>
            <div class="form-action">
                <button class="btn btn-primary">保存</button>
            </div>
        </form>
    </div>
</body>
</html>
