package com.study.design.facade;

public class Ftp {

    private int port;
    private String host;
    private String path;


    public Ftp(int port, String host,String path){
        this.host = host;
        this.path = path;
        this.port = port;
    }

    public void connect() {
        String msg = String.format("연결 호스트는 %s 이고 포트는 %d로 연결됬습니다.", host, port);
        System.out.println(msg);
    }

    public void moveDirectory(){
        String msg = String.format(" %s 로 경로를 이동하였습니다.",path);
        System.out.println(msg);
    }

    public void disconnect(){
        System.out.println("호스트와 연결이 종료 되었습니다.");
    }


}
