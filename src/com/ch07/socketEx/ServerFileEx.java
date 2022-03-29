package com.ch07.socketEx;

import com.ch07.socket1.ServerFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerFileEx {
    ServerSocket serverSocket;
    Socket socket;
    BufferedReader bufferedReader;

    public ServerFileEx() {
            System.out.println("1.서버소켓 시작 ---------------");
        try {

            ServerSocket serverSocket = new ServerSocket(1000);
            System.out.println("2.서버 소켓 생성 완료 : 클라이언트 접속 대기중-------------");

            Socket socket = serverSocket.accept(); //클라이언트 접속 대기중
            System.out.println("3. 클라이언트 연결완료--------------------");

            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = bufferedReader.readLine();
            System.out.println("4.클라이언트로부터 받은 메시지 :" + msg);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new ServerFile();
    }
}
