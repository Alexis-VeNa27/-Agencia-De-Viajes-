<?php
    $id_compra = $_GET['idCompra'];    
    $client = new SoapClient("http://3.86.69.101:8080/ws/Aerolinea.wsdl");

    if ($id_compra === ''){
        $incompleto = "Ingresa el Id Compra !!!";
        echo $incompleto;
    } else {
        $parametros = array("idCompra" => $id_compra);
        $response = $client->__soapCall('CancelarCompra', array($parametros));      
        $mensaje = $response->{'mensaje'};
        echo $mensaje;
    }
    
    //Cancelar compra con rest...
    /*$url = "http://3.86.69.101:8080/rest/compras/$id_compra";
    $json = file_get_contents($url, false, stream_context_create(array('http' => array('method' => 'DELETE'))));*/            
?>