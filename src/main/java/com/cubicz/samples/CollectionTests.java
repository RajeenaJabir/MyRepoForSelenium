//collections :ArrayList

package com.cubicz.samples;

import java.util.ArrayList;

public class CollectionTests {
    public static  void main(String args[]){
        ArrayList ar= new ArrayList();
        ar.add(12);//Integer object
        ar.add(100.123);//Float object
        ar.add("hello");//String object


       // ar.add(2,"TWO");
       System.out.println(ar);
        ArrayList a=new ArrayList();
        a.add("start");
        a.addAll(0,ar);
        a.add(2,"TWO");
        System.out.println(a);
        System.out.println(a);
        System.out.println(a.size());

    }
}
