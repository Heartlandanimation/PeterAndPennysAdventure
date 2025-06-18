
package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private File logfile;
    private FileWriter writer;


    public Logger(String filename) throws IOException {
        logfile = new File(filename);
        if(logfile.exists()){
            writer = new FileWriter(logfile, true); //Adding a second Parameter and true allows me to appended to the .txt file and logger
        }else {
            writer = new FileWriter(logfile);
        }
    }

    public void write(String message) throws IOException{
        writer.write(message + "\n");
        writer.flush();
    }
}