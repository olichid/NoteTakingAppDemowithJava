package com.olichid.notetaking.repository;

import com.olichid.notetaking.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
