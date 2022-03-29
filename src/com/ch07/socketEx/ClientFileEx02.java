package com.ch07.socketEx;

import java.io.*;
import java.net.Socket;

public class ClientFileEx02 {
    Socket socket;

    BufferedWriter bufferedWriter;
    BufferedReader bufferedReader;

    public ClientFileEx02() {
        try {
        System.out.println("1.클라이언트 소켓 시작--------------");
        socket = new Socket();

        bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        System.out.println("2.버퍼(write) 연결 완료 ");

        System.out.println("3. 키보드 Stream + 버퍼 연결완료-----");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("4. 키보드 메시지 입력 대기중------------");
        String keyboardMsg = bufferedReader.readLine();

        bufferedWriter.write(keyboardMsg + "\n");
        bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
