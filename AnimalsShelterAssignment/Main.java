package AnimalsShelterAssignment;



import java.util.Scanner;
public class Main {

    static ArrayQueue animalList = new ArrayQueue(5);

    public static void adoptAnyAnimal(){
        animalList.deQueue();
    }

    public static void main(String[] args) {
        animalList.enQueue(new Animal("Kevin", 1, "Cat", "Siamese Cat"));
        animalList.enQueue(new Animal("Thunder", 2, "Dog", "German Shepherd"));
        animalList.enQueue(new Animal("Zara", 1, "Cat", "Ragdoll Cat"));
        animalList.enQueue(new Animal("Rex", 3, "Dog", "Bagel"));
        animalList.enQueue(new Animal("Lucy", 6, "Dog", "Yorkie"));



        Scanner input = new Scanner(System.in);
        boolean quite = false;
        String option = "";

        while(quite == false){
            System.out.println("Enter the option you wish to use");
            System.out.println("1.Adopt a dog\n2.Adopt a cat\n3.Adopt any species");

            option = input.next();

            switch(option)
            {

                case "1":
                    animalList.dogDeQueue();
                    break;

                case "2":
                    animalList.catDeQueue();
                    break;

                case "3":
                    adoptAnyAnimal();
                    break;

                case "4":
                    System.out.println("Thanks for using this program");
                    quite = true;
                    break;

                default:
                    System.out.println("Invalid input- please re-enter");
            }
        }
    }
}
