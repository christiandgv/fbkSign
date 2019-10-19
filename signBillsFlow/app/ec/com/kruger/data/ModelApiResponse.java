package ec.com.kruger.data;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
/**
 * ModelApiResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2017-12-21T20:20:56.601Z")

public class ModelApiResponse   {
  @JsonProperty("data")
  private JsonNode data = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("code")
  private String code = null;

  public ModelApiResponse data(JsonNode data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
    public JsonNode getData() {
    return data;
  }

  public void setData(JsonNode data) {
    this.data = data;
  }

  public ModelApiResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ModelApiResponse code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelApiResponse _apiResponse = (ModelApiResponse) o;
    return Objects.equals(this.data, _apiResponse.data) &&
        Objects.equals(this.message, _apiResponse.message) &&
        Objects.equals(this.code, _apiResponse.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, message, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    
    sb.append("data:").append(toIndentedString(data)).append(",");
    sb.append("message:").append(toIndentedString(message)).append(",");
    sb.append("error:").append(toIndentedString(code));
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
