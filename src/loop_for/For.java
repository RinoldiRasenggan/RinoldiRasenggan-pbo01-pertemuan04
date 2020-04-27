package loop_for;

public class For {
    public static void main(String[] args){
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("isi gelas sekarang :" + isiGelas + "ml");
        System.out.println("isi gelas sekarang :" + penuh + "ml");

        for (isiGelas = 0 ; isiGelas <= penuh ; isiGelas++){
            System.out.println("sedang mengisi gelas");
            System.out.println("isi gelas sekarang :" + isiGelas + "ml");
        }



        System.out.println("finale : isi gelas sekarang : " + isiGelas + "ml");
    }
}

