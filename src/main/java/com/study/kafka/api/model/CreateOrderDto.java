package com.study.kafka.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class CreateOrderDto {
    @NotBlank(message = "{order.name}")
    public String nome;

    @Valid
    public CreateAdressDto andress;
}
