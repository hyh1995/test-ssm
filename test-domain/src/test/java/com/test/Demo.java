package com.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Demo {

    public int age;
    public String name = "zhagnsan";


    public static void main(String[] args) {
       /* String a= new String("asdg");
        System.out.println(a.length());

        int[]arr={1,2,3,5,6,1};
        System.out.println( arr.length);

        List B= new ArrayList();

        B.add(1);
        B.add(5);

        System.out.println(B.size());


        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        String s = format.format(date);

        System.out.println(s);

        byte aa= 127;
        //aa=aa+1;
        aa+=128;
       // aa=128;

         Demo demo =new Demo();

       // System.out.println(demo.name+"is"+age+);*/
        int[][] list = new int[2][];
        System.out.println("aaaaaa");
        list[0] = new int[2];
        list[1] = new int[3];
        System.out.println("success");
        int a= 8;
        int b= 1;
        try {
            int f=1/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        int c =a/b;
        System.out.println(c);




    }
}
