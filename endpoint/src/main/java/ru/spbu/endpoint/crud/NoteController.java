package ru.spbu.endpoint.crud;

import ru.spbu.domain.dto.NoteDTO;

public interface NoteController extends AbstractController<NoteDTO> {
    String BASE_URL = AbstractController.BASE_URL + "/note";
}