
package https.siat_impuestos_gob;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recepcionFacturaElectronicaEstandar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recepcionFacturaElectronicaEstandar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SolicitudServicioRecepcion" type="{https://siat.impuestos.gob.bo/}solicitudRecepcion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recepcionFacturaElectronicaEstandar", propOrder = {
    "solicitudServicioRecepcion"
})
public class RecepcionFacturaElectronicaEstandar {

    @XmlElement(name = "SolicitudServicioRecepcion", required = true)
    protected SolicitudRecepcion solicitudServicioRecepcion;

    /**
     * Gets the value of the solicitudServicioRecepcion property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudRecepcion }
     *     
     */
    public SolicitudRecepcion getSolicitudServicioRecepcion() {
        return solicitudServicioRecepcion;
    }

    /**
     * Sets the value of the solicitudServicioRecepcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudRecepcion }
     *     
     */
    public void setSolicitudServicioRecepcion(SolicitudRecepcion value) {
        this.solicitudServicioRecepcion = value;
    }

}
