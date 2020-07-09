<?php
  $client=new SoapClient("http://54.162.225.248:8080/hotel.wsdl");

  $idReservacion=$_GET['idReservacionView'];

  $parametros= array("idReservacion" =>$idReservacion);

  $response= $client->__soapCall('ConsultarReservacion', array($parametros));

  $Param1= $response->{'fechaLlegada'};
  $Param2= $response->{'fechaSalida'};
  $Param3= $response->{'numPersonas'};
  $Param4= $response->{'tipoHabitacion'};
  $Param5= $response->{'idCliente'};
  $Param6= $response->{'precio'};

  #$mensaje = $response->{'Compra'}.$response->{'Usuario'}.$response->{'TypeVagon'}.$response->{'Origen'}.$response->{'NombreLinea'}.$response->{'TypePago'}.$response->{'Fecha'}.$response->{'Precio'};

  #echo $mensaje;
  echo "Fecha de llegada= ".$Param1." - ";
  echo "Fecha de Salida= ".$Param2." - ";
  echo "Numero de Personas= ".$Param3." - ";
  echo "Tipo de Habitacion= ".$Param4." - ";
  echo "Id del Cliente= ".$Param5." - ";
  echo "Precio= ".$Param6." ";

?>
