package com.study.kafka.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Optional;

@Data
@NoArgsConstructor
public class CreateAdressDto {

    @NotBlank(message = "{andress.name.notempty}")
    public String name;

    @Min(message = "{andress.number.notempty}", value = 1)
    public int number;

    public Optional<String> complement;
}
