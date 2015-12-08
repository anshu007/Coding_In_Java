package com.multithreading;
 class Chat {
    boolean flag = false;

    public synchronized void Question(String msg) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = true;
        notify();
    }

    public synchronized void Answer(String msg) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(msg);
        flag = false;
        notify();
    }
}

class T1 implements Runnable {
    Chat m;
    String[] s1 = { "Hi", "How are you ?", "I am al" +
    		"so doing fine!" };

    public T1(Chat m1) {
        this.m = m1;
       // new Thread(this, "Question").start();
    }

    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.Question(s1[i]);
        }
    }
}

class T2 extends Thread {
    Chat m;
    String[] s2 = { "Hi", "I am good, what about you?", "Great!" };

    public T2(Chat m2) {
        this.m = m2;
    }

    public void run() {
        for (int i = 0; i < s2.length; i++) {
            m.Answer(s2[i]);
        }
    }
}
public class interthreadcommunication {
    public static void main(String[] args) {
        Chat m = new Chat();
        Runnable r=new T1(m);
        Thread a=new Thread(r);
        a.start();
       // Runnable r1=new T2(m);
     //   Thread b=new Thread(r1);
        Thread b=new T2(m);
        b.start();
        
    }
}
