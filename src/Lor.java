public class Lor extends Doctor{
  public String kasbi;




    public Lor(String name, int age, String mutaxasisligi, String kasbi) {
        super(name, age, mutaxasisligi);
        this.kasbi = kasbi;
    }

    public String getKasbi() {
        return kasbi;
    }


    public void setKasbi(String kasbi) {
        this.kasbi = kasbi;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("kasbining turi; " + kasbi);
    }
}
