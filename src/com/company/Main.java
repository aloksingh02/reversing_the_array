package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[] size = {1, 2, 3, 4, 5};
        reverse(size);
    }

    public static void reverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }
}