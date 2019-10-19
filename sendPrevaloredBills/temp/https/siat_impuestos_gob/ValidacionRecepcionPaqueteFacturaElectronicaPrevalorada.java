
package https.siat_impuestos_gob;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validacionRecepcionPaqueteFacturaElectronicaPrevalorada complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validacionRecepcionPaqueteFacturaElectronicaPrevalorada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SolicitudServicioValidacionRecepcion" type="{https://siat.impuestos.gob.bo/}solicitudValidacionRecepcion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validacionRecepcionPaqueteFacturaElectronicaPrevalorada", propOrder = {
    "solicitudServicioValidacionRecepcion"
})
public class ValidacionRecepcionPaqueteFacturaElectronicaPrevalorada {

    @XmlElement(name = "SolicitudServicioValidacionRecepcion", required = true)
    protected SolicitudValidacionRecepcion solicitudServicioValidacionRecepcion;

    /**
     * Gets the value of the solicitudServicioValidacionRecepcion property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudValidacionRecepcion }
     *     
     */
    public SolicitudValidacionRecepcion getSolicitudServicioValidacionRecepcion() {
        return solicitudServicioValidacionRecepcion;
    }

    /**
     * Sets the value of the solicitudServicioValidacionRecepcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudValidacionRecepcion }
     *     
     */
    public void setSolicitudServicioValidacionRecepcion(SolicitudValidacionRecepcion value) {
        this.solicitudServicioValidacionRecepcion = value;
    }

}
