package com.entregapaidegua.interfaces.conversor;

import org.springframework.stereotype.Component;

@Component
public interface IConversorDtoToEntity<Dto, Entity> {
    Entity converterToEntity(Dto objeto);
}
