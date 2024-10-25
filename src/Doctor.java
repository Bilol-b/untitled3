public class Doctor {
        private String name;
        private int age;
        private String mutaxasisligi;

        public Doctor(String name, int age, String mutaxasisligi) {
            this.name = name;
            this.age = age;
            this.mutaxasisligi = mutaxasisligi;
        }

        public String getName() {
            return name;
        }



        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getMutaxasisligi() {
            return mutaxasisligi;
        }

        public void setMutaxasisligi(String mutaxasisligi) {
            this.mutaxasisligi = mutaxasisligi;
        }

        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age + ", Mutaxasisligi : " + mutaxasisligi);
        }


}
