package _01_singleton;


// 싱글톤

import java.io.Serializable;

public class MySettings implements Serializable { // 직렬화

//    private static Settings instance;
//    private static volatile Settings instance;// double checked locking
//    private static final Settings INSTANCE = new Settings(); //이른 초기화

    private MySettings() {}

    private static class SettingsHolder { // static inner 클래스 사용
        private static final MySettings INSTANCE = new MySettings();
    }

    public static MySettings getInstance() {// static inner 클래스 사용
        return SettingsHolder.INSTANCE;
    }

    protected Object readResolve() { // 직렬화 역직렬화 대응
        return getInstance();
    }




//    public static Settings getInstance() { // double checked locking
//        if (instance == null) {
//            synchronized (Settings.class) {
//                if (instance == null) {
//                    instance= new Settings();
//                }
//            }
//        }
//        return instance;
//    }


//    public static Settings getInstance() { //이른 초기화
//        return INSTANCE;
//    }


//    public static Settings getInstance() {  // 문제 웹애플리케이션 멀티 쓰레드에서는 안전하지않다
//
//        if (instance == null) {
//            instance = new Settings();
//        }
//        return instance;
//    }
//
//    public static synchronized Settings getInstance2() { //하나의 쓰레드만 이 메서드를 탄다
//        if (instance == null) {
//            instance = new Settings();
//        }
//        return instance;
//    }





}
