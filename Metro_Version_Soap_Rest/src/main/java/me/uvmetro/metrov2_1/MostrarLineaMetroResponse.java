//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.16 a las 09:01:46 PM CDT 
//


package me.uvmetro.metrov2_1;

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
 *         &lt;element name="NombreLinea" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Destino" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Horario" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Precio" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "nombreLinea",
    "origen",
    "destino",
    "horario",
    "precio"
})
@XmlRootElement(name = "MostrarLineaMetroResponse")
public class MostrarLineaMetroResponse {

    @XmlElement(name = "NombreLinea", required = true)
    protected Object nombreLinea;
    @XmlElement(name = "Origen", required = true)
    protected Object origen;
    @XmlElement(name = "Destino", required = true)
    protected Object destino;
    @XmlElement(name = "Horario", required = true)
    protected Object horario;
    @XmlElement(name = "Precio", required = true)
    protected Object precio;

    /**
     * Obtiene el valor de la propiedad nombreLinea.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNombreLinea() {
        return nombreLinea;
    }

    /**
     * Define el valor de la propiedad nombreLinea.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNombreLinea(Object value) {
        this.nombreLinea = value;
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
     * Obtiene el valor de la propiedad horario.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHorario() {
        return horario;
    }

    /**
     * Define el valor de la propiedad horario.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHorario(Object value) {
        this.horario = value;
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
