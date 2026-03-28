public class Main{
    public static void main(){
//        Cat cat=new Cat( );
//        cat.eating();
//        System.out.println(cat.isAlive);

        Cat cat=new Cat();
        Dog dog=new Dog();
        Cow cow = new Cow();
        Orange orange = new Orange();

        cat.talk();
        dog.talk();
        cow.talk();

        System.out.println();
        orange.Photosythesize();


    }
}