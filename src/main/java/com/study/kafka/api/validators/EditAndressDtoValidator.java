package com.study.kafka.api.validators;

import com.study.kafka.api.model.EditAdressDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.List;

@Component
public class EditAndressDtoValidator implements Validator {

    @Autowired
    private MessageSource messageSource;

    @Override
    public boolean supports(Class<?> aClass) {
        return EditAdressDto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        EditAdressDto dto = (EditAdressDto) o;

        if (dto.getNome() == StringUtils.EMPTY) {
            errors.rejectValue(messageSource.getMessage("andress.name.notempty", null, null), "Name andress");
        }

        if (dto.getNumero() <= 0) {
            errors.rejectValue(messageSource.getMessage("andress.number.notempty", null, null), "Number andress");
        }

    }
}
