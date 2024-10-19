public class mobil {

    private String merk;
    private String model;
    private int tahun;

    public mobil(String merk, String model, int tahun){
        
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }

    public String tampilkanInfo(){
        return "Mobil: " + merk + " " + model + ", tahun: " + tahun;
    }

    public  String getMerk(String merk){
        return merk;
    }

    public String getModel(String model){
        return model;
    }

    public int getTahun(int tahun){
        return tahun;
    }


    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        mobil myCar = new mobil("Avanza", "MPV", 2023);
        System.out.println(myCar.tampilkanInfo());
    }    
}
