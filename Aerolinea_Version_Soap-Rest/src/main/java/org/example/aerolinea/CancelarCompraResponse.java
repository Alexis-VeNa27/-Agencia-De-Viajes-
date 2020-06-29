//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.05.20 a las 04:00:17 PM CDT 
//


package org.example.aerolinea;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="idCompra" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="idVuelo" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="nomCliente" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="metodoPago" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="asiento" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mensaje",
    "idCompra",
    "idVuelo",
    "nomCliente",
    "metodoPago",
    "asiento"
})
@XmlRootElement(name = "CancelarCompraResponse")
public class CancelarCompraResponse {

    @XmlElement(required = true)
    protected Object mensaje;
    @XmlElement(required = true)
    protected Object idCompra;
    @XmlElement(required = true)
    protected Object idVuelo;
    @XmlElement(required = true)
    protected Object nomCliente;
    @XmlElement(required = true)
    protected Object metodoPago;
    @XmlElement(required = true)
    protected Object asiento;

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMensaje(Object value) {
        this.mensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad idCompra.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdCompra() {
        return idCompra;
    }

    /**
     * Define el valor de la propiedad idCompra.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIdCompra(Object value) {
        this.idCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad idVuelo.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdVuelo() {
        return idVuelo;
    }

    /**
     * Define el valor de la propiedad idVuelo.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIdVuelo(Object value) {
        this.idVuelo = value;
    }

    /**
     * Obtiene el valor de la propiedad nomCliente.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNomCliente() {
        return nomCliente;
    }

    /**
     * Define el valor de la propiedad nomCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNomCliente(Object value) {
        this.nomCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad metodoPago.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMetodoPago() {
        return metodoPago;
    }

    /**
     * Define el valor de la propiedad metodoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMetodoPago(Object value) {
        this.metodoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad asiento.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAsiento() {
        return asiento;
    }

    /**
     * Define el valor de la propiedad asiento.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAsiento(Object value) {
        this.asiento = value;
    }

}
