
package https.siat_impuestos_gob;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anulacionFacturaElectronicaEstandar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="anulacionFacturaElectronicaEstandar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SolicitudServicioAnulacion" type="{https://siat.impuestos.gob.bo/}solicitudAnulacion"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anulacionFacturaElectronicaEstandar", propOrder = {
    "solicitudServicioAnulacion"
})
public class AnulacionFacturaElectronicaEstandar {

    @XmlElement(name = "SolicitudServicioAnulacion", required = true)
    protected SolicitudAnulacion solicitudServicioAnulacion;

    /**
     * Gets the value of the solicitudServicioAnulacion property.
     * 
     * @return
     *     possible object is
     *     {@link SolicitudAnulacion }
     *     
     */
    public SolicitudAnulacion getSolicitudServicioAnulacion() {
        return solicitudServicioAnulacion;
    }

    /**
     * Sets the value of the solicitudServicioAnulacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitudAnulacion }
     *     
     */
    public void setSolicitudServicioAnulacion(SolicitudAnulacion value) {
        this.solicitudServicioAnulacion = value;
    }

}
