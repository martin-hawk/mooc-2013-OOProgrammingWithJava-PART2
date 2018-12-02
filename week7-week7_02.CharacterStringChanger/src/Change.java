/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martynas Vanagas
 */
public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        char[] characters = characterString.toCharArray();
        String newString = "";

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == this.fromCharacter) {
                characters[i] = this.toCharacter;
            }
            newString += characters[i];
        }

        return newString;
    }
}
