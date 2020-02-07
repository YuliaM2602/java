public class Animal {

    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    void jump() {
        System.out.println("Животное перепрыгнуло препятствие");
    }

    void run() {
        System.out.println("Животное бежит");
    }

    void swim() {
        System.out.println("Животное плывет");
    }
}

    class Cat extends Animal{
        String name = "Мурзик";
        void jump (double metr) {
            System.out.println("Кот " + name + " подпрыгнул на " + metr + " м.");
        }
        void run(int metr) {
            System.out.println("Кот " + name + " пробежал " + metr + " м.");
        }

        void swim() {
            System.out.println("Кот не умеет плавать:(");
        }
    }

        class Dog extends Animal{
            String name = "Вуди";
            void jump (double metr) {
                System.out.println("Собака " + name + " подпрыгнула на " + metr + " м.");
            }
            void run(int metr) {
                System.out.println("Собака " + name + " пробежала " + metr + " м.");
            }
            void swim(int metr) {
                System.out.println("Собака " + name + " проплыла " + metr + " м.");
            }
        }

        class AnimalApp{
        public static void main(String[] args) {
            Animal animal = new Animal();
            animal.jump();
            Cat cat = new Cat();
            Dog dog = new Dog();
            cat.jump(2);
            dog.jump(0.5);
            animal.run();
            cat.run(200);
            dog.run(500);
            animal.swim();
            cat.swim();
            dog.swim(10);
        }
    }


