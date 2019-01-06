package Praktikum10.Tugas;


public class Prodi {
    String kd_prodi;
    String prodi;
    
    public Prodi(String vkd_prodi, String vprodi){
        this.kd_prodi = vkd_prodi;
        this.prodi = vprodi;
    }
    
    public String getKd_prodi(){
        return kd_prodi;
    }
    
    public void setKd_prodi(String vkd_prodi){
        this.kd_prodi = vkd_prodi;
    }
    
    public String getProdi(){
        return prodi;
    }
    
    public void setProdi(String vprodi){
        this.prodi = vprodi;
    }
    
}
