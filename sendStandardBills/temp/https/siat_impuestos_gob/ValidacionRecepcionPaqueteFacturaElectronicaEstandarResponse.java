
package https.siat_impuestos_gob;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validacionRecepcionPaqueteFacturaElectronicaEstandarResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="validacionRecepcionPaqueteFacturaElectronicaEstandarResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespuestaServicioFacturacion" type="{https://siat.impuestos.gob.bo/}respuesta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validacionRecepcionPaqueteFacturaElectronicaEstandarResponse", propOrder = {
    "respuestaServicioFacturacion"
})
public class ValidacionRecepcionPaqueteFacturaElectronicaEstandarResponse {

    @XmlElement(name = "RespuestaServicioFacturacion")
    protected Respuesta respuestaServicioFacturacion;

    /**
     * Gets the value of the respuestaServicioFacturacion property.
     * 
     * @return
     *     possible object is
     *     {@link Respuesta }
     *     
     */
    public Respuesta getRespuestaServicioFacturacion() {
        return respuestaServicioFacturacion;
    }

    /**
     * Sets the value of the respuestaServicioFacturacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Respuesta }
     *     
     */
    public void setRespuestaServicioFacturacion(Respuesta value) {
        this.respuestaServicioFacturacion = value;
    }

}
