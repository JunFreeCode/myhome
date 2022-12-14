package com.junfree.jangsin.service;

import com.junfree.jangsin.model.Board;
import com.junfree.jangsin.model.User;
import com.junfree.jangsin.repository.BoardRepository;
import com.junfree.jangsin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board){
       User user =  userRepository.findByUsername(username);
       board.setUser(user);
       return boardRepository.save(board);
    }
}
