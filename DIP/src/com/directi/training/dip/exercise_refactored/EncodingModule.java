package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule
{
    private IReader reader;
    private IWriter writer;

    public EncodingModule(IReader reader, IWriter writer) {
        this.writer = writer;
        this.reader = reader;
    }

    public void encode() throws IOException
    {
        String aLine = reader.read();
        String encodedLine = Base64.getEncoder().encodeToString(aLine.getBytes());
        writer.write(encodedLine);
    }

    public setWriter(IWriter writer) {
        this.writer = writer;
    }

    public setReader(IReader reader) {
        this.reader = reader;
    }
}

