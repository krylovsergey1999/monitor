package ru.spbu.endpoint.crud.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.spbu.domain.dto.NoteDTO;
import ru.spbu.endpoint.crud.NoteController;
import ru.spbu.service.crud.NoteService;
import ru.spbu.system.annotation.Profiled;

import java.util.List;

@Profiled
@RestController
@RequestMapping(NoteController.BASE_URL)
public class NoteControllerIml implements NoteController {
    private final NoteService noteService;

    public NoteControllerIml(NoteService noteService) {
        this.noteService = noteService;
    }

    @Override
    public ResponseEntity<NoteDTO> create(NoteDTO newInstanceRequest) {
        NoteDTO noteDTO = noteService.create(newInstanceRequest);
        return ResponseEntity.ok(noteDTO);
    }

    @Override
    public ResponseEntity<NoteDTO> getById(Long id) {
        NoteDTO noteDTO = noteService.getById(id);
        return ResponseEntity.ok(noteDTO);
    }

    @Override
    public ResponseEntity<List<NoteDTO>> getAll() {
        List<NoteDTO> notes = noteService.getAll();
        return ResponseEntity.ok(notes);
    }

    @Override
    public ResponseEntity<NoteDTO> update(NoteDTO updatedInstanceRequest, Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        boolean result = noteService.delete(id);
        return ResponseEntity.ok(result);
    }
}
