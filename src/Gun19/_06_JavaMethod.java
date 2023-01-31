package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {
merhabaYaz();
merhabaYazIsme("gardas"); //String name=gardas    //parantezin icine birsey yazarsan alttaki maindede onu karsilayack degiskeni tanimlamalisin
                                //Burda name yerine ne gelmeli diye icine yaziyoruz
                                //name="gardas"


        cokMerhabaYaz(5);//miktar=5 //miktar yerine 5 sayisi gelcek     //burdaki parametreye birsey yazarsan asagidaki parametreyede yazmalisin

    }
       //YENI MAIN ACMAK ICIN ANA MAININ DISINDA CLASSIN ICINDE YAZ

        public static void merhabaYaz() {
            System.out.println("MERHABA DUNYA");
            System.out.println("MERHABA DUNYA");
        }
            //TEKRAR BIR MAIN ACTIGINDA DIGER MAININ DISINDA AC
            public static void merhabaYazIsme(String name){ //(String isim) olan yer parametredir. bu parametrenin ici bos olursa yukardaki parametresi alti kizarir cunku
                                                            //Gonderilen parametrenin bir karsiligi yok o yuzden bu parametreye eklememiz lazim
                                                            //yukarda parantez arasina birsey gonderiyorsan buradaki parantez arasinda onu karsilayan degiskeni yazman lazim ve o degiskene atansin
                                                            // ve burda kullanabilsin
                System.out.println("merhaba "+name+" merhaba");

            }
    public static void cokMerhabaYaz(int miktar){

        for (int i = 0; i <miktar ; i++) {
            System.out.println("Hi");

        }

    }
        }


