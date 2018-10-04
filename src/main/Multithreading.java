package main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Multithreading {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\server\\IdeaProjects\\ Multithreading\\src\\resources");
        List<File> files = new ArrayList<>();
        files.add(file);


        ExecutorService executor = Executors.newFixedThreadPool(4);
        for (File f : files) {
            executor.submit(
                    () -> {
                        String name = f.getName();
                        System.out.println((name.substring(name.lastIndexOf(".") + 1) + " " + f.length()));
                    }
            );
        }executor.shutdown();
    }
}

