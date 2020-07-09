<?php
  $client=new SoapClient("http://54.162.225.248:8080/hotel.wsdl");

  $idReservacion=$_GET['idReservacionDelete'];

  $parametros= array("idReservacion" =>$idReservacion);

  $response= $client->__soapCall('CancelarReservacion', array($parametros));

  $Param1= $response->{'respuesta'};

  #$mensaje = $response->{'Compra'}.$response->{'Usuario'}.$response->{'TypeVagon'}.$response->{'Origen'}.$response->{'NombreLinea'}.$response->{'TypePago'}.$response->{'Fecha'}.$response->{'Precio'};

  #echo $mensaje;
  echo $Param1;

?>
