package model;

import java.io.*;

public abstract class AlgBase {
    public String data;

    public void encrypt(File inputFile, File outputFile) {
        readData(inputFile);
        encode();
        writeData(outputFile);
    }

    public void decrypt(File inputFile, File outputFile) {
        readData(inputFile);
        decode();
        writeData(outputFile);
    }

    public abstract void encode();

    public abstract void decode();

    private void readData(File inputFile) {
        if ("".equals(data)) {
            if (inputFile != null) {
                readMsg(inputFile);
            }
        }
    }

    public void readMsg(File inputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            StringBuilder msg = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                msg.append(line);
            }
            data = msg.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void writeData(File outputFile) {
        if (outputFile != null) {
            try (FileWriter writer = new FileWriter(outputFile)) {
                writer.write(data);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println(data);
        }
    }
}
