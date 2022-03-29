package com.ch07.socketEx;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1. 서버 소켓 시작
 * 2. 서버 소켓 생성
 * 3. 클라이언트 연결 완료
 * 4. 클라이언트로부터 받은 메시지 출력
 */
public class ServerFileEx03 {

    //클라이언트 연결 받는 소켓
    ServerSocket serverSocket;

    //실제 통신하는 소켓
    Socket socket;
    BufferedReader br ;

    //새로운 스레드(읽기)가 필요한 변수
    BufferedWriter bw ;
    BufferedReader keyboard;


    public ServerFileEx03() {
        System.out.println("--------1. 서버 소켓 시작--------");
        try {
            //클라이언트가 접속하는 서버 소켓 생성
            ServerSocket serverSocket = new ServerSocket(10000);

            System.out.println("--------2.서버 소켓 생성완료 : 클라이언트 연결 대기 중 ------");
            //서버 소켓이 소켓에 접근한다.
            socket = serverSocket.accept();
            System.out.println("------3. 클라이언트 연결완료 - buffer 연결완료 (read)");

            //소켓과 통신하는 통로 설정
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //키보드 입력 버퍼 : 키보드에 입력된 데이터들을 전달하는 통로
            keyboard = new BufferedReader(new InputStreamReader(System.in));
            //서버쪽 소켓에서 클라이언트로 쓰기(write) 데이터를 보내는 통로 설정
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            //write 스레드 역할 :  글 쓰기
            WriteThread wt = new WriteThread(); // 쓰기 클래스를 동적할당한다.
            Thread t1 = new Thread(wt); // 쓰레드를 생성해 타겟은 WriteThread 클래스를 한다.
            t1.start();

            //main 스레드역할 : 글 읽기.
            while(true){
                String msg = br.readLine();
                System.out.println("4.클라이언트로 부터 받은 메시지 : " + msg);
            }

        } catch (Exception e) {
            System.out.println("서버소켓 에러 발생함 : " + e.getMessage());

        }

    }

    //글을 써서 내보내는 로직
    class WriteThread implements Runnable{

        @Override
        public void run() {
            while(true){
                try {
                    System.out.println("4. 키보드 메시지 입력 대기중 ------------------");
                    String keyboardMsg = keyboard.readLine();
                    bw.write(keyboardMsg + "\n");
                    bw.flush();
                }catch (Exception e){
                    System.out.println("서버 소켓쪽에서 키보드 입력받는 중 오류가 발생했습니다. :" + e.getMessage());
                }
            }
        }
    }
    public static void main(String[] args) {
        new ServerFileEx03();
    }
}
