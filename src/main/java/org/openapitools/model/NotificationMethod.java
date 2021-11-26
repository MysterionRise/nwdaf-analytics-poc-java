package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.NotificationMethodAnyOf;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Possible values are - PERIODIC: The subscribe of NWDAF Event is periodically. The periodic of the notification is identified by repetitionPeriod defined in subclause 5.1.6.2.3. - THRESHOLD: The subscribe of NWDAF Event is upon threshold exceeded. The threshold of the notification is identified by loadLevelThreshold defined in subclause 5.1.6.2.3. 
 */
@ApiModel(description = "Possible values are - PERIODIC: The subscribe of NWDAF Event is periodically. The periodic of the notification is identified by repetitionPeriod defined in subclause 5.1.6.2.3. - THRESHOLD: The subscribe of NWDAF Event is upon threshold exceeded. The threshold of the notification is identified by loadLevelThreshold defined in subclause 5.1.6.2.3. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-17T11:20:19.175716Z[Europe/London]")
public class NotificationMethod   {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationMethod {\n");
    
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

