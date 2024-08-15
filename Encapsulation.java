class person{
    private String name;
    private int age;
 
     public void getInfo(){

        System.err.println("Name"+this.name+"age"+this.age);
    
     }
     public void  setInfo(String name, int age){
          this.name=name;
          this.age=age;
        }
}

public class Encapsulation {


  public static void main(String[] args) {
    person p=new person();
    p.setInfo("  avantika ",21);
    p.getInfo();
  }

 

 

}
