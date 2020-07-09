<?php
    
    $client = new SoapClient("http://3.86.69.101:8080/ws/Aerolinea.wsdl");

    $id_compra = $_GET['idCompra'];
    $id_vuelo = $_GET['idVuelo'];    
    $nom_cliente = $_GET['nomCliente'];
    $metodo_pago = $_GET['metodoPago'];
    $asientoColumna = $_GET['asientoColumna'];        
    $asientoFila = $_GET['asientoFila'];        
    $asiento = $asientoColumna.'-'.$asientoFila;

    if ($id_compra === '' || $id_vuelo === '' || $nom_cliente === '' || $metodo_pago === '' || $asientoColumna === '' || $asientoFila === ''){
        $incompleto = "Completa Todos Los Campos !!!";
        echo $incompleto;
    } else {
        $parametros = array("idCompra" => $id_compra, "idVuelo" => $id_vuelo, "nomCliente" => $nom_cliente, "metodoPago" => $metodo_pago, "asiento" => $asiento);
        $response = $client->__soapCall('RealizarCompra', array($parametros));      
        $mensaje = $response->{'mensaje'};
        echo $mensaje;
    }    
?>