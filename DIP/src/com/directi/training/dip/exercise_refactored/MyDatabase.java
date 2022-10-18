package com.directi.training.dip.exercise;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase
{
    private static Map<Integer, String> data = new HashMap<>();
    private static int count = 0;

    public int write(String inputString)
    {
        data.put(++_count, inputString);
        return count;
    }
}
