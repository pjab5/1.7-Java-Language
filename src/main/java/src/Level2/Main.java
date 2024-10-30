package src.Level2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;

public class Main {
    public static void main(String[] args) {
        Worker2 worker = new Worker2("Peter","Parker",12);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ToJson toJson = worker.getClass().getAnnotation(ToJson.class);
        System.out.println(toJson);
        String directory = toJson.directory();
        System.out.println(directory);
        try (FileWriter file = new FileWriter(directory+ FileSystems.getDefault().getSeparator()+"worker.json")){
            gson.toJson(worker,file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}