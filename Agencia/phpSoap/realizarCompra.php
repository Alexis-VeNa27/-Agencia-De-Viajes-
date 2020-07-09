<?php
  $client=new SoapClient("http://34.204.7.251:8080/ws/MetroV2_1.wsdl");

  $Compra=$_GET['Compra'];
  $Usuario=$_GET['UsuarioCompra'];
  $TypeVagon=$_GET['TypeVagonCompra'];
  $Origen=$_GET['OrigenCompra'];
  $NombreLinea=$_GET['NombreLineaCompra'];
  $TypePago=$_GET['TypePagoCompra'];
  $Fecha=$_GET['FechaCompra'];
  $Precio=$_GET['PrecioCompra'];

  $parametros= array("Compra" =>$Compra,"Usuario"=>$Usuario, "TypeVagon"=>$TypeVagon, "Origen"=>$Origen, "NombreLinea"=>$NombreLinea, "TypePago"=>$TypePago,"Fecha"=>$Fecha,"Precio"=>$Precio);

  $response= $client->__soapCall('Compra', array($parametros));

  $Param1= $response->{'Compra'};
  $Param2= $response->{'Usuario'};
  $Param3= $response->{'TypeVagon'};
  $Param4= $response->{'Origen'};
  $Param5= $response->{'NombreLinea'};
  $Param6= $response->{'TypePago'};
  $Param7= $response->{'Fecha'};
  $Param8= $response->{'Precio'};

  #$mensaje = $response->{'Compra'}.$response->{'Usuario'}.$response->{'TypeVagon'}.$response->{'Origen'}.$response->{'NombreLinea'}.$response->{'TypePago'}.$response->{'Fecha'}.$response->{'Precio'};

  #echo $mensaje;
  echo $Param1;
  echo $Param2;
  echo $Param3;
  echo $Param4;
  echo $Param5;
  echo $Param6;
  echo $Param7;
  echo $Param8;

?>
