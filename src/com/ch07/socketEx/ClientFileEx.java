package com.ch07.socketEx;

import java.io.*;
import java.net.Socket;

public class ClientFileEx {
    Socket socket;
    BufferedReader bufferedReader;
    BufferedWriter bufferedWriter;

    public ClientFileEx() {
        System.out.println("1. 클라이언트 소켓 시작---------");
        try {
            Socket socket = new Socket("localhost", 10000);


            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            System.out.println("2. 버퍼(Write) 연결 완료");

            System.out.println("3. 키보드 스트림 + 버퍼(read) 연결완료 ---------------------");
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("4.키보드 메시지 입력 대기중 ---------------------------------");
            String keyboardMsg = bufferedReader.readLine();

            bufferedWriter.write(keyboardMsg+"\n");
            bufferedWriter.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
