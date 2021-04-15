<html>
        <head>
        <title>Login Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        </head>

<style>

body{
background-color:#d3e0ea;
text-align:center;
padding:300px 100px 100px 100px;
height:100px;
}
</style>

        <body>
        <div id="login">

        <div class="alert alert-danger" role="alert">
${flash.message}
</div>

<form action ="/home" method="post">
<label for="text">Username</label>
<input type="text" name="username" id="username" required/>
<br><br>
<label for="password">Password</label>
<input type="password" name="password" id="password" required/>
<br><br>
<input type="submit" class="btn btn-success" value="Login"/>
<br><br>
</form>

</div>
</body>
</html>