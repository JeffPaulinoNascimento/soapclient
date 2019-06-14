<!DOCTYPE html>
<html>


<head>
    <title>Sistema</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    <script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.15/jquery.mask.min.js"></script>
    <script src="/logProject/resources/js/testeObject/form.js"></script>
</head>
<body>
    <form action="${linkTo[LogController].adiciona(null)}" method="post">

        <label for="ip">Ip:</label>
        <input type="text" name="testeDTO.ip" id="ip"/>

        <label for="data">Data:</label>
        <input type="text" name="testeDTO.data" id="data"/>

        <label for="request">Request:</label>
        <input type="text" name="testeDTO.request" id="request"/>

        <label for="status">Status:</label>
        <input type="text" name="testeDTO.status" id="status"/>

        <label for="userAgent">User Agent:</label>
        <input type="text" name="testeDTO.userAgent" id="userAgent"/>

        <input type="submit" value="Cadastrar Log" class="btn"/>
    </form>
</body>
</html>