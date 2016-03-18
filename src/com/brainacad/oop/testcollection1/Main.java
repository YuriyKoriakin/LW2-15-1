package com.brainacad.oop.testcollection1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yuriy on 16.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();//declare Collection with realization ArrayList
        for(int i=0;i<11;i++){//loop
           list.add("number: "+i);//fill collection
                    }
        for(String str:list){
            System.out.println(str);
        }
    }
}
