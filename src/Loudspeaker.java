public class Loudspeaker  extends Sound{
   public String loudspeaker;

   public Loudspeaker(boolean turi,String funkdiyasi,String loudspeaker){
       super(turi,funkdiyasi);
       this.loudspeaker = loudspeaker;
   }
   public String getLoudspeaker(){
       return loudspeaker;
   }
   public void setLoudspeaker(String loudspeaker){
       this.loudspeaker = loudspeaker;
   }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(loudspeaker);

    }
}
