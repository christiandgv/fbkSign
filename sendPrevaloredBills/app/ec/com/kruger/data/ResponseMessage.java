package ec.com.kruger.data;


import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ResponseMessage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-10-19T17:19:27.503Z")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ResponseMessage   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("receptionCode")
  private Long receptionCode = null;

  @JsonProperty("statusCode")
  private Integer statusCode = null;

  @JsonProperty("responseCodes")
  private List<Integer> responseCodes = null;

  public ResponseMessage type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @NotNull
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ResponseMessage uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @NotNull
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public ResponseMessage receptionCode(Long receptionCode) {
    this.receptionCode = receptionCode;
    return this;
  }

   /**
   * Get receptionCode
   * @return receptionCode
  **/
    public Long getReceptionCode() {
    return receptionCode;
  }

  public void setReceptionCode(Long receptionCode) {
    this.receptionCode = receptionCode;
  }

  public ResponseMessage statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
    public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public ResponseMessage responseCodes(List<Integer> responseCodes) {
    this.responseCodes = responseCodes;
    return this;
  }

  public ResponseMessage addResponseCodesItem(Integer responseCodesItem) {
    if (responseCodes == null) {
      responseCodes = new ArrayList<>();
    }
    responseCodes.add(responseCodesItem);
    return this;
  }

   /**
   * Get responseCodes
   * @return responseCodes
  **/
    public List<Integer> getResponseCodes() {
    return responseCodes;
  }

  public void setResponseCodes(List<Integer> responseCodes) {
    this.responseCodes = responseCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseMessage responseMessage = (ResponseMessage) o;
    return Objects.equals(type, responseMessage.type) &&
        Objects.equals(uuid, responseMessage.uuid) &&
        Objects.equals(receptionCode, responseMessage.receptionCode) &&
        Objects.equals(statusCode, responseMessage.statusCode) &&
        Objects.equals(responseCodes, responseMessage.responseCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, uuid, receptionCode, statusCode, responseCodes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseMessage {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    receptionCode: ").append(toIndentedString(receptionCode)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    responseCodes: ").append(toIndentedString(responseCodes)).append("\n");
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
