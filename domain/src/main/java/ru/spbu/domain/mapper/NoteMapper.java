package ru.spbu.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.spbu.domain.dto.NoteDTO;
import ru.spbu.entities.forum.Note;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CommentMapper.class})
public interface NoteMapper {
    @Mappings({
            @Mapping(target = "id", source = "entity.id"),
            @Mapping(target = "title", source = "entity.title"),
            @Mapping(target = "text", source = "entity.text"),
            @Mapping(target = "comments", source = "entity.comments"),
    })
    NoteDTO noteToNoteDTO(Note entity);

    @Mappings({
            @Mapping(target = "id", source = "dto.id"),
            @Mapping(target = "title", source = "dto.title"),
            @Mapping(target = "text", source = "dto.text"),
            @Mapping(target = "comments", source = "dto.comments"),
    })
    Note noteDTOtoNote(NoteDTO dto);

    List<NoteDTO> listNoteToNoteDTO(List<Note> entity);

    List<Note> listNoteDTOToNote(List<NoteDTO> entity);
}