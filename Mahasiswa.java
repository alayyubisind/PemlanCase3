package tugas3;

import java.util.ArrayList;

public class Mahasiswa {

    private String nim;
    private String nama;
    private ArrayList mataKuliahs = new ArrayList();

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<MataKuliah> getMataKuliahs (){
        return mataKuliahs;
    }

    public void setMataKuliahs (ArrayList<MataKuliah> mataKuliahs){
        this.mataKuliahs = mataKuliahs;
    }


}
