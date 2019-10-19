
package https.siat_impuestos_gob;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validacionRecepcionPorCufFacturaElectronicaEstandar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validacionRecepcionPorCufFacturaElectronicaEstandar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SolicitudServicioValidacionRecepcionPorCuf" type="{https://siat.impuestos.gob.bo/}solicitudValidacionRecepcionPorCuf"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validacionRecepcionPorCufFacturaElectronicaEstandar", propOrder = {
    "solicitudServicioValidacionRecepcionPorCuf"
})
public class ValidacionRecepcionPorCufFacturaElectronicaEstandar {

    @XmlElement(name = "SolicitudServicioValidacionRecepcionPorCuf", required = true)
    protected SolicitudValidacionRecepcionPorCuf solicitudServicioValidacionRecepcionPorCuf;

    /**
     * Gets the value of the solicitudServicioValidacionRecepcionPorCuf property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudValidacionRecepcionPorCuf }
     *     
     */
    public SolicitudValidacionRecepcionPorCuf getSolicitudServicioValidacionRecepcionPorCuf() {
        return solicitudServicioValidacionRecepcionPorCuf;
    }

    /**
     * Sets the value of the solicitudServicioValidacionRecepcionPorCuf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudValidacionRecepcionPorCuf }
     *     
     */
    public void setSolicitudServicioValidacionRecepcionPorCuf(SolicitudValidacionRecepcionPorCuf value) {
        this.solicitudServicioValidacionRecepcionPorCuf = value;
    }

}
