public class AngryBirds {

    public static void main(String[] args){
//Array para los nuevos pajaros
        Bird[] birds = new Bird[]{new RedBird(), new YellowBird(), new BlueBird()};

        System.out.printf("%s",Bird.Ataque(birds, 0));
        System.out.printf("%s",Bird.Ataque(birds, 1));
        System.out.printf("%s",Bird.Ataque(birds, 2));
    }
}
