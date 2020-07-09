<?php
  $client=new SoapClient("http://54.162.225.248:8080/hotel.wsdl");

  $idReservacion=$_GET['idReservacion'];
  $idCliente=$_GET['idClienteUpdate'];
  $fechaLlegada=$_GET['fechaLlegadaUpdate'];
  $fechaSalida=$_GET['fechaSalidaUpdate'];
  $numPersonas=$_GET['numPersonasUpdate'];
  $tipoHabitacion=$_GET['tipoHabitacionUpdate'];

  $parametros= array("idReservacion" =>$idReservacion, "fechaLlegada" =>$fechaLlegada,"fechaSalida"=>$fechaSalida, "numPersonas"=>$numPersonas, "tipoHabitacion"=>$tipoHabitacion, "idCliente"=>$idCliente);

  $response= $client->__soapCall('EditarReservacion', array($parametros));

  $Param1= $response->{'respuesta'};
  $Param2= $response->{'precio'};

  #$mensaje = $response->{'Compra'}.$response->{'Usuario'}.$response->{'TypeVagon'}.$response->{'Origen'}.$response->{'NombreLinea'}.$response->{'TypePago'}.$response->{'Fecha'}.$response->{'Precio'};

  #echo $mensaje;
  echo $Param1." ";
  echo "Precio= ".$Param2;

?>
