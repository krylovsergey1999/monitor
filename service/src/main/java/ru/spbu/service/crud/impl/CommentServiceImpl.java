package ru.spbu.service.crud.impl;

import org.springframework.stereotype.Service;
import ru.spbu.domain.dto.CommentDTO;
import ru.spbu.domain.mapper.CommentMapper;
import ru.spbu.domain.repository.CommentRepository;
import ru.spbu.domain.repository.NoteRepository;
import ru.spbu.entities.forum.Comment;
import ru.spbu.service.crud.CommentService;
import ru.spbu.system.annotation.Profiled;

import java.util.List;

/**
 * @author Krylov Sergey
 */
@Service
@Profiled
public class CommentServiceImpl implements CommentService {
    private final NoteRepository noteRepository;
    private final CommentRepository commentRepository;
    private final CommentMapper mapper;

    public CommentServiceImpl(NoteRepository noteRepository, CommentRepository commentRepository, CommentMapper mapper) {
        this.noteRepository = noteRepository;
        this.commentRepository = commentRepository;
        this.mapper = mapper;
    }

    @Override
    public CommentDTO create(CommentDTO newInstanceDto) {
        Comment comment = mapper.commentDTOtoComment(newInstanceDto);
        //comment.setNote(noteRepository.findById(comment.getId()).get());
        System.out.println("Comment: " + comment.toString());
        comment = commentRepository.save(comment);
        CommentDTO dto = mapper.commentToCommentDTO(comment);
        return dto;
    }

    @Override
    public CommentDTO getById(Long id) {
        Comment comment = commentRepository.getOne(id);
        CommentDTO commentDTO = mapper.commentToCommentDTO(comment);
        return commentDTO;
    }

    @Override
    public List<CommentDTO> getAll() {
        List<Comment> comments = commentRepository.findAll();
        List<CommentDTO> commentsDTO = mapper.listCommentToCommentDTO(comments);
        return commentsDTO;
    }

    @Override
    public CommentDTO update(CommentDTO updateInstanceDto, Long id) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        commentRepository.deleteById(id);
        return true;
    }
}
