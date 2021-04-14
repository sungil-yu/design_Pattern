package com.study.design.facade;

public class Main {

    public static void main(String[] args) {

        //not facade
        Ftp ftp = new Ftp(22, "www.ftpServer.com", "/user/java");
        ftp.connect();
        ftp.moveDirectory();

        Writer writer = new Writer("facade.class");
        writer.fileConnect();
        writer.writeFile();


        Reader reader = new Reader("facade.class");
        reader.fileConnect();
        reader.readFile();

        reader.disconnectFile();
        writer.disconnectFile();
        ftp.disconnect();


        //facade pattern
        SftpClient sftpClient = new SftpClient(22, "www.foo.com", "/usr/bin", "start.bat");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();
        sftpClient.disConnect();
    }
}

