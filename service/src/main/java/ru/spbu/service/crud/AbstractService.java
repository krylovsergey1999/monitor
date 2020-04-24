package ru.spbu.service.crud;

import ru.spbu.domain.dto.BaseDTO;

import java.util.List;

public interface AbstractService<DTO extends BaseDTO> {

    DTO create(DTO newInstanceDto);

    DTO getById(Long id);

    List<DTO> getAll();

    DTO update(DTO updateInstanceDto, Long id);

    boolean delete(Long id);
}