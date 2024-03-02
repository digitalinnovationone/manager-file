package br.com.dio.persistence;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NIO2FilePersistence extends FilePersistence{

    public NIO2FilePersistence(final String fileName) throws IOException{
        super(fileName, "/managedFiles/NIO2/");
        var path = Paths.get(currentDir + storedDir);
        if (!Files.exists(path)){
            Files.createDirectory(path);
        }
        clearFile();
    }

    @Override
    public String write(final String data) {
        var path = Paths.get(currentDir + storedDir + fileName);
        try{
            Files.write(path, data.getBytes(), StandardOpenOption.APPEND);
            Files.write(path, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return data;
    }

    @Override
    public String findAll() {
        var path = Paths.get(currentDir + storedDir + fileName);
        var content = "";
        try(var lines = Files.lines(path)){
            content = lines.collect(Collectors.joining(System.lineSeparator()));
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return content;
    }

    @Override
    public String findBy(final String sentence) {
        var content = findAll();
        return Stream.of(content.split(System.lineSeparator()))
                .filter(c -> c.contains(sentence))
                .findFirst()
                .orElse("");
    }

}
