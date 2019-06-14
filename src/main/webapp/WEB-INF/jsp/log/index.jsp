<!--Data, IP, Request, Status, User Agent (delimitado por aspas duplas-->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>

<head>
    <title>Sistema</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">

    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <link rel="stylesheet" href="/logProject/resources/css/index/index.css"/>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>
    <script src="/logProject/resources/js/moment/moment.js" charset="utf8"></script>

    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <link rel="stylesheet" href="/logProject/resources/css/jquery-ui/jquery-ui.css"/>
    <link rel="stylesheet" href="/logProject/resources/css/jquery-ui/jquery-ui.theme.css"/>
    <script src="/logProject/resources/js/jquery-ui/jquery-ui.js" charset="utf8"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.15/jquery.mask.min.js"></script>

    <script src="/logProject/resources/js/testeObject/index.js" charset="utf8"></script>
</head>

<body>

<div>
    <span><p>Digite um periodo de data para filtrar</p></span>
    <div class="input-data">
        <p>Data inicio</p>
        <input type="text" id="dataMin" name="min" class="data-filter">
        <p>Data fim</p>
        <input type="text" id="dataMax" name="max" class="data-filter">
    </div>
</div>

<table id="logTable" class="table table-bordered table-hover" width="100%" >
    <thead>
    <tr>
        <th id="data">DATA</th>
        <th>IP</th>
        <th>REQUEST</th>
        <th>STATUS</th>
        <th>USER AGENT</th>
    </tr>
    </thead>
</table>

<form action="<c:url value="/upload/testeObject"/>" method="POST" enctype="multipart/form-data" id="formUploadFile">
    <fieldset>
        <legend>Upload de Arquivo</legend>
        <input type="file" name="testeObject" id="inputFile"/>
        <button type="submit" id="enviar">Enviar arquivo</button>
        <div id="mensagem"></div>
    </fieldset>
</form>

</body>
</html>