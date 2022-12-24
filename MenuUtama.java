import javax.swing.JOptionPane;


public class MenuUtama{
    public static void main (String [] args){
        String isi,pil_string,ulang_string;
        int pil,ulang;
        Nasabah xx;


        do { //perulangan
            isi="1. PENDATAAN DEPOSIT\n"+"2. PENDATAAN TABUNGAN REGULER\n"+"3. KELUAR";
            pil_string=JOptionPane.showInputDialog(null,isi, "BANK HAKIM",JOptionPane.QUESTION_MESSAGE);
            pil=Integer.parseInt(pil_string);
            switch(pil) { //perkondisian
                case 1:{
                    int pil2;
                    Deposit satu=new Deposit();
                    xx = satu;
                    do { //perulangan
                        isi="1. Pendaftaran Data Deposit Baru\n"+"2. Cetak Data Nasabah\n"+"3. Tambah Saldo\n"
                                + "4. Cetak Saldo\n"+ "5. Penarikan\n"+"6. Keluar\n"+"Masukkan pilihan anda :";
                        pil_string=JOptionPane.showInputDialog(null,isi, "BANK HAKIM", JOptionPane.QUESTION_MESSAGE);
                        pil2=Integer.parseInt(pil_string);
                        switch(pil2) { //perkondisian
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
                            case 5:{xx.penarikan();xx.cetak_penarikan();
                                break;}
                            case 6:JOptionPane.showMessageDialog(null,"Klik OK untuk melanjutkan");
                                break;
                        }
                        ulang_string=JOptionPane.showInputDialog("Mau transaksi lagi?\nJika YA input 1\n" +
                                "MENUJU MENU UTAMA input 0\n"+"masukkan pilihan :");
                        ulang=Integer.parseInt(ulang_string);
                    }while(ulang==1);
                }
                case 2:{
                    int pil2;
                    Tabungan tab1=new Tabungan();
                    xx = tab1;
                    do { //perulangan
                        isi="1. Pendaftaran Data Tabungan Baru\n"+"2. Cetak Data Nasabah\n"+"3. Tambah Saldo\n"
                                + "4. Cetak Saldo\n"+"5. Keluar\n"+"Masukkan pilihan anda :";
                        pil_string=JOptionPane.showInputDialog(null,isi, "BANK HAKIM", JOptionPane.QUESTION_MESSAGE);
                        pil2=Integer.parseInt(pil_string);
                        switch(pil2) { //perkondisian
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
                            case 5:JOptionPane.showMessageDialog(null,"Klik OK untuk melanjutkan");
                                break;
                        }
                        ulang_string=JOptionPane.showInputDialog("Mau transaksi lagi?\nJika YA input 1\n" +
                                "MENUJU MENU UTAMA input 0\n"+"masukkan pilihan :");
                        ulang=Integer.parseInt(ulang_string);
                    }while(ulang==1);
                }
                case 3:JOptionPane.showMessageDialog(null,"Klik OK untuk melanjutkan");
                    break;
            }
            ulang_string=JOptionPane.showInputDialog("Mau transaksi lagi?\nMENU UTAMA input 1\n" +
                    "KELUAR input 0\n"+"masukkan pilihan :");
            ulang=Integer.parseInt(ulang_string);
        }
        while(ulang==1);
    }

}
