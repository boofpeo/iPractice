package practice.test;

import java.util.Collections;
import java.util.List;

public class KTest {

    // 匿名内置类
    {
        new Runnable() {
            @Override
            public void run() {

            }
        };
    }

    public static void main(String[] args) {
        String ms = null;
        String ko = "";
//        Integer intMs = Integer.valueOf(ms);
        Integer intKo = Integer.valueOf(ko);
//        if (intMs.intValue() == 0) {
//            System.out.println("yes");
//        }
        if (intKo.intValue() == 0) {
            System.out.println("yes");
        }
    }

    public static void function(String data) {

    }

    public static void function(Integer data) {

    }

    //
    public static void function(List<Integer> data) {
        List<String> Date = Collections.emptyList();
        List<Integer> Date2;
    }
//
//    public static void function(List<String> data ) {
//
//    }
}
