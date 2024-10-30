public class Main {
    public static void main(String[] args) {

// Polymorphism = The ability of an object to identify as more than one type
//        Greek word for poly (MANY) and morph (FORM)

        Pokeball pokeball = new Pokeball();
        Potion potion = new Potion();
        Antidote antidote = new Antidote();

        // Using :
        //     pokeball[]shop = {pokeball, potion, antidote won't work}
        //     potion[]shop = {pokeball, potion, antidote won't work}
        //     antidote[]shop = {pokeball, potion, antidote won't work}

        // What works = using the class of the subclasses as the name of the array

        Item[]shop = {pokeball, potion, antidote};

        // loops each item in shop
        // executes description method in shop
        for(Item x : shop) {
            x.description();
    }

    }
}
