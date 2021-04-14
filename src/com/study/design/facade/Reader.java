package com.study.design.facade;

public class Reader {

    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Reader %s로 연결 되었습니다..",fileName);
        System.out.println(msg);
    }

    public void readFile(){
        String msg = String.format("Reader %s을 읽었습니다.", fileName);
        System.out.println(msg);
    }

    public void disconnectFile(){
        String msg = String.format("Reader %s와 연결을 종료 하였습니다.", fileName);
        System.out.println(msg);

    }


}
