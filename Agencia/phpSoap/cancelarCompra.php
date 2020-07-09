<?php
  $client=new SoapClient("http://34.204.7.251:8080/ws/MetroV2_1.wsdl");

  $Compra=$_GET['Cancelacion'];

  $parametros= array("Cancelacion" =>$Cancelacion);

  $response= $client->__soapCall('CancelarCompra', array($parametros));

  $Param1= $response->{'Respuesta'};

  #$mensaje = $response->{'Compra'}.$response->{'Usuario'}.$response->{'TypeVagon'}.$response->{'Origen'}.$response->{'NombreLinea'}.$response->{'TypePago'}.$response->{'Fecha'}.$response->{'Precio'};

  #echo $mensaje;
  echo $Param1;

?>
