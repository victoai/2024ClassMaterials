package com.acorn.batis2;

public class BoardDTO {
    private int boardNo;
    private String title;
    private String writer;
    private String content;

    // 생성자
    public BoardDTO() {}

    // 생성자
    public BoardDTO(String title, String writer, String content) {
        this.title = title;
        this.writer = writer;
        this.content = content;
    }

    // Getter 및 Setter 메서드
    public int getBoardNo() {
        return boardNo;
    }

    public void setBoardNo(int boardNo) {
        this.boardNo = boardNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // toString() 메서드 (디버깅용)
    @Override
    public String toString() {
        return "BoardDTO{" +
                "boardNo=" + boardNo +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
