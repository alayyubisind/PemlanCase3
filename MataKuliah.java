package tugas3;
public class MataKuliah  {

    private String kode;
    private String namaMK;
    private double nilaiAngka;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public String getNamaMK(){
        return namaMK;
    } 

    public void setNamaMK(String namaMK){
        this.namaMK = namaMK;
    }

    public double getNilaiAngka(){
        return nilaiAngka;
    }

    public void setNilaiAngka(double nilaiAngka) {
        this.nilaiAngka = nilaiAngka;
    }

    public String hitungNilaiHuruf() {
        if (nilaiAngka >= 80 && nilaiAngka <= 100) {
            return "A";
        } else if (nilaiAngka >= 70 && nilaiAngka < 80) {
            return "B";
        } else if (nilaiAngka >= 60 && nilaiAngka < 70) {
            return "C";
        } else if (nilaiAngka >= 50 && nilaiAngka < 60) {
            return "D";
        } else {
            return "E";
        }
    
    }




}
