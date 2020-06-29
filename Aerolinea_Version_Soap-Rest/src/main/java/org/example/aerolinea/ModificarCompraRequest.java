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
 *         &lt;element name="idCompra" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idVuelo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nomCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="metodoPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="asiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idCompra",
    "idVuelo",
    "nomCliente",
    "metodoPago",
    "asiento"
})
@XmlRootElement(name = "ModificarCompraRequest")
public class ModificarCompraRequest {

    protected int idCompra;
    protected int idVuelo;
    @XmlElement(required = true)
    protected String nomCliente;
    @XmlElement(required = true)
    protected String metodoPago;
    @XmlElement(required = true)
    protected String asiento;

    /**
     * Obtiene el valor de la propiedad idCompra.
     * 
     */
    public int getIdCompra() {
        return idCompra;
    }

    /**
     * Define el valor de la propiedad idCompra.
     * 
     */
    public void setIdCompra(int value) {
        this.idCompra = value;
    }

    /**
     * Obtiene el valor de la propiedad idVuelo.
     * 
     */
    public int getIdVuelo() {
        return idVuelo;
    }

    /**
     * Define el valor de la propiedad idVuelo.
     * 
     */
    public void setIdVuelo(int value) {
        this.idVuelo = value;
    }

    /**
     * Obtiene el valor de la propiedad nomCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCliente() {
        return nomCliente;
    }

    /**
     * Define el valor de la propiedad nomCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCliente(String value) {
        this.nomCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad metodoPago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodoPago() {
        return metodoPago;
    }

    /**
     * Define el valor de la propiedad metodoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodoPago(String value) {
        this.metodoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad asiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsiento() {
        return asiento;
    }

    /**
     * Define el valor de la propiedad asiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsiento(String value) {
        this.asiento = value;
    }

}
