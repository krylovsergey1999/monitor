package ru.spbu.domain.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class UserDTO extends BaseDTO implements Serializable {
    private String name;

    private String email;

    private String country;

    private String website;
}
