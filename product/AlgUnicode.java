package product;

import model.AlgBase;

public class AlgUnicode extends AlgBase {
    String mode;
    int key;

    public AlgUnicode(String data, String mode, int key) {
        this.data = data;
        this.mode = mode;
        this.key = key;
    }

    @Override
    public void encode() {
        StringBuilder encryptedMsg = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            encryptedMsg.append((char) (data.charAt(i) + key));
        }
        data = encryptedMsg.toString();
    }

    @Override
    public void decode() {
        StringBuilder encryptedMsg = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            encryptedMsg.append((char) (data.charAt(i) - key));
        }
        data = encryptedMsg.toString();
    }
}
