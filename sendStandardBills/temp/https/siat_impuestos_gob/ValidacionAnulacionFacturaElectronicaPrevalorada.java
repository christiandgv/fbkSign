
package https.siat_impuestos_gob;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validacionAnulacionFacturaElectronicaPrevalorada complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validacionAnulacionFacturaElectronicaPrevalorada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SolicitudServicioValidacionAnulacion" type="{https://siat.impuestos.gob.bo/}solicitudValidacionAnulacion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validacionAnulacionFacturaElectronicaPrevalorada", propOrder = {
    "solicitudServicioValidacionAnulacion"
})
public class ValidacionAnulacionFacturaElectronicaPrevalorada {

    @XmlElement(name = "SolicitudServicioValidacionAnulacion", required = true)
    protected SolicitudValidacionAnulacion solicitudServicioValidacionAnulacion;

    /**
     * Gets the value of the solicitudServicioValidacionAnulacion property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudValidacionAnulacion }
     *     
     */
    public SolicitudValidacionAnulacion getSolicitudServicioValidacionAnulacion() {
        return solicitudServicioValidacionAnulacion;
    }

    /**
     * Sets the value of the solicitudServicioValidacionAnulacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudValidacionAnulacion }
     *     
     */
    public void setSolicitudServicioValidacionAnulacion(SolicitudValidacionAnulacion value) {
        this.solicitudServicioValidacionAnulacion = value;
    }

}
