package com.ohgiraffers.practice03.annotationconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        BoardDAO boardService = context.getBean(BoardDAO.class);

        System.out.println(boardService.boardSelect(1L));

        boardService.insertBoard(new BoardDTO(3L, "스프링 수업 엄청 기다렸어요", "많은걸 얻어 갈 수 있는 시간이 되면 좋겠어요", "봄이 올까요"));

        System.out.println(boardService.boardSelect(3L));

    }
}
