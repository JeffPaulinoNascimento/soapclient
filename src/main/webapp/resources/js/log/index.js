// Filtrar um range de datas no datatable
$.fn.dataTableExt.afnFiltering.push(
    function( settings, data, dataIndex ) {
        let min = $('#dataMin').val();
        let max = $('#dataMax').val();
        let createdAt = data[0] || 0;
        //createdAt=createdAt.split(" ");
        let startDate = moment(min, "DD/MM/YYYY");
        let endDate = moment(max, "DD/MM/YYYY");
        let diffDate = moment(createdAt, "DD/MM/YYYY");

        if ((min == "" || max == "") || (diffDate.isBetween(startDate, endDate))){
            return true;
        }
        return false;
    }
);

function mascara(){
    $(".data-filter").mask("00/00/0000");
}

$(document).ready( function () {

    let table = $('#logTable').DataTable({
        columnDefs:[{targets:0, render:function(data){
            return moment(data).format("DD/MM/YYYY HH:mm:ss.SSS");
        }}],
        "iDisplayLength": 10,
        "aLengthMenu": [[10, 25, 50, 100], [10, 25, 50, 100]],
        "aaSorting": [[0, "desc"]],
        "bProcessing" : true,
        bServerSide : true,
        sAjaxSource : "logs/json",
        sServerMethod : "POST",
        "columns": [
            { "data": "date" },
            { "data": "ip" },
            { "data": "request" },
            { "data": "status" },
            { "data": "userAgent" },
        ],
        "language":{
            "lengthMenu": "Mostrar _MENU_ itens por pagina",
            "zeroRecords": "Nenhum soap encontrado, por favor refaça sua busca",
            "info": "Você está na pagina _PAGE_ de _PAGES_",
            "infoEmpty": "Nenhum soap foi encontrado",
            "infoFiltered": "(filtrado com _MAX_ itens no total)",
            "search": "Pesquisar",
            "paginate": {
                "first":    	"Erste",
                "previous": 	"Anterior",
                "next":     	"Próximo",
                "last":     	"Letzte"
            },
            sProcessing: "<div id='loader'></div>",
        }
    });

    // Lista na tabela somente os registros conforme o filtro das datas
    $('#dataMin, #dataMax').change(function() {
        table.draw();
    });

    $(".data-filter").datepicker({
        dateFormat: "dd/mm/yy",
        changeMonth: true,
        changeYear: true,
        dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado'],
        dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
        dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
        monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro'],
        monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez'],
        nextText: 'Próximo',
        prevText: 'Anterior'
    });
    
    mascara();

    $("#enviar").click(function (e) {
        e.preventDefault();
        if($("#inputFile").val() == ''){
            $("#mensagem").html("Campo obrigatório");
            $("#inputFile").focus();
        }else{
            $("#formUploadFile").submit();
        }
    });

    /*
    let progressBarValue=0;
    $(document).ready(function() {
        $("#progressbar").progressbar({
            value:0
        });
        document.getElementById("progressbarWrapper").style.display = "none";
    });
    function updateProgressBar(progressBarValue)
    {
        $("#progressbar").progressbar("option","value",progressBarValue);
    }
    let req;

    function ajaxFunction(){
        let url = "upload/soap";

        if (window.XMLHttpRequest){
            req = new XMLHttpRequest();
            try{
                req.onreadystatechange = funcReadyStateChange;
                req.open("GET", url, true);
            } catch (e) {
                alert(e);
            }
            req.send(null);
        }

        else if (window.ActiveXObject) {
            req = new ActiveXObject("Microsoft.XMLHTTP");
            if (req) {
                req.onreadystatechange = funcReadyStateChange;
                req.open("GET", url, true);
                req.send();
            }
        }
    }




    function funcReadyStateChange(){
        if (req.readyState == 4){
            if (req.status == 200){
                let xml = req.responseXML;
                let responseNode=xml.getElementsByTagName("response")[0];
                let noOfBytesRead =responseNode.getElementsByTagName("bytes_read")[0].
                    childNodes[0].nodeValue;
                let totalNoOfBytes = responseNode.getElementsByTagName("content_length")[0].
                    childNodes[0].nodeValue;
                progressBarValue=noOfBytesRead/totalNoOfBytes*100;
                document.getElementById("status").style.display="block";
                document.getElementById("percentDone").innerHTML="Percentage Completed: "
                    +Math.floor(progressBarValue)+"%";
                document.getElementById("bytesRead").innerHTML= "Number Of Bytes Read: "+
                    noOfBytesRead;
                document.getElementById("totalNoOfBytes").innerHTML= "Total Number Of Bytes: "+
                    totalNoOfBytes;
                document.getElementById("progressbarWrapper").style.display = "block";

                if (progressBarValue<100){
                    window.setTimeout("ajaxFunction();", 100);
                    window.setTimeout("updateProgressBar(progressBarValue);", 100);

                } else {
                    alert("Done");
                    window.setTimeout("updateProgressBar(100);", 100);
                    document.getElementById("progressbarWrapper").style.display = "none";
                    document.getElementById("status").style.display="none";
                }
            } else {
                alert(req.statusText);
            }
        }
    }
*/

});


