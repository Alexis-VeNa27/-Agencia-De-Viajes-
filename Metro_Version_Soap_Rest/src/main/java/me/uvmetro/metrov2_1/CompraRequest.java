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
 *         &lt;element name="Compra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TypeVagon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombreLinea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TypePago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Precio" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "CompraRequest")
public class CompraRequest {

    @XmlElement(name = "Compra", required = true)
    protected String compra;
    @XmlElement(name = "Usuario", required = true)
    protected String usuario;
    @XmlElement(name = "TypeVagon", required = true)
    protected String typeVagon;
    @XmlElement(name = "Origen", required = true)
    protected String origen;
    @XmlElement(name = "NombreLinea", required = true)
    protected String nombreLinea;
    @XmlElement(name = "TypePago", required = true)
    protected String typePago;
    @XmlElement(name = "Fecha", required = true)
    protected String fecha;
    @XmlElement(name = "Precio", required = true)
    protected String precio;

    /**
     * Obtiene el valor de la propiedad compra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompra() {
        return compra;
    }

    /**
     * Define el valor de la propiedad compra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompra(String value) {
        this.compra = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad typeVagon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeVagon() {
        return typeVagon;
    }

    /**
     * Define el valor de la propiedad typeVagon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeVagon(String value) {
        this.typeVagon = value;
    }

    /**
     * Obtiene el valor de la propiedad origen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreLinea.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreLinea() {
        return nombreLinea;
    }

    /**
     * Define el valor de la propiedad nombreLinea.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreLinea(String value) {
        this.nombreLinea = value;
    }

    /**
     * Obtiene el valor de la propiedad typePago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypePago() {
        return typePago;
    }

    /**
     * Define el valor de la propiedad typePago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypePago(String value) {
        this.typePago = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecio(String value) {
        this.precio = value;
    }

}
