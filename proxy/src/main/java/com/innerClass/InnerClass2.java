package com.innerClass;

public class InnerClass2 {
    public static void main(String[] args) {

    }

    public Comparable getCompare(){
        //匿名接口的有名实现类
        /*class MyComparable implements Comparable{
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();*/

        //匿名接口的匿名实现类
        return new Comparable(){
            public int compareTo(Object o){
                return 0;
            }
        };

    }
}
