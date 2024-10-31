package AnimalsShelterAssignment;

public class ArrayQueue {

    private Animal[] arr;
    private int backOfQueue;
    private int nItems;
    int beginningOfQueue;

    public ArrayQueue(int size) {
        this.arr = new Animal[size];
        this.backOfQueue = -1;
        this.beginningOfQueue = -1;
        this.nItems = 0;
        System.out.println("The queue is successfully created with size of: " + size);
    }

    //isFull
    public boolean isFull(){
        if (nItems == arr.length+1) {
            return true;
        } else  {
            return false;
        }
    }

    //Enqueue
    public void enQueue(Animal animal) {
        if (isFull()) {
            System.out.println("The Queue is Full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            backOfQueue++;
            arr[backOfQueue] = animal;
            nItems++;
            System.out.println("Successfully inserted " + animal.getName() + " in the queue");
        } else {
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = animal;
            System.out.println("Successfully inserted " + animal.getName() + " in the queue");

        }
    }
    //Dequeue
    public String deQueue () {
        if (isEmpty()){
            System.out.println("The Queue is empty");
            return null;
        } else {
            Animal result = arr[beginningOfQueue];
            arr[beginningOfQueue] = null;

            while(arr[beginningOfQueue] == null && beginningOfQueue <=backOfQueue-1) {
                beginningOfQueue++;
            }
            if (beginningOfQueue > backOfQueue) {
                beginningOfQueue = backOfQueue = -1;
            }
            nItems--;
            System.out.println(result.getName() + " has been adopted");
            return result.getName();
        }
    }

    public void dogDeQueue(){
        if (isEmpty()){
            System.out.println("The Queue is empty");

        } else {
            if(arr[beginningOfQueue].getSpecies().equals("Dog")){
                nItems--;
                System.out.println(arr[beginningOfQueue].getName() + " has been adopted");
                arr[beginningOfQueue] = null;
                beginningOfQueue++;

                while(arr[beginningOfQueue] == null && beginningOfQueue <=backOfQueue-1){
                    beginningOfQueue++;
                }

                return;
        }
            else{
                for(int i = beginningOfQueue+1; i != beginningOfQueue; i++){
                    try {
                    if(i == backOfQueue+1){
                        i = 0;
                    }



                        if (arr[i].getSpecies().equals("Dog")) {
                            nItems--;
                            System.out.println(arr[i].getName() + " has been adopted");

                            arr[i] = null;


                            return;
                        }
                    }
                    catch (NullPointerException e){

                    }
                }
            }

            System.out.println("The shelter currently has no dogs");
        }
    }

    public void catDeQueue(){
        if (isEmpty()){
            System.out.println("The Queue is empty");

        } else {
            if(arr[beginningOfQueue].getSpecies().equals("Cat")){
                nItems--;
                System.out.println(arr[beginningOfQueue].getName() + " has been adopted");
                arr[beginningOfQueue] = null;
                beginningOfQueue++;
                while(arr[beginningOfQueue] == null && beginningOfQueue <=backOfQueue-1) {
                    beginningOfQueue++;
                }
                return;
            }
            else{
                for(int i = beginningOfQueue+1; i != beginningOfQueue; i++){
                    try {
                        if(i == backOfQueue+1){
                            i = 0;
                        }



                        if (arr[i].getSpecies().equals("Cat")) {
                            nItems--;
                            System.out.println(arr[i].getName() + " has been adopted");

                            arr[i] = null;
                            return;
                        }
                    }
                    catch (NullPointerException e){

                    }
                }
            }

            System.out.println("The shelter currently has no cats");
        }
    }
    //isEmpty
    public boolean isEmpty(){
        return (nItems == 0);
    }

    //Peek
    public String peek(){
        if (!isEmpty()){
            return arr[beginningOfQueue].getName();
        } else {
            System.out.println("The Queue is empty");
            return null;
        }
    }

    //delete
    public void deleteQueue(){
        arr = null;
        System.out.println("The Queue is successfully deleted");
    }
}
