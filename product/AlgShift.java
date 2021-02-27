package product;

import model.AlgBase;

public class AlgShift extends AlgBase {
    String mode;
    int key;

    public AlgShift(String data, String mode, int key) {
        this.data = data;
        this.mode = mode;
        this.key = key;
    }

    @Override
    public void decode() {
        StringBuilder decryptedMsg = new StringBuilder(data);
        for (int i = 0; i < decryptedMsg.length(); i++) {
            String s = decryptedMsg.substring(i, i + 1);
            if (s.matches("[a-z]")) {
                char c = (char) (decryptedMsg.charAt(i) - key);
                if (c < 'a') {
                    c = (char) ('z' + c - 'a' + 1);
                }
                decryptedMsg.setCharAt(i, c);
            } else if (s.matches("[A-Z]")) {
                char c = (char) (decryptedMsg.charAt(i) - key);
                if (c < 'A') {
                    c = (char) ('Z' + c - 'A' + 1);
                }
                decryptedMsg.setCharAt(i, c);
            }
        }
        data = decryptedMsg.toString();
    }

    @Override
    public void encode() {
        StringBuilder encryptedMsg = new StringBuilder(data);
        for (int i = 0; i < encryptedMsg.length(); i++) {
            String s = encryptedMsg.substring(i, i + 1);
            if (s.matches("[a-z]")) {
                char c = (char) (encryptedMsg.charAt(i) + key);
                if (c > 'z') {
                    c = (char) ('a' + c - 'z' - 1);
                }
                encryptedMsg.setCharAt(i, c);
            } else if (s.matches("[A-Z]")) {
                char c = (char) (encryptedMsg.charAt(i) + key);
                if (c > 'Z') {
                    c = (char) ('A' + c - 'Z' - 1);
                }
                encryptedMsg.setCharAt(i, c);
            }
        }
        data = encryptedMsg.toString();
    }
}
