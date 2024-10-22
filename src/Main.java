//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
      Xirurg xirurg = new Xirurg("Dr Sardor",21,"Xirurg","Yursk jsrroxi");
      Lor lor = new Lor("Dr Xumoyun",18,"Lor","Quloq burun shifokori");

      xirurg.displayInfo();
      lor.displayInfo();




      PC pc = new PC(true,false," Stol kompyuteri");
      Laptop laptop = new Laptop(true,true,"Laptop");
      Subwoofer subwoofer = new Subwoofer(false,"Musiqa qurilmasi ","Bas berish uchun");
      Loudspeaker loudspeaker = new Loudspeaker(false,"Musiqa qurilmasi "," musiqa chiqarish uchun");

      pc.displayInfo();
      laptop.displayInfo();
      subwoofer.displayInfo();
      loudspeaker.displayInfo();
    }
}