package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration("javaConfig")
public class ContextConfiguration {

    @Bean(name = "board")
    public BoardDTO getBoard(){
        return new BoardDTO(2L, "스프링 수업이 어려워질까요?", "그래도 포기하지 않고 열심히 해볼게요", "미래의 멋진 개발자");
    }
}
