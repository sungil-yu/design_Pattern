package com.study.design.facade;

public class Writer {


    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }


    public void fileConnect() {
        String msg = String.format("Writer %s과 연결 되었습니다.", fileName);
        System.out.println(msg);
    }

    public void writeFile(){
        String msg = String.format("Writer %s에 내용을 작성 합니다.",fileName);
        System.out.println(msg);
    }

    public void disconnectFile(){
        String msg = String.format("Writer %s에서 접속을 종료 합니다.",fileName);
        System.out.println(msg);
    }
}
