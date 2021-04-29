package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {
    public void exportPhonebook(Map<String, String> contacts, String output){
        if (contacts == null || output == null){

            throw new IllegalArgumentException("Parameters is empty!");

        }

        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(output))) {

            write(contacts, writer);

        } catch (IOException ioe) {

            throw new IllegalArgumentException("File write error!");
        }
    }

    private void write(Map<String, String> contacts, BufferedWriter writer) throws IOException {

        for (Map.Entry c : contacts.entrySet()) {
            writer.write(c.getKey() + ": " + c.getValue() + "\n");
        }
    }
}

