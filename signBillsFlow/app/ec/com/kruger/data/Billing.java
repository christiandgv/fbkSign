package ec.com.kruger.data;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Billing
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-10-19T22:30:31.206Z")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Billing   {
  @JsonProperty("type")
  private String type = "billing";

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("accountNum")
  private String accountNum = null;

  @JsonProperty("invoice")
  private String invoice = null;

  @JsonProperty("payload")
  private String payload = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("fiscalDocumentCode")
  private Integer fiscalDocumentCode = null;

  @JsonProperty("sectorCode")
  private Integer sectorCode = null;

  @JsonProperty("emissionCode")
  private Integer emissionCode = null;

  @JsonProperty("modalityCode")
  private Integer modalityCode = null;

  @JsonProperty("branchOfficeCode")
  private Integer branchOfficeCode = null;

  @JsonProperty("cufd")
  private String cufd = null;

  @JsonProperty("cuis")
  private String cuis = null;

  @JsonProperty("hashFile")
  private String hashFile = null;

  @JsonProperty("nit")
  private Long nit = null;

  @JsonProperty("cuape")
  private String cuape = null;

  public Billing type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Billing uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
    public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public Billing accountNum(String accountNum) {
    this.accountNum = accountNum;
    return this;
  }

   /**
   * Get accountNum
   * @return accountNum
  **/
  @NotNull
  public String getAccountNum() {
    return accountNum;
  }

  public void setAccountNum(String accountNum) {
    this.accountNum = accountNum;
  }

  public Billing invoice(String invoice) {
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @NotNull
  public String getInvoice() {
    return invoice;
  }

  public void setInvoice(String invoice) {
    this.invoice = invoice;
  }

  public Billing payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
    public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public Billing status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @NotNull
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Billing fiscalDocumentCode(Integer fiscalDocumentCode) {
    this.fiscalDocumentCode = fiscalDocumentCode;
    return this;
  }

   /**
   * Get fiscalDocumentCode
   * @return fiscalDocumentCode
  **/
    public Integer getFiscalDocumentCode() {
    return fiscalDocumentCode;
  }

  public void setFiscalDocumentCode(Integer fiscalDocumentCode) {
    this.fiscalDocumentCode = fiscalDocumentCode;
  }

  public Billing sectorCode(Integer sectorCode) {
    this.sectorCode = sectorCode;
    return this;
  }

   /**
   * Get sectorCode
   * @return sectorCode
  **/
    public Integer getSectorCode() {
    return sectorCode;
  }

  public void setSectorCode(Integer sectorCode) {
    this.sectorCode = sectorCode;
  }

  public Billing emissionCode(Integer emissionCode) {
    this.emissionCode = emissionCode;
    return this;
  }

   /**
   * Get emissionCode
   * @return emissionCode
  **/
    public Integer getEmissionCode() {
    return emissionCode;
  }

  public void setEmissionCode(Integer emissionCode) {
    this.emissionCode = emissionCode;
  }

  public Billing modalityCode(Integer modalityCode) {
    this.modalityCode = modalityCode;
    return this;
  }

   /**
   * Get modalityCode
   * @return modalityCode
  **/
    public Integer getModalityCode() {
    return modalityCode;
  }

  public void setModalityCode(Integer modalityCode) {
    this.modalityCode = modalityCode;
  }

  public Billing branchOfficeCode(Integer branchOfficeCode) {
    this.branchOfficeCode = branchOfficeCode;
    return this;
  }

   /**
   * Get branchOfficeCode
   * @return branchOfficeCode
  **/
    public Integer getBranchOfficeCode() {
    return branchOfficeCode;
  }

  public void setBranchOfficeCode(Integer branchOfficeCode) {
    this.branchOfficeCode = branchOfficeCode;
  }

  public Billing cufd(String cufd) {
    this.cufd = cufd;
    return this;
  }

   /**
   * Get cufd
   * @return cufd
  **/
    public String getCufd() {
    return cufd;
  }

  public void setCufd(String cufd) {
    this.cufd = cufd;
  }

  public Billing cuis(String cuis) {
    this.cuis = cuis;
    return this;
  }

   /**
   * Get cuis
   * @return cuis
  **/
    public String getCuis() {
    return cuis;
  }

  public void setCuis(String cuis) {
    this.cuis = cuis;
  }

  public Billing hashFile(String hashFile) {
    this.hashFile = hashFile;
    return this;
  }

   /**
   * Get hashFile
   * @return hashFile
  **/
    public String getHashFile() {
    return hashFile;
  }

  public void setHashFile(String hashFile) {
    this.hashFile = hashFile;
  }

  public Billing nit(Long nit) {
    this.nit = nit;
    return this;
  }

   /**
   * Get nit
   * @return nit
  **/
    public Long getNit() {
    return nit;
  }

  public void setNit(Long nit) {
    this.nit = nit;
  }

  public Billing cuape(String cuape) {
    this.cuape = cuape;
    return this;
  }

   /**
   * Get cuape
   * @return cuape
  **/
    public String getCuape() {
    return cuape;
  }

  public void setCuape(String cuape) {
    this.cuape = cuape;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Billing billing = (Billing) o;
    return Objects.equals(type, billing.type) &&
        Objects.equals(uuid, billing.uuid) &&
        Objects.equals(accountNum, billing.accountNum) &&
        Objects.equals(invoice, billing.invoice) &&
        Objects.equals(payload, billing.payload) &&
        Objects.equals(status, billing.status) &&
        Objects.equals(fiscalDocumentCode, billing.fiscalDocumentCode) &&
        Objects.equals(sectorCode, billing.sectorCode) &&
        Objects.equals(emissionCode, billing.emissionCode) &&
        Objects.equals(modalityCode, billing.modalityCode) &&
        Objects.equals(branchOfficeCode, billing.branchOfficeCode) &&
        Objects.equals(cufd, billing.cufd) &&
        Objects.equals(cuis, billing.cuis) &&
        Objects.equals(hashFile, billing.hashFile) &&
        Objects.equals(nit, billing.nit) &&
        Objects.equals(cuape, billing.cuape);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, uuid, accountNum, invoice, payload, status, fiscalDocumentCode, sectorCode, emissionCode, modalityCode, branchOfficeCode, cufd, cuis, hashFile, nit, cuape);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Billing {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    accountNum: ").append(toIndentedString(accountNum)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fiscalDocumentCode: ").append(toIndentedString(fiscalDocumentCode)).append("\n");
    sb.append("    sectorCode: ").append(toIndentedString(sectorCode)).append("\n");
    sb.append("    emissionCode: ").append(toIndentedString(emissionCode)).append("\n");
    sb.append("    modalityCode: ").append(toIndentedString(modalityCode)).append("\n");
    sb.append("    branchOfficeCode: ").append(toIndentedString(branchOfficeCode)).append("\n");
    sb.append("    cufd: ").append(toIndentedString(cufd)).append("\n");
    sb.append("    cuis: ").append(toIndentedString(cuis)).append("\n");
    sb.append("    hashFile: ").append(toIndentedString(hashFile)).append("\n");
    sb.append("    nit: ").append(toIndentedString(nit)).append("\n");
    sb.append("    cuape: ").append(toIndentedString(cuape)).append("\n");
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
