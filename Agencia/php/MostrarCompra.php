<?php
    $id_compra = $_GET['idCompra'];
    
    $url = "http://3.86.69.101:8080/rest/compras/{$id_compra}";    
    $json = file_get_contents($url);
    $datos = json_decode($json, true);
    
    if ($id_compra === "") {
        $incompleto = "Ingresa el Id Compra !!!";
        echo $incompleto;
    } else if ($datos === NULL) {
        $null = "La Compra Con El ID: ". $id_compra ." No Existe !";        
        echo $null;        
    } else {        
        echo("Id compra: ".$datos['idCompra']." | ");        
        echo("Id vuelo: ".$datos['idVueloF']." | ");                
        echo("Nombre cliente: ".$datos['nomCliente']." | ");
        echo("Método pago: ".$datos['metodoPago']." | ");
        echo("Asiento: ".$datos['asiento']." | ");        
    }        
?>