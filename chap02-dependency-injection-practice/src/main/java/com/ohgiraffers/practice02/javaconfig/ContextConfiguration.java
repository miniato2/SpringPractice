package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("practice02javaconfig")
public class ContextConfiguration {

    @Bean("member")
    public MemberDTO getMember(){
        MemberDTO member = new MemberDTO();
        member.setId(1L);
        member.setNickname("봄이 올까요");
        return member;
    }

    @Bean("board")
    public BoardDTO getBoard(){
        BoardDTO board = new BoardDTO();
        board.setId(1L);
        board.setTitle("의존성 주입 연습");
        board.setContent("게시글 작성자 객체 주입받기");
        board.setWriter(getMember());
        return board;
    }
}
