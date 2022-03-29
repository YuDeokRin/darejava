package com.ch07.socketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFileEx02 {
    ServerSocket serverSocket;
    Socket socket;

    BufferedReader bufferedReader;

    public ServerFileEx02() {
        System.out.println("1.서버 소켓 시작 --------------------");
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            System.out.println("2. 서버 소켓 생성----------------------------");

            socket = serverSocket.accept();
            System.out.println("3. 클라이언트 연결 완료");
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while(true){
            String msg = bufferedReader.readLine();
            System.out.println("4.클라이언트로부터 받은 메시지 : "+ msg);

            }

        } catch (Exception e) {
            System.out.println("서버 소켓 에러 발생함 :" + e.getMessage());
        }
    }
}
