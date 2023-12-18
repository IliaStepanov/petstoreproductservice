package com.chtrembl.petstore.product.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class StatusEnumConverter implements AttributeConverter<Product.StatusEnum, String> {

    @Override
    public String convertToDatabaseColumn(Product.StatusEnum statusEnum) {
        return null == statusEnum ? null : statusEnum.getValue();
    }

    @Override
    public Product.StatusEnum convertToEntityAttribute(String databaseValue) {
        return Product.StatusEnum.fromValue(databaseValue);
    }
}
