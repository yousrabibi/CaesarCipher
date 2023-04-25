package OOP;

public class CaesarCipher {
    private int shift;

    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    public String encrypt(String message) {
        StringBuilder encryptedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            if (Character.isLetter(currentChar)) {
                char shiftedChar = (char) (((currentChar - 'a' + shift) % 26) + 'a');
                encryptedMessage.append(shiftedChar);
            } else {
                encryptedMessage.append(currentChar);
            }
        }
        return encryptedMessage.toString();
    }

    public String decrypt(String message) {
        StringBuilder decryptedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            if (Character.isLetter(currentChar)) {
                char shiftedChar = (char) (((currentChar - 'a' - shift + 26) % 26) + 'a');
                decryptedMessage.append(shiftedChar);
            } else {
                decryptedMessage.append(currentChar);
            }
        }
        return decryptedMessage.toString();
    }
}
