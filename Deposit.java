import javax.swing.JOptionPane;

public class Deposit extends Nasabah {

    private String jenisdep, jenistab;
    private double bunga,S_awal,S_akhir,setor,tarik,ambil,ambils;

    @Override
    public String getJenistab(){
        switch (jenisdep) {
            case "1":
                jenistab="Deposito";
                break;

        }
        return jenistab;

    }
    public double getSaldo(){
        return S_akhir;
    }
    public double setBunga(){
        return bunga;
    }
    public double setTarik(){
        return tarik;
    }
    @Override
    public void penyetoran(){
        if(getNama()==null){
            JOptionPane.showMessageDialog(null, "belum ada data");
        }else{
            String setor_string=JOptionPane.showInputDialog("masukkan jumlah deposito");
            setor=Integer.parseInt(setor_string);
            S_awal=S_awal+setor;
            switch (jenisdep) {
                case "1":
                    bunga=0.01*S_awal;
                    break;
                case "2":
                    bunga=0.02*S_awal;
                    break;
            }
            this.S_akhir=S_awal+bunga;
        }
    }

    @Override
    public void inputJenis(){
        this.jenistab=JOptionPane.showInputDialog("Pilih Jenis Tabungan\n"
                + "1. Deposito");
        this.jenisdep=JOptionPane.showInputDialog("Pilih Jenis Deposito\n"
                + "1. 6 bulan\n2. 12 bulan");
    }
    @Override
    public void cetak_nasabah(){
        if (getNama()!=null || getNorek()!=null){
            System.out.println("Nomor Rekening "+getNorek());
            System.out.println("Nama "+getNama());
            System.out.println("Jenis Tabungan "+getJenistab());
        }else{
            JOptionPane.showMessageDialog(null, "belum ada data");
        }
    }
    @Override
    public void cetak_saldo(){
        if(getSaldo()==0){
            JOptionPane.showMessageDialog(null, "belum ada data");
        }else{
            System.out.println("Deposito "+S_akhir);
            System.out.println("Bunga "+setBunga());
            System.out.println("Saldo Akhir "+getSaldo());
            if("1".equals(jenisdep)){
                System.out.println("Deposito 6 Bulan");
            }
            if("2".equals(jenisdep)){
                System.out.println("Deposito 12 Bulan");
            }
        }
    }
    @Override
    public void penarikan(){
        if(getSaldo()==0){
            JOptionPane.showMessageDialog(null, "belum ada data");
        }else{
            System.out.println("PENARIKAN DEPOSITO");
            cetak_nasabah();cetak_saldo();
            ambils=S_akhir-S_awal;
            JOptionPane.showMessageDialog(null, "Jumlah Dana yang bisa diambil adalah Rp. "+ambils);
            String a=JOptionPane.showInputDialog("Masukkan jumlah penarikan");
            this.tarik=Double.parseDouble(a);
            if(tarik>ambils){
                JOptionPane.showMessageDialog(null, "Dana tidak cukup");
            }else{
                this.ambils=ambils-tarik;
                S_akhir=S_akhir-tarik;
            }


        }
    }
    @Override
    public void cetak_penarikan(){
        System.out.println("DATA PENARIKAN DEPOSITO");
        JOptionPane.showMessageDialog(null, "Penarikan "+setTarik()+"\n"
                + getSaldo()+"\n");


    }

}
