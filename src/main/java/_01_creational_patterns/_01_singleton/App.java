package _01_creational_patterns._01_singleton;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {

        MySettings2 settings = MySettings2.INSTANCE;
        MySettings2 settings1 = null;

//        //eunm 이라  리플렉션을 막아놓음
//        Constructor<?>[] declaredConstructors = Settings2.class.getDeclaredConstructors();
//        for (Constructor<?> constructor : declaredConstructors) {
//            constructor.setAccessible(true);
//            settings1 = (Settings2) constructor.newInstance("INSTANCE");
//        }
//        System.out.println(settings == settings1);


        //싱글톤 패턴 구현 깨트리는 방법 2 직렬화 && 역직렬화
//        Settings settings1 = null;
//        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
//            out.writeObject(settings);
//        }
//        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
//            settings1 = (Settings) in.readObject();
//        }
//        System.out.println(settings == settings1); false

//        싱글톤 패턴 구현 깨트리는 방법 1 리플렉션 false
//        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Settings settings1 = constructor.newInstance();
//        System.out.println(settings ==settings1);
    }
}
