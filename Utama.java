import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class Utama{
    public static void main (String [] args){
        String isi,pil_string,ulang_string;
        int pil,ulang;
        Nasabah xx;
        Deposit satu=new Deposit();
        xx = satu;
        Datadiri dat = new Datadiri();
        try (Formatter rile = new Formatter("C:\\Users\\sidik\\IdeaProjects\\PBO3\\src\\Pbo.txt")){
            System.out.println("Selamat Datang Di Bank Bank Hakim");
            String nama ="\n\sSidikara Hakim";
            rile.format(nama);
            String ttl ="\n\sPalangkaraya,04-02-2003";
            rile.format(ttl);
            String nomor ="\n\s081257714775";
            rile.format(nomor);
            dat.mbio();
            dat.Data(nama, ttl, nomor);
            Biodata.Biodata2 tes = new Biodata.Biodata2() {
                @Override
                public void jk() {
                    System.out.println("Jenis Kelamin  : "+"\n"+jk1);
                    rile.format("\n");
                    rile.format(jk1);
                }

                @Override
                public void alamat() {
                    System.out.println("Alamat         : "+"\n"+alam);
                    rile.format("\n");
                    rile.format(alam);
                }
            };
            tes.jk();
            tes.alamat();
        }catch(FileNotFoundException ex){
            System.out.println("File Tidak Ditemukan");
        }


        do { //perulangan
            isi="1. Pendaftaran Nasabah Deposit\n"+"2. Cetak Data\n"+"3. Tambah Saldo\n"
                    + "4. Cetak Saldo\n"+"5. Daftar Tabungan :\n"+
                    "6. Cetak Saldo\n"+"7. Keluar\n"+"Masukkan pilihan anda :";
            pil_string=JOptionPane.showInputDialog(null,isi, "BANK HAKIM",
                    JOptionPane.QUESTION_MESSAGE);
            pil=Integer.parseInt(pil_string);
            switch(pil) { //perkondisian
                case 1:{
                    xx.indftNasabah();
                    xx.inputJenis();
                    JOptionPane.showMessageDialog(null, "Input Selesai, klik OK untuk melanjutkan","INPUT SELESAI",JOptionPane.INFORMATION_MESSAGE);
                    break;}
                case 2:{xx.cetak_nasabah();
                    break;}
                case 3: {xx.penyetoran();
                    break;}
                case 4:{xx.cetak_saldo();
                    break;}
                case 5: {
                    Tabungan tab1=new Tabungan();
                    xx = tab1;
                    xx.indftNasabah();xx.inputJenis();xx.cetak_nasabah();
                    break;}
                case 6:{


                    break;}
                case 7:JOptionPane.showMessageDialog(null,"Klik OK untuk keluar");
                    break;
            }
            ulang_string=JOptionPane.showInputDialog("Mau transaksi lagi?\nJika YA input 1\n" +
                    "jika TIDAK input 0\n"+"masukkan pilihan :");
            ulang=Integer.parseInt(ulang_string);
        }
        while(ulang==1);
    }

}