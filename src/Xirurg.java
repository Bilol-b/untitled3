
    public class Xirurg extends Doctor {
        private String jarroxlikTuri;

        public Xirurg(String name, int age, String mutaxasisligi, String jarroxlikTuri) {
            super(name, age, mutaxasisligi);
            this.jarroxlikTuri = jarroxlikTuri;
        }


        public String getSurgeryType() {
            return jarroxlikTuri;
        }

        public void setSurgeryType(String jarroxlikTuri) {
            this.jarroxlikTuri = jarroxlikTuri;
        }

        public void displayInfo() {
            super.displayInfo();
            System.out.println("Jarroxlik turi: " + jarroxlikTuri);
        }
    }



