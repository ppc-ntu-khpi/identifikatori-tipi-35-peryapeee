package domain;

/**
 * This class can encrypt russians and english words by russian or english keys
 *
 */
public class Exercise {
    private final int bias,
            letters; // letters of Alphabet;

    public Exercise(final int bias, final int letters) {
        this.bias = bias;
        this.letters = letters;
    }

    /**
     *
     * @param text Text to encrypt
     * @param key Key for encrypt
     * Method that return encrypted text
     * @return String
     */
    public String encrypt(final String text, final String key) {
        String encrypt = "";
        final int keyLen = key.length();
        for (int i = 0, len = text.length(); i < len; i++) {
            encrypt += (char) (((text.charAt(i) + key.charAt(i % keyLen) - 2 * this.bias) % this.letters) + this.bias);
        }
        return encrypt;
    }

    /**
     *
     * @param cipher Text to decrypt
     * @param key Key to decrypt
     * Method that return decrypted text
     * @return String
     */
    public String decrypt(final String cipher, final String key) {
        String decrypt = "";
        final int keyLen = key.length();
        for (int i = 0, len = cipher.length(); i < len; i++) {
            decrypt += (char) (((cipher.charAt(i) - key.charAt(i % keyLen) + this.letters) % this.letters) + this.bias);
        }
        return decrypt;
    }
}
