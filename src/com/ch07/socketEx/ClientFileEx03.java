package com.ch07.socketEx;

import java.io.*;
import java.net.Socket;

/**
 * 1. 클라이언트 소켓 생성
 * 2. 버퍼(Write)연결 완료
 * 3. 키보드 스트림 + 버퍼 연결(read) 완료
 * 4. 키보드 입력대기중
 */
public class ClientFileEx03 {

        Socket socket; // 서버와 연결 할 소켓
        BufferedWriter bw; //클라이언트에서 서버로 전송되는 통로
        BufferedReader br; // 서버에서 클라이언트로 전송되는 통로
        BufferedReader keyboard;

    public ClientFileEx03() {
        try {
            System.out.println("Client socket start------");
            socket = new Socket("localhost", 10000);  // 서버소켓 연결

            System.out.println("2. buffer(write) 연결완료--------------------");
            // 소켓에 쓰기 데이터를 보내는 통로 설정
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            //키보드 연결
            System.out.println("3. 키보드 스트림 + 버퍼(read) 연결완료---------------");
            keyboard = new BufferedReader(new InputStreamReader(System.in));
            //키보드 입력으로 온 데이터를 전송하는 통로 설정
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));


            //새로운 스레드 역할 : 글 읽기
            ReadThread rt = new ReadThread(); // 새로운 스레드 생성
            Thread t1 = new Thread(rt); // Thread를 만들어 타켓은 rt 스레드
            t1.start(); // 스레드 실행

            // main 스레드 역할 : 글 쓰기
            while(true){
                System.out.println("4. 키보드 메시지 입력 대기중 ------------------");
                String keyboardMsg = keyboard.readLine();

                bw.write(keyboardMsg + "\n");
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class ReadThread implements Runnable{

        @Override
        public void run() {
            while(true){
                try {
                    String msg = br.readLine();
                    System.out.println("서버로 부터 받은 메시지 : " + msg);
                } catch (Exception e) {
                    System.out.println("클라이언트 소켓쪽에서 서버소켓 메시지를 입력받는 중 오류가 발생했습니다. :" + e.getMessage());
                }
            }
        }
    }
    public static void main(String[] args) {
        new ClientFileEx03();
    }
}
