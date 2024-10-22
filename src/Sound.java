public class Sound extends Electronics{
    private String funksiyasi;

    public Sound(boolean turi, String funksiyasi) {
        super(turi);
        this.funksiyasi = funksiyasi;
    }

    public String getFunksiyasi() {
        return funksiyasi;
    }

    public void setFunksiyasi(String funksiyasi) {
        this.funksiyasi = funksiyasi;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Funksiyasi; " + funksiyasi);

    }
}
