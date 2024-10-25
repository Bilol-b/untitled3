public class Subwoofer extends Sound {
   public String subwoofer;

    public Subwoofer(boolean turi, String funksiyasi, String subwoofer) {
        super(turi, funksiyasi);
        this.subwoofer = subwoofer;
    }
    public String getSubwoofer(){
        return subwoofer;
    }
    public void setSubwoofer(String subwoofer){
        this.subwoofer = subwoofer;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(subwoofer);


    }
}
