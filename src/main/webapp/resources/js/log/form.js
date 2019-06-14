$(document).ready(function () {

    const options = {
        translation: {
            "A":{pattern: /[A-Z]/}
        }
    }

    function mascara(){
        //$("#data").mask("00/00/0000 00:00:00");
        $("#ip").mask("000.000.000.00");
        $("#status").mask("000");
        // $("#request").mask("AAA/AAAA/0.0", options);
    }
    mascara();
})