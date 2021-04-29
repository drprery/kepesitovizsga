package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String output){
        if (contacts == null || output == null){
            throw new IllegalArgumentException("Empty parameters!");
        }

        try {
            for (String key : contacts.keySet()) {
                Files.writeString(Path.of(output),key+": "+contacts.get(key), StandardOpenOption.APPEND);
            }
        } catch (IOException ioe){
            throw new IllegalStateException("Can not write file!");
        }
    }
}
