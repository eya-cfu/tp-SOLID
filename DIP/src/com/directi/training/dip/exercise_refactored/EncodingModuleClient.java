package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.net.URL;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        IReader reader = new MyFileReader(
            "DIP/src/com/directi/training/dip/exercise_refactored/beforeEncryption.txt");
        IWriter writer = new MyFileWriter(
            "DIP/src/com/directi/training/dip/exercise_refactored/afterEncryption.txt");
        EncodingModule encodingModule = = new EncodingModule(reader, writer);
        encodingModule.encode();

        reader = new NetworkReader(new URL("http", "myfirstappwith.appspot.com", "/index.html"));
        writer = new MyDatabaseWriter();
        encodingModule.setWriter(writer);
        encodingModule.setReader(reader);
        encodingModule.encode();
    }
}
