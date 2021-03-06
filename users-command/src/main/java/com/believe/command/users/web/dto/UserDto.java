package com.believe.command.users.web.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * <p> The describe </p>
 *
 * @author Li Xingping
 */
@Data
public class UserDto {

  private String id;

  @NotBlank
  private String username;
}
