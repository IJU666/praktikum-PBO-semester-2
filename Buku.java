public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public String setJudul(String judul){
        // String judul = "Dillan 1945";
        return setJudul("Dilan 1945"); 
    }

    public String tampilkan(){
        return "Mobil: " + judul + "Pengarang: " + pengarang + ", tahun: " + tahunTerbit;
    }

    

    public static void main(String[] args){
        Buku perpustakaan = new Buku("Dilan perang", "Tukang ngarang", 1995);
        System.out.println(perpustakaan.tampilkan());
    }
}