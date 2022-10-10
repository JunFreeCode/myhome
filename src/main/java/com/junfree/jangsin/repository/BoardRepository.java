package com.junfree.jangsin.repository;

import com.junfree.jangsin.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
