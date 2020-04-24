package ru.spbu.endpoint.crud;

import ru.spbu.domain.dto.CommentDTO;

public interface CommentController extends AbstractController<CommentDTO> {
    String BASE_URL = AbstractController.BASE_URL + "/comment";
}
