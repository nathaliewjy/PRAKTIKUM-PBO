
public abstract class Hewan {

    String name;
    int age;
    String food;
    Gender gender;
    isAlive alive;

    public String printSound() {
        return "?";
    }

    public boolean isAlive() {
        return this.alive == alive.ALIVE;
    }

    public String move() {
        return "?";
    }

    public String printData() {
        return "name" + age + "food" + gender + alive;
    }

    public static class Kucing extends Hewan {

        @Override
        public String printSound() {
            return "Meow";
        }

        @Override
        public String move() {
            return "Jalan";
        }

        public String move(int jarak) {
            return "The cat name " + name + " walks for " + jarak + " meter.";
        }

        @Override
        public String printData() {
            return "Cat" + super.printData();
        }
    }

    public static class Anjing extends Hewan {

        @Override
        public String printSound() {
            return "Guk";
        }

        @Override
        public String move() {
            return "Jalan";
        }

        public String move(int jarak) {
            return "The dog name " + name + " walks for " + jarak + " meter.";
        }

        @Override
        public String printData() {
            return "Dog" + super.printData();
        }
    }

    public static class Bebek extends Hewan {

        @Override
        public String printSound() {
            return "Kwek";
        }

        @Override
        public String move() {
            return "Renang";
        }

        public String move(int jarak) {
            return "The duck name " + name + " swims for " + jarak + " meter.";
        }

        @Override
        public String printData() {
            return "Duck" + super.printData();
        }
    }

    public static class Kuda extends Hewan {

        @Override
        public String printSound() {
            return "Yiha";
        }

        @Override
        public String move() {
            return "Lari";
        }

        public String move(int jarak) {
            return "The horse name " + name + " runs for " + jarak + " meter.";
        }

        @Override
        public String printData() {
            return "Horse" + super.printData();
        }
    }

    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        Anjing anjing = new Anjing();
        Bebek bebek = new Bebek();
        Kuda kuda = new Kuda();

        kucing.name = "Bocil";
        kucing.age = 4;
        kucing.food = "Meo";
        kucing.gender = Gender.MALE;
        kucing.alive = isAlive.ALIVE;
        System.out.println(kucing.printSound());
        System.out.println(kucing.move());
        System.out.println(kucing.move(7));
        System.out.println(kucing.printData());

        anjing.name = "Bub";
        anjing.age = 12;
        anjing.food = "Dog food";
        anjing.gender = Gender.MALE;
        anjing.alive = isAlive.DEAD;
        System.out.println(anjing.printSound());
        System.out.println(anjing.move());
        System.out.println(anjing.move(7));
        System.out.println(anjing.printData());

        bebek.name = "Bek";
        bebek.age = 2;
        bebek.food = "Beras";
        bebek.gender = Gender.FEMALE;
        bebek.alive = isAlive.ALIVE;
        System.out.println(bebek.printSound());
        System.out.println(bebek.move());
        System.out.println(bebek.move(7));
        System.out.println(bebek.printData());

        kuda.name = "Da";
        kuda.age = 10;
        kuda.food = "Rumput";
        kuda.gender = Gender.FEMALE;
        kuda.alive = isAlive.DEAD;
        System.out.println(kuda.printSound());
        System.out.println(kuda.move());
        System.out.println(kuda.move(7));
        System.out.println(kuda.printData());
    }
}

enum Gender {
    MALE, FEMALE
}

enum isAlive {
    DEAD, ALIVE
}
