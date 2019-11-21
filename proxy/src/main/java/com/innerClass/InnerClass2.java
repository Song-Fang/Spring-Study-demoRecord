package com.innerClass;

public class InnerClass2 {
    public static void main(String[] args) {

    }

    public Comparable getCompare(){
        class MyComparable implements Comparable{
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new MyComparable();
    }
}
