package ru.spbu.service.crud.impl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import ru.spbu.domain.dto.CommentDTO;
import ru.spbu.domain.mapper.CommentMapper;
import ru.spbu.domain.repository.CommentRepository;
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
    private final CommentRepository commentRepository;
    private final CommentMapper mapper;

    public CommentServiceImpl(CommentRepository commentRepository, CommentMapper mapper) {
        this.commentRepository = commentRepository;
        this.mapper = mapper;
    }

    @Override
    public CommentDTO create(CommentDTO newInstanceDto) {
        Comment comment = mapper.commentDTOtoComment(newInstanceDto);
        comment = commentRepository.save(comment);
        CommentDTO dto = mapper.commentToCommentDTO(comment);
        return dto;
    }

    @Override
    public CommentDTO getById(Long id) {
        return null;
    }

    @Override
    public List<CommentDTO> getAll() {
        return null;
    }

    @Override
    public CommentDTO update(CommentDTO updateInstanceDto, Long id) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
