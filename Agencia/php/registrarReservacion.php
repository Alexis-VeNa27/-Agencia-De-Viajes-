<?php
  $client=new SoapClient("http://54.162.225.248:8080/hotel.wsdl");

  $idCliente=$_GET['idCliente'];
  $fechaLlegada=$_GET['fechaLlegada'];
  $fechaSalida=$_GET['fechaSalida'];
  $numPersonas=$_GET['numPersonas'];
  $tipoHabitacion=$_GET['tipoHabitacion'];

  $parametros= array("fechaLlegada" =>$fechaLlegada,"fechaSalida"=>$fechaSalida, "numPersonas"=>$numPersonas, "tipoHabitacion"=>$tipoHabitacion, "idCliente"=>$idCliente);

  $response= $client->__soapCall('HacerReservacion', array($parametros));

  $Param1= $response->{'respuesta'};
  $Param2= $response->{'precio'};

  #$mensaje = $response->{'Compra'}.$response->{'Usuario'}.$response->{'TypeVagon'}.$response->{'Origen'}.$response->{'NombreLinea'}.$response->{'TypePago'}.$response->{'Fecha'}.$response->{'Precio'};

  #echo $mensaje;
  echo $Param1." ";
  echo "Precio= ".$Param2;

?>
