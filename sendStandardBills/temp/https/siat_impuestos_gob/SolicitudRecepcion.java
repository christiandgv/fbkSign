
package https.siat_impuestos_gob;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for solicitudRecepcion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solicitudRecepcion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="archivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoAmbiente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoDocumentoFiscal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoDocumentoSector" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoEmision" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoModalidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoPuntoVenta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codigoSistema" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoSucursal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cuape" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cufd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cuis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fechaEnvio" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="hashArchivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nit" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitudRecepcion", propOrder = {
    "archivo",
    "codigoAmbiente",
    "codigoDocumentoFiscal",
    "codigoDocumentoSector",
    "codigoEmision",
    "codigoModalidad",
    "codigoPuntoVenta",
    "codigoSistema",
    "codigoSucursal",
    "cuape",
    "cufd",
    "cuis",
    "fechaEnvio",
    "hashArchivo",
    "nit"
})
public class SolicitudRecepcion {

    @XmlElement(required = true)
    protected String archivo;
    protected int codigoAmbiente;
    protected int codigoDocumentoFiscal;
    protected int codigoDocumentoSector;
    protected int codigoEmision;
    protected int codigoModalidad;
    @XmlElementRef(name = "codigoPuntoVenta", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codigoPuntoVenta;
    @XmlElement(required = true)
    protected String codigoSistema;
    protected int codigoSucursal;
    @XmlElement(required = true)
    protected String cuape;
    @XmlElement(required = true)
    protected String cufd;
    @XmlElement(required = true)
    protected String cuis;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEnvio;
    @XmlElement(required = true)
    protected String hashArchivo;
    protected long nit;

    /**
     * Gets the value of the archivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivo() {
        return archivo;
    }

    /**
     * Sets the value of the archivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivo(String value) {
        this.archivo = value;
    }

    /**
     * Gets the value of the codigoAmbiente property.
     * 
     */
    public int getCodigoAmbiente() {
        return codigoAmbiente;
    }

    /**
     * Sets the value of the codigoAmbiente property.
     * 
     */
    public void setCodigoAmbiente(int value) {
        this.codigoAmbiente = value;
    }

    /**
     * Gets the value of the codigoDocumentoFiscal property.
     * 
     */
    public int getCodigoDocumentoFiscal() {
        return codigoDocumentoFiscal;
    }

    /**
     * Sets the value of the codigoDocumentoFiscal property.
     * 
     */
    public void setCodigoDocumentoFiscal(int value) {
        this.codigoDocumentoFiscal = value;
    }

    /**
     * Gets the value of the codigoDocumentoSector property.
     * 
     */
    public int getCodigoDocumentoSector() {
        return codigoDocumentoSector;
    }

    /**
     * Sets the value of the codigoDocumentoSector property.
     * 
     */
    public void setCodigoDocumentoSector(int value) {
        this.codigoDocumentoSector = value;
    }

    /**
     * Gets the value of the codigoEmision property.
     * 
     */
    public int getCodigoEmision() {
        return codigoEmision;
    }

    /**
     * Sets the value of the codigoEmision property.
     * 
     */
    public void setCodigoEmision(int value) {
        this.codigoEmision = value;
    }

    /**
     * Gets the value of the codigoModalidad property.
     * 
     */
    public int getCodigoModalidad() {
        return codigoModalidad;
    }

    /**
     * Sets the value of the codigoModalidad property.
     * 
     */
    public void setCodigoModalidad(int value) {
        this.codigoModalidad = value;
    }

    /**
     * Gets the value of the codigoPuntoVenta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodigoPuntoVenta() {
        return codigoPuntoVenta;
    }

    /**
     * Sets the value of the codigoPuntoVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodigoPuntoVenta(JAXBElement<Integer> value) {
        this.codigoPuntoVenta = value;
    }

    /**
     * Gets the value of the codigoSistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoSistema() {
        return codigoSistema;
    }

    /**
     * Sets the value of the codigoSistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoSistema(String value) {
        this.codigoSistema = value;
    }

    /**
     * Gets the value of the codigoSucursal property.
     * 
     */
    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    /**
     * Sets the value of the codigoSucursal property.
     * 
     */
    public void setCodigoSucursal(int value) {
        this.codigoSucursal = value;
    }

    /**
     * Gets the value of the cuape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuape() {
        return cuape;
    }

    /**
     * Sets the value of the cuape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuape(String value) {
        this.cuape = value;
    }

    /**
     * Gets the value of the cufd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCufd() {
        return cufd;
    }

    /**
     * Sets the value of the cufd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCufd(String value) {
        this.cufd = value;
    }

    /**
     * Gets the value of the cuis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuis() {
        return cuis;
    }

    /**
     * Sets the value of the cuis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuis(String value) {
        this.cuis = value;
    }

    /**
     * Gets the value of the fechaEnvio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * Sets the value of the fechaEnvio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEnvio(XMLGregorianCalendar value) {
        this.fechaEnvio = value;
    }

    /**
     * Gets the value of the hashArchivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashArchivo() {
        return hashArchivo;
    }

    /**
     * Sets the value of the hashArchivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashArchivo(String value) {
        this.hashArchivo = value;
    }

    /**
     * Gets the value of the nit property.
     * 
     */
    public long getNit() {
        return nit;
    }

    /**
     * Sets the value of the nit property.
     * 
     */
    public void setNit(long value) {
        this.nit = value;
    }

}
