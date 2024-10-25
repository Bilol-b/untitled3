public class Electronics {
   private boolean turi;

    public Electronics(boolean turi) {
        this.turi = turi;
    }

    public boolean isTur() {
        return turi;
    }

    public void setTur(boolean turi) {
        this.turi = turi;
    }
    public void displayInfo(){
        String tur = turi ? "aqillim mashina" : "Ovoz qurilmasi";
        System.out.println("Qurilma turi; " + tur);

    }
}
