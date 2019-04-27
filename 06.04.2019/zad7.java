/*
 Laboratorium3, zadanie 6  Jakub Słomiński, Maciej Rybacki
*/
public class Palindrom {

    private String palindrom;

    public void ustawPalindrom(String palindrom) {
        palindrom = palindrom.replace(" ", "");
        palindrom = palindrom.replace(",", "");
        palindrom = palindrom.replace(".", "");
        palindrom = palindrom.toLowerCase();
        this.palindrom = palindrom;
    }


    public boolean sprawdzPalindrom() {
        for (int i = 0; i <= palindrom.length() / 2; i++) {
            if (palindrom.charAt(i) != palindrom.charAt(palindrom.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
