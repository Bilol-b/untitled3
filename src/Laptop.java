public class Laptop extends Compyuters {
  public String laptop;

    public Laptop(boolean turi,boolean power,String laptop) {
        super(turi,power);
        this.laptop = laptop;
    }

    public String getLaptop() {
        return laptop;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(laptop);


    }
}
