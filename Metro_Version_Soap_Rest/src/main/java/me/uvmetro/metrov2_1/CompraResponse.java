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
 *         &lt;element name="Compra" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="TypeVagon" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="NombreLinea" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="TypePago" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "compra",
    "usuario",
    "typeVagon",
    "origen",
    "nombreLinea",
    "typePago",
    "fecha",
    "precio"
})
@XmlRootElement(name = "CompraResponse")
public class CompraResponse {

    @XmlElement(name = "Compra", required = true)
    protected Object compra;
    @XmlElement(name = "Usuario", required = true)
    protected Object usuario;
    @XmlElement(name = "TypeVagon", required = true)
    protected Object typeVagon;
    @XmlElement(name = "Origen", required = true)
    protected Object origen;
    @XmlElement(name = "NombreLinea", required = true)
    protected Object nombreLinea;
    @XmlElement(name = "TypePago", required = true)
    protected Object typePago;
    @XmlElement(name = "Fecha", required = true)
    protected Object fecha;
    @XmlElement(name = "Precio", required = true)
    protected Object precio;

    /**
     * Obtiene el valor de la propiedad compra.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCompra() {
        return compra;
    }

    /**
     * Define el valor de la propiedad compra.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCompra(Object value) {
        this.compra = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUsuario(Object value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad typeVagon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTypeVagon() {
        return typeVagon;
    }

    /**
     * Define el valor de la propiedad typeVagon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTypeVagon(Object value) {
        this.typeVagon = value;
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
     * Obtiene el valor de la propiedad typePago.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTypePago() {
        return typePago;
    }

    /**
     * Define el valor de la propiedad typePago.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTypePago(Object value) {
        this.typePago = value;
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
