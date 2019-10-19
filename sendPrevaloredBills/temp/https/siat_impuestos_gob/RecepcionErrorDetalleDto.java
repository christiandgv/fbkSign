
package https.siat_impuestos_gob;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recepcionErrorDetalleDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recepcionErrorDetalleDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoRecepcionIndividual" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cuf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaCodigosError" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numeroFactura" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recepcionErrorDetalleDto", propOrder = {
    "codigoRecepcionIndividual",
    "cuf",
    "listaCodigosError",
    "numeroFactura"
})
public class RecepcionErrorDetalleDto {

    protected long codigoRecepcionIndividual;
    protected String cuf;
    @XmlElement(nillable = true)
    protected List<Integer> listaCodigosError;
    protected Long numeroFactura;

    /**
     * Gets the value of the codigoRecepcionIndividual property.
     * 
     */
    public long getCodigoRecepcionIndividual() {
        return codigoRecepcionIndividual;
    }

    /**
     * Sets the value of the codigoRecepcionIndividual property.
     * 
     */
    public void setCodigoRecepcionIndividual(long value) {
        this.codigoRecepcionIndividual = value;
    }

    /**
     * Gets the value of the cuf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuf() {
        return cuf;
    }

    /**
     * Sets the value of the cuf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuf(String value) {
        this.cuf = value;
    }

    /**
     * Gets the value of the listaCodigosError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaCodigosError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCodigosError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getListaCodigosError() {
        if (listaCodigosError == null) {
            listaCodigosError = new ArrayList<Integer>();
        }
        return this.listaCodigosError;
    }

    /**
     * Gets the value of the numeroFactura property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Sets the value of the numeroFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumeroFactura(Long value) {
        this.numeroFactura = value;
    }

}
