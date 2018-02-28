//BETÜL KARS - 21520786 - ÖDEV3.


import Odev3.Sifreci;

import java.util.StringTokenizer;

public class TestSifreci {
    public static void main(String[] args) {

      Sifreci sifreci1 = new Sifreci();

        String harita= "fyazdblnuvcspogwthjximekqr";

        Sifreci sifreci2 = new  Sifreci(harita);

       KomleksSifreci kompleksSifreci1 = new KomleksSifreci(2);

        KomleksSifreci kompleksSifreci2 = new KomleksSifreci(harita, 4);

        System.out.println("\nsifreci1 : " + sifreci1);
        System.out.println();
        System.out.println("sifreci2 : " + sifreci2);
        System.out.println();
        System.out.println("kompleksSifreci1 : " + kompleksSifreci1);
        System.out.println();
        System.out.println("kompleksSifreci2 : " + kompleksSifreci2);
        System.out.println();

        String yanlisHarita = "hjklasdfgfdsalkjbgrgbnj";

        int yanlisAnahtar = -2;


        KomleksSifreci yanlisSifreci = new KomleksSifreci(yanlisHarita, yanlisAnahtar);

        System.out.println("yanlisSifreci : " + yanlisSifreci);

        String cumle = "the quick brown fox jumps over the lazy dog";

       //sifreci1 ile sifrelenmiş cümle
        String sifrelenmisCumle1 = "";

        //sifreci2 ile sifrelenmis cumle
        String sifrelenmisCumle2 = "";

        //kompleksSifreci1 ile sifrelenmiş cümle
        String kompleksSifrelenmisCumle1 = "";

        //kompleksSifreci2  ile sifrelenmis cumle
        String kompleksSifrelenmisCumle2 = "";
        //String cumle1="fox";
        StringTokenizer cumleTokenizer = new StringTokenizer(cumle);
        //System.out.println(sifreci1.Sifrele(cumle1));
       // sifrelenmisCumle1 += sifreci1.Sifrele(cumle1);
       // System.out.println(kompleksSifreci1.sifrele(cumle1));
        System.out.println();
        System.out.println("Sifrelenecek cumle: " + cumle);

       while(cumleTokenizer.hasMoreTokens()) { // derste yaptığımız gibi while döngüsü kullandım.
           // cumleTokenizer.nextToken() metodunu word tipinde bi stringe atadım çünkü atamadan yaptıgımda NoSuchElementException hatası verdi.
           // ve bu word değişkenini sifreci ve kompleksSifeci metotlarında parametro olarak aldım.
           String word =cumleTokenizer.nextToken();
           sifrelenmisCumle1 += " " + sifreci1.Sifrele(word);
           sifrelenmisCumle2 += " " + sifreci2.Sifrele(word );
           kompleksSifrelenmisCumle1 += " " + kompleksSifreci1.sifrele(word );
           kompleksSifrelenmisCumle2 += " " + kompleksSifreci2.sifrele(word );
           // sifrelenmisCumle1 += sifreci1.Sifrele(cumle);

       }
        System.out.println("sifreci1 ile şifrelenmiş cümle : "+sifrelenmisCumle1);
        System.out.println();
        System.out.println("sifreci2 ile şifrelenmiş cümle : "+sifrelenmisCumle2);
        System.out.println();
        System.out.println("komplekssifreci1 ile şifrelenmiş cumle : "+kompleksSifrelenmisCumle1);
        System.out.println();
        System.out.println("komplekssifreci2 ile şifrelenmiş cumle"+kompleksSifrelenmisCumle2);
         /* Burada, cumleTokenizer'ı kullanarak cumle'yi kelimelerine ayırın ve her bir kelimeyi sifreleyerek şifrelenmiş yeni cümleyi oluşturun.*/





    }
}
