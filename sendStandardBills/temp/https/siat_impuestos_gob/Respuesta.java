
package https.siat_impuestos_gob;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respuesta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respuesta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoEstado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoRecepcion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="listaCodigosRespuestas" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaDescripcionesRespuestas" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaErroresDetalles" type="{https://siat.impuestos.gob.bo/}recepcionErrorDetalleDto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transaccion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuesta", propOrder = {
    "codigoEstado",
    "codigoRecepcion",
    "listaCodigosRespuestas",
    "listaDescripcionesRespuestas",
    "listaErroresDetalles",
    "transaccion"
})
public class Respuesta {

    protected int codigoEstado;
    protected long codigoRecepcion;
    @XmlElement(nillable = true)
    protected List<Integer> listaCodigosRespuestas;
    @XmlElement(nillable = true)
    protected List<String> listaDescripcionesRespuestas;
    @XmlElement(nillable = true)
    protected List<RecepcionErrorDetalleDto> listaErroresDetalles;
    protected boolean transaccion;

    /**
     * Gets the value of the codigoEstado property.
     * 
     */
    public int getCodigoEstado() {
        return codigoEstado;
    }

    /**
     * Sets the value of the codigoEstado property.
     * 
     */
    public void setCodigoEstado(int value) {
        this.codigoEstado = value;
    }

    /**
     * Gets the value of the codigoRecepcion property.
     * 
     */
    public long getCodigoRecepcion() {
        return codigoRecepcion;
    }

    /**
     * Sets the value of the codigoRecepcion property.
     * 
     */
    public void setCodigoRecepcion(long value) {
        this.codigoRecepcion = value;
    }

    /**
     * Gets the value of the listaCodigosRespuestas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaCodigosRespuestas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCodigosRespuestas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getListaCodigosRespuestas() {
        if (listaCodigosRespuestas == null) {
            listaCodigosRespuestas = new ArrayList<Integer>();
        }
        return this.listaCodigosRespuestas;
    }

    /**
     * Gets the value of the listaDescripcionesRespuestas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaDescripcionesRespuestas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaDescripcionesRespuestas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaDescripcionesRespuestas() {
        if (listaDescripcionesRespuestas == null) {
            listaDescripcionesRespuestas = new ArrayList<String>();
        }
        return this.listaDescripcionesRespuestas;
    }

    /**
     * Gets the value of the listaErroresDetalles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaErroresDetalles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaErroresDetalles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecepcionErrorDetalleDto }
     * 
     * 
     */
    public List<RecepcionErrorDetalleDto> getListaErroresDetalles() {
        if (listaErroresDetalles == null) {
            listaErroresDetalles = new ArrayList<RecepcionErrorDetalleDto>();
        }
        return this.listaErroresDetalles;
    }

    /**
     * Gets the value of the transaccion property.
     * 
     */
    public boolean isTransaccion() {
        return transaccion;
    }

    /**
     * Sets the value of the transaccion property.
     * 
     */
    public void setTransaccion(boolean value) {
        this.transaccion = value;
    }

}
