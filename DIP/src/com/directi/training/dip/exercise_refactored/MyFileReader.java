package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader implements IReader
{
    private String fileName;

    public MyFileReader(String fileName)
    {
        fileName = fileName;
    }

    @Override
    public String read() throws IOException
    {
        BufferedReader reader = null;
        StringBuilder lines = new StringBuilder();
        try {
            reader = new BufferedReader(new FileReader(_fileName));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                lines.append(aLine);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return lines.toString();
    }
}
