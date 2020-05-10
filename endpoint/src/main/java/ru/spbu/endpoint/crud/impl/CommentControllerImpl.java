package ru.spbu.endpoint.crud.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.spbu.domain.dto.CommentDTO;
import ru.spbu.endpoint.crud.CommentController;
import ru.spbu.service.crud.CommentService;
import ru.spbu.system.annotation.Profiled;

import java.util.List;

@Profiled
@RestController
@RequestMapping(CommentController.BASE_URL)
public class CommentControllerImpl implements CommentController {
    private final CommentService commentService;

    public CommentControllerImpl(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public ResponseEntity<CommentDTO> create(CommentDTO newInstanceRequest) {
        CommentDTO commentDTO = commentService.create(newInstanceRequest);
        return ResponseEntity.ok(commentDTO);
    }

    @Override
    public ResponseEntity<CommentDTO> getById(Long id) {
        CommentDTO commentDTO = commentService.getById(id);
        return ResponseEntity.ok(commentDTO);
    }

    @Override
    public ResponseEntity<List<CommentDTO>> getAll() {
        List<CommentDTO> commentsDTO = commentService.getAll();
        return ResponseEntity.ok(commentsDTO);
    }

    @Override
    public ResponseEntity<CommentDTO> update(CommentDTO updatedInstanceRequest, Long id) {
        CommentDTO commentDTO = commentService.update(updatedInstanceRequest, id);
        return ResponseEntity.ok(commentDTO);
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        boolean result = commentService.delete(id);
        return ResponseEntity.ok(result);
    }
}
