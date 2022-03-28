package com.ch07.socket2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientFile2 {


    Socket socket;
    BufferedWriter bw;
    BufferedReader br;

    public ClientFile2(){
        try {
            System.out.println("1. 클라이언트소켓 시작----------------------");
            socket = new Socket("localhost", 10000);


            System.out.println("2. 버퍼(write) 연결완료--------------------");
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            //키보드 연결
            System.out.println("3. 키보드 스트림 + 버퍼(read) 연결완료--------------------- ");
            br = new BufferedReader(new InputStreamReader(System.in));

            while(true){
                System.out.println("4. 키보드 메세지 입력 대기중------------------------------");
                String keyboardMsg = br.readLine();

                //메시지 끝을 알려줘야한다.  --- 알려주는 신호 : \n
                bw.write(keyboardMsg+"\n");
                bw.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

    }
}
