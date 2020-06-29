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
 *         &lt;element name="idVuelo" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "idVuelo",
    "origen",
    "destino",
    "hora",
    "fecha",
    "precio"
})
@XmlRootElement(name = "EliminarVueloResponse")
public class EliminarVueloResponse {

    @XmlElement(required = true)
    protected Object mensaje;
    @XmlElement(required = true)
    protected Object idVuelo;
    @XmlElement(required = true)
    protected Object origen;
    @XmlElement(required = true)
    protected Object destino;
    @XmlElement(required = true)
    protected Object hora;
    @XmlElement(required = true)
    protected Object fecha;
    @XmlElement(required = true)
    protected Object precio;

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
     * Obtiene el valor de la propiedad origen.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOrigen(Object value) {
        this.origen = value;
    }

    /**
     * Obtiene el valor de la propiedad destino.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDestino() {
        return destino;
    }

    /**
     * Define el valor de la propiedad destino.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDestino(Object value) {
        this.destino = value;
    }

    /**
     * Obtiene el valor de la propiedad hora.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHora() {
        return hora;
    }

    /**
     * Define el valor de la propiedad hora.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHora(Object value) {
        this.hora = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFecha(Object value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPrecio(Object value) {
        this.precio = value;
    }

}
