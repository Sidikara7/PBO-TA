import java.util.Random;
import javax.swing.JOptionPane;


public class Nasabah {

    private String nama, alamat, jk, noRek,jenistab;
    private final  Random random = new Random();

    public  String setNorek(int length) {
        String code = "";
        for (int i = 0; i < length; i++) {
            code += (char) (random.nextInt(10) + '0');
        }
        return code;
    }

    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getJk(){
        return jk;
    }
    public String getNorek(){
        return noRek;
    }
    public void indftNasabah(){
        JOptionPane.showMessageDialog(null, "PENDATAAN NASABAH BARU","PENDATAAN",
                JOptionPane.INFORMATION_MESSAGE);
        this.nama=JOptionPane.showInputDialog("Masukkan Nama  : ");
        this.alamat=JOptionPane.showInputDialog("Masukkan Alamat  : ");
        this.jk=JOptionPane.showInputDialog("Masukkan Jenis Kelamin  : ");
        this.noRek=setNorek(8);
        JOptionPane.showMessageDialog(null, "Data baru sudah di input");
    }
    public void inputJenis(){
    }
    public void cetak_nasabah(){
    }
    public void cetak_saldo(){
    }
    public void penyetoran(){
    }
    public void penarikan(){
    }
    public void cetak_penarikan(){
    }
    public String getJenistab(){
        return jenistab;
    }


}