package com.entregapaidegua.interfaces.conversor;

import org.springframework.stereotype.Component;

@Component
public interface IConversorEntityToDto<Entity, Dto> {
    Dto converterToDto(Entity objeto);
}
