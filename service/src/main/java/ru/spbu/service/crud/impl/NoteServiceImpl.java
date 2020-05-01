package ru.spbu.service.crud.impl;

import javassist.NotFoundException;
import org.springframework.stereotype.Service;
import ru.spbu.domain.dto.NoteDTO;
import ru.spbu.domain.mapper.NoteMapper;
import ru.spbu.domain.repository.NoteRepository;
import ru.spbu.entities.forum.Note;
import ru.spbu.service.crud.NoteService;
import ru.spbu.system.annotation.Profiled;

import java.util.List;

/**
 * @author Krylov Sergey
 */
@Profiled
@Service
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;
    private final NoteMapper noteMapper;

    public NoteServiceImpl(NoteRepository noteRepository, NoteMapper noteMapper) {
        this.noteRepository = noteRepository;
        this.noteMapper = noteMapper;
    }

    @Override
    public NoteDTO create(NoteDTO newInstanceDto) {
        Note note = noteMapper.noteDTOtoNote(newInstanceDto);
        note = noteRepository.save(note);
        newInstanceDto = noteMapper.noteToNoteDTO(note);
        return newInstanceDto;
    }

    @Override
    public NoteDTO getById(Long id) {
        Note note = noteRepository.getOne(id);
        NoteDTO noteDTO = noteMapper.noteToNoteDTO(note);
        return noteDTO;
    }

    @Override
    public List<NoteDTO> getAll() {
        List<Note> notes = noteRepository.findAll();
        List<NoteDTO> notesDTO = noteMapper.listNoteToNoteDTO(notes);
        return notesDTO;
    }

    @Override
    public NoteDTO update(NoteDTO updateInstanceDto, Long id) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        noteRepository.deleteById(id);
        return true;
    }
}
