package DarrenYau;

public class Kennel {
    private Pet[] kennel = new Pet[3];

    public Kennel(){
        kennel[0] = new Cat("Cat Californian");
        kennel[1] = new Dog("Dog Dude");
        kennel[2] = new LoudDog("German Shepherd");
    }

    public void allSpeak(){
        for (int i = 0; i < kennel.length; i++) {
            System.out.println(kennel[i].getName() + ": " + kennel[i].speak() + "'");
        }
    }
}
