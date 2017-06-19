package com.example.cjj.myapplication.presentation.Activity;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.cjj.myapplication.R;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Picasso.with(this).load("").into(new ImageView(this));
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("").build();
        try {
            Response response = client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int N = 10;
        int time = N >> 1;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){

            }
        }

          new  Thread(new Runnable() {
              @Override
              public void run() {
                  try {
                      Socket socket = new Socket(IP,PORT);
                      PrintWriter pw = new PrintWriter(socket.getOutputStream());
                      if(socket.isConnected()){

                      }
                      if(socket.isConnected()){
                          while (true){
                              pw.write("me");
                              pw.flush();
                              Thread.sleep(3000);
                          }
                      }
                  }catch (IOException e) {

                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }


              }
          }).start();

    }
    private static final int PORT = 1234;
    private static final String IP = "192.168.1.1";

    private static final int BUFFER_SIZE = 1024;
    public static void main(String[] args) {
        ServerSocket ss;
        try {
            ss = new ServerSocket(PORT);
            Socket s = ss.accept();
            byte[] recData = null;
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            while(true) {
                recData = new byte[BUFFER_SIZE];
                int r = in.read(recData);
                //int r = in.read(recData);
                if(r>-1) {
                    String data = new String(recData);
                    if(data.trim().equals("over")) {
                        s.close();
                    }
                    System.out.println("读取到客户端发送的来数据："+data);
                    out.write("这是服务端发给客户端的数据：".getBytes());
                    out.write(recData);
                }else {
                    System.out.println("数据读取完毕！");
                    s.close();
                    System.exit(0);
                    //ss.close();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
