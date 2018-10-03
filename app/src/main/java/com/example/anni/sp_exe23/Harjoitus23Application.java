package com.example.anni.sp_exe23;

import android.app.Application;
import android.util.Log;

public class Harjoitus23Application extends Thread {

    public interface Harjoitus23Interface {
        void threadProgressing(String message);
    }

    public String identifier = "";
    protected Harjoitus23Interface listener = null;

    public void setListener(Harjoitus23Interface aListener) {
        this.listener = aListener;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread stared");
            while (true) {
                if (listener != null) {
                    listener.threadProgressing("Tiisu, We want more!");
                    sleep(5000);
                }
            }
        } catch (Exception e) {
            while (true) {
                if (listener != null) {
                    listener.threadProgressing("Thread interrupted!");
                    //System.out.println("Master, give your command!");
                    e.printStackTrace();
                }
            }
        }
    }
}

