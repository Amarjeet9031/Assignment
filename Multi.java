package Assign2;
class Animal{
void Makesound(){
    System.out.println("this animal makes sound");
}
}
class cat extends Animal{
  void Makesound(){
    System.out.println("this cat makes mews ");
  }
}
class dog extends Animal{
void Makesound(){
    System.out.println(" thd dog marks bhark");
}
}
public class Multi {
    public static void main(String[] args) {
        dog dd=new dog();
        dd.Makesound();
        cat cc=new cat();
        cc.Makesound();
        Animal animal=new Animal();
        animal.Makesound();
    }
}
