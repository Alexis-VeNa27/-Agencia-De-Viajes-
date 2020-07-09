<?php
  $client=new SoapClient("http://34.204.7.251:8080/ws/MetroV2_1.wsdl");

  $Compra=$_GET['CompraUpdate'];
  $Usuario=$_GET['UsuarioCompraUpdate'];
  $TypeVagon=$_GET['TypeVagonCompraUpdate'];
  $Origen=$_GET['OrigenCompraUpdate'];
  $NombreLinea=$_GET['NombreLineaCompraUpdate'];
  $TypePago=$_GET['TypePagoCompraUpdate'];
  $Fecha=$_GET['FechaCompraUpdate'];
  $Precio=$_GET['PrecioCompraUpdate'];

  $parametros= array("Compra" =>$Compra,"Usuario"=>$Usuario, "TypeVagon"=>$TypeVagon, "Origen"=>$Origen, "NombreLinea"=>$NombreLinea, "TypePago"=>$TypePago,"Fecha"=>$Fecha,"Precio"=>$Precio);

  $response= $client->__soapCall('ActualizarCompra', array($parametros));

  $Param1= $response->{'Respuesta'};

  #$mensaje = $response->{'Compra'}.$response->{'Usuario'}.$response->{'TypeVagon'}.$response->{'Origen'}.$response->{'NombreLinea'}.$response->{'TypePago'}.$response->{'Fecha'}.$response->{'Precio'};

  #echo $mensaje;
  echo $Param1;

?>
