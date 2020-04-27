package tugas;

public class tugasperulangan { public static void main(String[] args){
    int isitankimobil = 0;
    int penuh = 225;

    System.out.println("isi tanki sekarang :" + isitankimobil + "l");
    System.out.println("isi tanki sekarang :" + penuh + "l");

    for (isitankimobil = 0 ; isitankimobil <= penuh ; isitankimobil++){
        System.out.println("sedang mengisi tanki");
        System.out.println("isi tanki sekarang :" + isitankimobil + "l");
    }



    System.out.println("finale : isi tanki sekarang : " + isitankimobil + "l");
}
}
