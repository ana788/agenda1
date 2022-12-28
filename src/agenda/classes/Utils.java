package agenda.classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author windows
 */
public class Utils {

    public static char[] hexRepresentation(byte[] text) {
        char[] hexOutput = new char[text.length * 2];
        String hexString;
        for (int i = 0; i < text.length; i++) {
            hexString = "00" + Integer.toHexString(text[i]);
            hexString.toString().getChars(hexString.length() - 2,
                    hexString.length(), hexOutput, i * 2);
        }
        return hexOutput;
    }

}