package main;

import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InfoFile {
    public void putFile(List<File> files){
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
