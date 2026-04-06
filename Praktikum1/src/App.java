class AyamGoreng {

    private String ayam;
    private int tepung;
    private int minyak;

    public void setAyam(String ayam) {
        this.ayam = ayam;
    }

    public String getAyam() {
        return ayam;
    }

    public void setTepung(int tepung) {
        this.tepung = tepung;
    }

    public int getTepung() {
        return tepung;
    }

    public void setMinyak(int minyakBaru) {
        if (minyakBaru >= 6) {
            this.minyak = minyakBaru;
        } else {
            System.out.println("Error: Jumlah minyak tidak boleh negatif!");
        }
    }

    public int getMinyak() {
        return minyak;
    }
}

public class App {
    public static void main(String[] args) {

        AyamGoreng pesananSatu = new AyamGoreng();
        pesananSatu.setAyam("Paha Bawah");
        pesananSatu.setTepung(2);
        pesananSatu.setMinyak(500);

        AyamGoreng pesananDua = new AyamGoreng();
        pesananDua.setAyam("Dada");
        pesananDua.setTepung(3);
        pesananDua.setMinyak(100);

        System.out.println("--- Pesanan 1 ---");
        System.out.println("Bagian Ayam: " + pesananSatu.getAyam());
        System.out.println("Jumlah Tepung: " + pesananSatu.getTepung() + " gram");
        System.out.println("Jumlah Minyak: " + pesananSatu.getMinyak() + " ml");

        System.out.println();

        System.out.println("--- Pesanan 2 ---");
        System.out.println("Bagian Ayam: " + pesananDua.getAyam());
        System.out.println("Jumlah Tepung: " + pesananDua.getTepung() + " gram");
        System.out.println("Jumlah Minyak: " + pesananDua.getMinyak() + " ml");
    }
}