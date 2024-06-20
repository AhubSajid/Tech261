package com.sparta.ms;

public class App {

    public static boolean findNeighbors(int[] inArray) {
        if (inArray != null) {

            for (int i = 0; i < inArray.length - 2; i++) {
                if (inArray[i] == inArray[i + 1] && inArray[i] == inArray[i + 2]) {
                    return true;
                }
            }
        }

            return false;

        }

}
