package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multithreading {
    public static void main(String[] args) {
String path ="C:\\Users\\server\\IdeaProjects\\ Multithreading\\src\\resources";
        File file = new File(path);
        List<File> files = new ArrayList<>();
        files.add(file);
InfoFile infoFil = new InfoFile();
infoFil.putFile(files);



    }
}

