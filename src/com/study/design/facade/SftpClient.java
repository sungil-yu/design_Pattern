package com.study.design.facade;

public class SftpClient {

    //의존관계 성립하는데 사실 인터페이스 만들어서 의존하는 것이 더 좋아보임.
    private Ftp ftp;
    private Reader reader;
    private Writer writer;

    public SftpClient(Ftp ftp, Reader reader, Writer writer) {
        this.ftp = ftp;
        this.reader = reader;
        this.writer = writer;
    }

    public SftpClient(int port, String host, String path, String fileName) {
        this.ftp = new Ftp(port, host, path);
        this.reader = new Reader(fileName);
        this.writer = new Writer(fileName);
    }

    public void connect(){
        ftp.connect();
        ftp.moveDirectory();
        writer.fileConnect();
        reader.fileConnect();
    }

    public void write(){
        writer.writeFile();
    }

    public void read(){
        reader.readFile();
    }


    public void disConnect(){
        reader.disconnectFile();
        writer.disconnectFile();
        ftp.disconnect();
    }


}
