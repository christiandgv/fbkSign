package ec.com.kruger.data;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Catalog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2018-02-22T21:26:58.331Z")
public class Catalog {
	@JsonProperty("idCatalog")
	private String idCatalog = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("status")
	private String status = null;

	@JsonProperty("mandatory")
	private String mandatory = null;

	@JsonProperty("aux1")
	private String aux1 = null;

	@JsonProperty("aux2")
	private String aux2 = null;

	@JsonProperty("aux3")
	private String aux3 = null;

	@JsonProperty("aux4")
	private String aux4 = null;

	public Catalog idCatalog(String idCatalog) {
		this.idCatalog = idCatalog;
		return this;
	}

	/**
	 * Get idCatalog
	 * 
	 * @return idCatalog
	 **/
	public String getIdCatalog() {
		return idCatalog;
	}

	public void setIdCatalog(String idCatalog) {
		this.idCatalog = idCatalog;
	}

	public Catalog description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 * 
	 * @return description
	 **/
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Catalog status(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Catalog mandatory(String mandatory) {
		this.mandatory = mandatory;
		return this;
	}

	/**
	 * Get mandatory
	 * 
	 * @return mandatory
	 **/
	public String getMandatory() {
		return mandatory;
	}

	public void setMandatory(String mandatory) {
		this.mandatory = mandatory;
	}

	public Catalog aux1(String aux1) {
		this.aux1 = aux1;
		return this;
	}

	/**
	 * Get aux1
	 * 
	 * @return aux1
	 **/
	public String getAux1() {
		return aux1;
	}

	public void setAux1(String aux1) {
		this.aux1 = aux1;
	}

	public Catalog aux2(String aux2) {
		this.aux2 = aux2;
		return this;
	}

	/**
	 * Get aux2
	 * 
	 * @return aux2
	 **/
	public String getAux2() {
		return aux2;
	}

	public void setAux2(String aux2) {
		this.aux2 = aux2;
	}

	public Catalog aux3(String aux3) {
		this.aux3 = aux3;
		return this;
	}

	/**
	 * Get aux3
	 * 
	 * @return aux3
	 **/
	public String getAux3() {
		return aux3;
	}

	public void setAux3(String aux3) {
		this.aux3 = aux3;
	}

	public Catalog aux4(String aux4) {
		this.aux4 = aux4;
		return this;
	}

	/**
	 * Get aux4
	 * 
	 * @return aux4
	 **/
	public String getAux4() {
		return aux4;
	}

	public void setAux4(String aux4) {
		this.aux4 = aux4;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Catalog catalog = (Catalog) o;
		return Objects.equals(this.idCatalog, catalog.idCatalog) && Objects.equals(this.description, catalog.description) && Objects.equals(this.status, catalog.status)
				&& Objects.equals(this.mandatory, catalog.mandatory) && Objects.equals(this.aux1, catalog.aux1) && Objects.equals(this.aux2, catalog.aux2) && Objects.equals(this.aux3, catalog.aux3)
				&& Objects.equals(this.aux4, catalog.aux4);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCatalog, description, status, mandatory, aux1, aux2, aux3, aux4);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Catalog {\n");

		sb.append("    idCatalog: ").append(toIndentedString(idCatalog)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
		sb.append("    aux1: ").append(toIndentedString(aux1)).append("\n");
		sb.append("    aux2: ").append(toIndentedString(aux2)).append("\n");
		sb.append("    aux3: ").append(toIndentedString(aux3)).append("\n");
		sb.append("    aux4: ").append(toIndentedString(aux4)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}