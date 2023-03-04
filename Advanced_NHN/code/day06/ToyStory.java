package NGS.NHN.code.day06;

public class ToyStory {
    
    public static void main(String[] args) {
        Personage personage = new Personage("Everyone");

        CowboyDoll woody = new CowboyDoll("Woody");
        Boy andy = new Boy("Andy");
        Photato Mr_head = new Photato("Mr_Head");
        Solider sergeant = new Solider("Sergent");
        Dog slinky = new Dog("Slinky");
        Baby molly = new Baby("Molly");

        andy.say(molly, "Come on, Molly. Oh, you're getting heavy");
        woody.say(personage, "The birthday party's today? Okay, everybody, coast is clear!");
        Mr_head.say(woody, "Ages three and up. It's on my box. Ages three and up.");
        woody.say(sergeant, "Hi, Sarge, have you seen Slinky?");
        sergeant.say(woody, "Sir! No, sir!");
        woody.say(slinky, "Hey, uh, Slinky?");
        slinky.say(woody, "Right here, Woody. I-I'm red this time");
    }

}

class Personage {
    String name;

    public Personage() {}

    public Personage(String name) {
        this.name = name;
    }

    public void say(String words) {
        System.out.println(words);
    }

    public void say(Personage personage, String words) {
        System.out.print("[" + this.name + "] say to [" + personage.name + "]: ");
        System.out.println(words);
    }
    
}

class CowboyDoll extends Personage  {
    String hat;

    public CowboyDoll(String name) {
        super(name);
    }

}

class Boy extends Personage {

    public Boy(String name) {
        super(name);
    }
}

class Photato extends Personage {

    public Photato(String name) {
        super(name);
    }
}

class Solider extends Personage {

    public Solider(String name) {
        super(name);
    }
}

class Dog extends Personage {

    public Dog(String name) {
        super(name);
    }
}

class Baby extends Personage {

    public Baby(String name) {
        super(name);
    }
}
