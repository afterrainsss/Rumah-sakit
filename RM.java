package other;
import java.util.Scanner;
public class RM {
    String [] nama = new String[99];
    String [] alamat = new String[99];
    String [] JK = new String[99];
    String dokter,cek,kamar;
    int pilih,jasa,pilih2,lama,pilih3,tarif;
    Scanner sc = new Scanner(System.in);
    void print (){
        int i = 0;
       while (true){
           System.out.println("Masukan data diri anda");
           System.out.print("Nama   : ");
           nama[i] = sc.next();
           System.out.print("Alamat : ");
           alamat[i] = sc.next();
           System.out.print("Kelamin : ");
           JK[i] = sc.next();
           System.out.println("1.Dokter Anak\n2.Dokter Penyakit Dalam\n3.Dokter THT\n4.Dokter Bedah\n5.Dokter Umum");
           System.out.println();
           while (true){
               System.out.print("Pilihan anda    : ");
               pilih = sc.nextInt();
               if(pilih == 1){
                   dokter = "Dokter Anak";
                   jasa = 70_000;
                   break;
               }else if(pilih == 2){
                   dokter = "Dokter Penyakit dalam";
                   jasa = 80_000;
                   break;
               }else if(pilih == 3){
                   dokter = "Dokter THT";
                   jasa = 60_000;
                   break;
               }else if(pilih == 4){
                   dokter = "Dokter Bedah";
                   jasa = 100_000;
                   break;
               }else if(pilih == 5){
                   dokter = "Dokter Umum";
                   jasa = 50_000;
                   break;
               }else{
                   System.out.println("Masukan angka 1-5");
               }
           }
           System.out.println("1.Rawat di rumah\n2.Rawat Inap");
           System.out.print("Pilih [1/2] : ");
           pilih2 = sc.nextInt();
           if(pilih2 == 1){
               System.out.println("Nama     : "+nama[i]);
               System.out.println("Alamat   : "+alamat[i]);
               System.out.println("Kelamin  : "+JK[i]);
               System.out.println("Pilihan dokter   : "+dokter);
               System.out.println("Biaya    : "+jasa);
           }else if(pilih2 == 2){
               System.out.print("Masukan lama menginap  : ");
               lama = sc.nextInt();
               while (true){
                   System.out.println("1.Kamar 1\n2.Kamar 2\n3.Kamar 3\n4.Kamar VIP\n5.Kamar VVIP");
                   System.out.print("Pilih kamar : ");
                   pilih3 = sc.nextInt();
                   if(pilih3 == 1){
                       kamar = "Kamar 1";
                       tarif = 600_000;
                       System.out.println("Nama     : "+nama[i]);
                       System.out.println("Alamat   : "+alamat[i]);
                       System.out.println("Kelamin  : "+JK[i]);
                       System.out.println("Pilihan dokter   : "+dokter);
                       System.out.println("Biaya    : "+jasa);
                       System.out.println("Kamar    : "+kamar);
                       System.out.println("Lama menginap  : "+lama+" Hari");
                       System.out.println("Tarif    : "+tarif);
                       break;
                   }else if(pilih3 == 2){
                       kamar = "Kamar 2";
                       tarif = 800_000;
                       System.out.println("Nama     : "+nama[i]);
                       System.out.println("Alamat   : "+alamat[i]);
                       System.out.println("Kelamin  : "+JK[i]);
                       System.out.println("Pilihan dokter   : "+dokter);
                       System.out.println("Biaya    : "+jasa);
                       System.out.println("Kamar    : "+kamar);
                       System.out.println("Lama menginap  : "+lama+" Hari");
                       System.out.println("Tarif    : "+tarif);
                       break;
                   }else if(pilih3 == 3){
                       kamar = "Kamar 3";
                       tarif = 120_000;
                       System.out.println("Nama     : "+nama[i]);
                       System.out.println("Alamat   : "+alamat[i]);
                       System.out.println("Kelamin  : "+JK[i]);
                       System.out.println("Pilihan dokter   : "+dokter);
                       System.out.println("Biaya    : "+jasa);
                       System.out.println("Kamar    : "+kamar);
                       System.out.println("Lama menginap  : "+lama+" Hari");
                       System.out.println("Tarif    : "+tarif);
                       break;
                   }else if(pilih3 == 4){
                       kamar = "Kamar VIP";
                       tarif = 1_500_000;
                       System.out.println("Nama     : "+nama[i]);
                       System.out.println("Alamat   : "+alamat[i]);
                       System.out.println("Kelamin  : "+JK[i]);
                       System.out.println("Pilihan dokter   : "+dokter);
                       System.out.println("Biaya    : "+jasa);
                       System.out.println("Kamar    : "+kamar);
                       System.out.println("Lama menginap  : "+lama+" Hari");
                       System.out.println("Tarif    : "+tarif);
                       break;
                   }else if(pilih3 == 5){
                       kamar = "Kamar VVIP";
                       tarif = 2_000_000;
                       System.out.println("Nama     : "+nama[i]);
                       System.out.println("Alamat   : "+alamat[i]);
                       System.out.println("Kelamin  : "+JK[i]);
                       System.out.println("Pilihan dokter   : "+dokter);
                       System.out.println("Biaya    : "+jasa);
                       System.out.println("Kamar    : "+kamar);
                       System.out.println("Lama menginap  : "+lama+" Hari");
                       System.out.println("Tarif    : "+tarif);
                       break;
                   }else {
                       System.out.println("masukan angka 1-5");
                   }
               }
           }
           i++;
           System.out.print("Mau masukan data lagi? [Y/N] : ");
           cek = sc.next();
           if(cek.equalsIgnoreCase("Y")){
               print();
           }else if(cek.equalsIgnoreCase("N")){
               break;
           }
       }
    }
}
