package tugas;

public class tugaspercabangan {  public static void main(String[] args) {
    double[][] tankimobil = new double[5][30];
    double[] perjalanan = new double[30];
    tankimobil[0][0] = 8000;
    tankimobil[1][0] = 9000;
    tankimobil[2][0] = 7500;
    tankimobil[3][0] = 7000;

    tankimobil[4][0] = tankimobil[0][0] * perjalanan[0] +
            tankimobil[1][0] * perjalanan[1] +
            tankimobil[2][0] * perjalanan[2] +
            tankimobil[3][0] * perjalanan[3] ;

    System.out.println("banyak bensin :" +tankimobil[4][0]);

    tankimobil[0][1] = 8000;
    tankimobil[1][1] = 9000;
    tankimobil[2][1] = 7500;
    tankimobil[3][1] = 7000;

    tankimobil[4][1] = 0;
    for (int i = 0; i <= 3; i++) {
        tankimobil[4][1] += tankimobil[i][1] * perjalanan[i];
2
    }
    System.out.println("banyak bensin :" + tankimobil[4][1]);

    double jumlahNilaiAkhir = 0;
    for (int i = 0; i <= 3; i++) {
        jumlahNilaiAkhir += tankimobil[4][i];
    }
    System.out.println(jumlahNilaiAkhir);

}
}

k