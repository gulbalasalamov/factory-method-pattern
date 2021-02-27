package factory;

import model.AlgBase;
import product.AlgShift;
import product.AlgUnicode;


public class AlgFactory {
    public static AlgBase createAlgorithm(String algorithmType, String data, String mode, int key) throws Exception {
        switch (algorithmType) {
            case "unicode":
                return new AlgUnicode(data, mode, key);
            case "shift":
                return new AlgShift(data, mode, key);
            default:
                throw new Exception("Unspecified algorithm: " + algorithmType);
        }
    }
}
