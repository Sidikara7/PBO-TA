abstract class  Biodata {
    public abstract void Data(String nama, String ttl, String nomor);
    public void mbio(){
        System.out.println("Data Pembuat");
    }
    interface Biodata2{
        String jk1=" Laki-laki";
        String alam=" Jalan Sapan II A No.175";
        void jk();
        void alamat();
    }
}
