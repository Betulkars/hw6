package Odev3;

public class Sifreci {
    protected String harita;

    public Sifreci() {

        harita = new String("zyxwvutsrqponmlkjihgfedcba");
    }
    public Sifreci(String harita) {
        //map = new String("zyxwvutsrqponmlkjihgfedcba");
        // map = _map;
        setHarita(harita);

    }
    private void setHarita(String _harita) {
        if (_harita.length() == 26) {
            harita = _harita;
        }else {
            harita = "zyxwvutsrqponmlkjihgfedcba";
            System.out.println("Haritanın uzunluğu yanlış.Harita" + " " + harita + " " + "yapıldı.");
        }
    }
    public String getHarita() {
        return harita;
    }

    public String Sifrele(String kelime) {
        String sifreliMetin = "";
        String alfabe = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < kelime.length(); i++) {
            for (int j = 0; j < alfabe.length(); j++) {
               if (kelime.charAt(i) == alfabe.charAt(j)){
                    sifreliMetin += harita.charAt(j);
               }
            }

        }
        return sifreliMetin;


    }

    public String toString() {
        return "Sifreci - harita:" + harita;

    }


}
