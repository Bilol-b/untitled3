public class PC extends Compyuters {
    public String pc;

    public PC(boolean turi, boolean power, String pc) {
        super(turi, power);
        this.pc = pc;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(pc);

    }
}
