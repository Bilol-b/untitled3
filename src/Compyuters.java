public class Compyuters extends Electronics{
    private boolean power;


    public Compyuters(boolean turi, boolean power) {
        super(turi);
        this.power = power;
    }


    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
    @Override
    public void displayInfo(){
      super.displayInfo();
        String po = power ?" bateriali ":" bateriyasiz ";
        System.out.println("Quvvat turi; " + po);
    }
}
