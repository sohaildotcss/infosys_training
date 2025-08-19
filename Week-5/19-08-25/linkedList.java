public class linkedList {
    //STEP 1: Explain Node as a "Train Car"
    class Node{
        int data;   // What's insied the car (cargo)
        Node next;  // Which car is in FRONT
        Node prev;  // Which car is BEHIND

        Node(int data){
            this.data = data;
            // Initially, no cars in front or behind
        }
    }

    //STEP 2: Explain List as "Whole Train"
    class doubleLinkedList{
        Node head;  //First car of the train
    //STEP 3: Adding a new car to the end
    void addCar(int cargoNumber){
        Node newCar = new Node(cargoNumber);

        if(head = null){
            //First car! Make it the engine
            head = newCar;
            System.out.println("Added first car: " + cargoNumber);
            return;
        }

        Node currentCar = head;
        while(currentCar.next != null){
            currentCar = currentCar.next;
        }

        currentCar.next = newCar;
        newCar.prev = currentCar;
        System.out.println("Added new car: " + cargoNumber);
        }
    }

    }

