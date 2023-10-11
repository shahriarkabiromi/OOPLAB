class Bird {
     String birdName;

    public Bird() {
        birdName = "Unknown";
    }

    public Bird(String name) {
        birdName = name;
    }

    public void printName() {
        System.out.println(birdName);
    }
}

class Main {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        Bird bird2 = new Bird("Robin");

        bird1.printName();
        bird2.printName();
    }
}
