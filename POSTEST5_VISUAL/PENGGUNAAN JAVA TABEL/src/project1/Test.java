package project1;
class Rumah {
    String alamat_rumah;
    public void setAlamat(String x){
            alamat_rumah=x;
    }
   }

public class Test {
    public static void main(String[] args) {
        Rumah r=new Rumah();
        r.setAlamat("Alamat saya di Jalan Pramuka");
        System.out.println(r.alamat_rumah);
    }
    
}
