package client;

import factory.AlgFactory;
import model.AlgBase;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        String mode = "enc";
        String alg = "shift";
        StringBuilder msg = new StringBuilder();
        int key = 0;
        File outputFile = null;
        File inputFile = null;

        for (int i = 0; i < args.length; i += 2) {
            switch (args[i]) {
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    msg.append(args[i + 1]);
                    break;
                case "-in":
                    if ("".equals(msg.toString())) {
                        inputFile = new File(args[i + 1]);
                    }
                    break;
                case "-out":
                    outputFile = new File(args[i + 1]);
                    outputFile.createNewFile();
                    break;
                case "-alg":
                    alg = args[i + 1];
                    break;
            }
        }

        AlgBase algorithm = AlgFactory.createAlgorithm(alg, msg.toString(), mode, key);
        if ("enc".equals(mode)) {
            algorithm.encrypt(inputFile, outputFile);
        } else {
            algorithm.decrypt(inputFile, outputFile);
        }
    }
}
