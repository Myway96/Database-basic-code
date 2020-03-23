package myway.demo01;

//数组的添加、删除、插入、取出、替换

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArray {
    //用于存储数据的数组
    private int[] elements;

    // 构造方法
    public MyArray() {
        elements = new int[0];

    }

    //    获取数组长度的方法
    public int size() {
        return elements.length;
    }

    //    往数组的末尾添加一个元素de方法
    public void add(int element) {
//        创建一个新的数组
        int[] newArr = new int[elements.length + 1];
//        把原数组中的元素复制到新的数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
//       把添加的元素放入到新数组
        newArr[elements.length] = element;
//        使用新数组替换旧数组
        elements = newArr;
    }

    //    打印所有元素de方法
    public void show() {
        System.out.println(Arrays.toString(elements));
    }

    //    删除一个元素
    public void delete(int index) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
//        创建一个新数组，长度减一
        int[] newArr = new int[elements.length - 1];

        for (int i = 0; i < elements.length - 1; i++) {
           /* while(i != index){
                newArr[i] = elements[i];
            }
            错误的！！！*/
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                newArr[i] = elements[i + 1];

            }

        }
//        替换
        elements = newArr;
    }

    //    取出指定位置的元素
    public int get(int index) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        return elements[index];
    }

    //    插入元素
    public void insert(int index, int element) {
        //创建
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < newArr.length - 1; i++) {
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                newArr[i + 1] = elements[i];
            }
        }
        newArr[index] = element;

        elements = newArr;
    }
//    替换
    public void set(int index,int element){
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        elements[index] = element;
    }
}

