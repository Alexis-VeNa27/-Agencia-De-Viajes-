<?php
  $client=new SoapClient("http://34.204.7.251:8080/ws/MetroV2_1.wsdl");

  $NombreUsuario=$_GET['NombreUsuario'];
  $FechaDeNacimiento=$_GET['FechaDeNacimiento'];
  $Correo=$_GET['Correo'];
  $MetodoPagoUsuario=$_GET['MetodoPagoUsuario'];
  $NumeroTarjeta=$_GET['NumeroTarjeta'];

  $parametros= array("NombreUsuario"=>$NombreUsuario, "FechaDeNacimiento"=>$FechaDeNacimiento, "Correo"=>$Correo, "MetodoPagoUsuario"=>$MetodoPagoUsuario, "NumeroTarjeta"=>$NumeroTarjeta);

  $response= $client->__soapCall('Usuario', array($parametros));

  $Param1= $response->{'Respuesta'};

  #$mensaje = $response->{'Compra'}.$response->{'Usuario'}.$response->{'TypeVagon'}.$response->{'Origen'}.$response->{'NombreLinea'}.$response->{'TypePago'}.$response->{'Fecha'}.$response->{'Precio'};

  #echo $mensaje;
  echo $Param1;

?>
