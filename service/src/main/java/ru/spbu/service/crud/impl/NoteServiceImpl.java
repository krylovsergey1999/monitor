package ru.spbu.service.crud.impl;

import org.springframework.stereotype.Service;
import ru.spbu.domain.dto.NoteDTO;
import ru.spbu.service.crud.NoteService;
import ru.spbu.system.annotation.Profiled;

import java.util.List;

/**
 * @author Krylov Sergey
 */
@Profiled
@Service
public class NoteServiceImpl implements NoteService {
    @Override
    public NoteDTO create(NoteDTO newInstanceDto) {

        return null;
    }

    @Override
    public NoteDTO getById(Long id) {
        return null;
    }

    @Override
    public List<NoteDTO> getAll() {
        return null;
    }

    @Override
    public NoteDTO update(NoteDTO updateInstanceDto, Long id) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
