package ru.spbu.service.crud.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.spbu.domain.dto.CommentDTO;
import ru.spbu.domain.mapper.CommentMapper;
import ru.spbu.domain.repository.CommentRepository;
import ru.spbu.entities.forum.Comment;
import ru.spbu.service.crud.CommentService;
import ru.spbu.service.exception.ServiceExceptionReason;
import ru.spbu.service.exception.core.BusinessException;
import ru.spbu.system.annotation.Profiled;

import java.util.List;

/**
 * Сервис для работы с комментариями.
 *
 * @author Krylov Sergey
 */
@Slf4j
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
        comment = commentRepository.saveAndFlush(comment);
        return mapper.commentToCommentDTO(comment);
    }

    @Override
    public CommentDTO getById(Long id) {
        Comment comment = commentRepository.findById(id)
                .orElseThrow(() -> new BusinessException(ServiceExceptionReason.COMMENT_NOT_FOUND, id));
        return mapper.commentToCommentDTO(comment);
    }

    @Override
    public List<CommentDTO> getAll() {
        List<Comment> comments = commentRepository.findAll();
        return mapper.listCommentToCommentDTO(comments);
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
