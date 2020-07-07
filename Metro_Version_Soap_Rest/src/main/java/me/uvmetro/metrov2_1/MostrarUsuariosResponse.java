//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.06.16 a las 09:01:46 PM CDT 
//


package me.uvmetro.metrov2_1;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="usuario" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="NombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FechaDeNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Correo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MetodoPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="NumeroTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "usuario"
})
@XmlRootElement(name = "MostrarUsuariosResponse")
public class MostrarUsuariosResponse {

    @XmlElement(required = true)
    protected List<MostrarUsuariosResponse.Usuario> usuario;

    /**
     * Gets the value of the usuario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usuario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsuario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MostrarUsuariosResponse.Usuario }
     * 
     * 
     */
    public List<MostrarUsuariosResponse.Usuario> getUsuario() {
        if (usuario == null) {
            usuario = new ArrayList<MostrarUsuariosResponse.Usuario>();
        }
        return this.usuario;
    }


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
     *         &lt;element name="NombreUsuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FechaDeNacimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Correo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MetodoPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="NumeroTarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "nombreUsuario",
        "fechaDeNacimiento",
        "correo",
        "metodoPago",
        "numeroTarjeta"
    })
    public static class Usuario {

        @XmlElement(name = "NombreUsuario", required = true)
        protected String nombreUsuario;
        @XmlElement(name = "FechaDeNacimiento", required = true)
        protected String fechaDeNacimiento;
        @XmlElement(name = "Correo", required = true)
        protected String correo;
        @XmlElement(name = "MetodoPago", required = true)
        protected String metodoPago;
        @XmlElement(name = "NumeroTarjeta", required = true)
        protected String numeroTarjeta;

        /**
         * Obtiene el valor de la propiedad nombreUsuario.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreUsuario() {
            return nombreUsuario;
        }

        /**
         * Define el valor de la propiedad nombreUsuario.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreUsuario(String value) {
            this.nombreUsuario = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaDeNacimiento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaDeNacimiento() {
            return fechaDeNacimiento;
        }

        /**
         * Define el valor de la propiedad fechaDeNacimiento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaDeNacimiento(String value) {
            this.fechaDeNacimiento = value;
        }

        /**
         * Obtiene el valor de la propiedad correo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorreo() {
            return correo;
        }

        /**
         * Define el valor de la propiedad correo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorreo(String value) {
            this.correo = value;
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
         * Obtiene el valor de la propiedad numeroTarjeta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroTarjeta() {
            return numeroTarjeta;
        }

        /**
         * Define el valor de la propiedad numeroTarjeta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroTarjeta(String value) {
            this.numeroTarjeta = value;
        }

    }

}
