package com.innerClass;

public class InnerClass2 {
    public static void main(String[] args) {
        TestInnerClass testInnerClass = new TestInnerClass();
        testInnerClass.display();
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

class TestInnerClass{

    public void display(){
       final int value = 5;

         class InnerClass{
             int value = 10;
            public void display(){
                System.out.println("value="+value);
            }
        }

        new InnerClass().display();
    }
}
