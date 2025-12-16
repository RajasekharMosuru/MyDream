package SolveDSAProblems;

public class EggDropSimulation {

    static final int FLOORS = 100;
    static final int BREAK_FLOOR = 73; // Assume this is unknown in real life

    static boolean dropEgg(int floor) {
        return floor > BREAK_FLOOR;
    }

    public static void main(String[] args) {
        int drops = 0;
        int step = 14;
        int currentFloor = 0;
        int previousFloor = 0;

        // First egg strategy
        while (currentFloor < FLOORS) {
            previousFloor = currentFloor;
            currentFloor += step;
            drops++;

            System.out.println("Drop egg 1 from floor " + currentFloor);

            if (dropEgg(currentFloor)) {
                System.out.println("Egg broke!");
                break;
            }
            step--;
        }

        // Second egg linear search
        for (int i = previousFloor + 1; i < currentFloor; i++) {
            drops++;
            System.out.println("Drop egg 2 from floor " + i);

            if (dropEgg(i)) {
                System.out.println("Egg broke at floor " + i);
                break;
            }
        }

        System.out.println("Total drops used: " + drops);
        System.out.println("Highest safe floor: " + (currentFloor - 1));
    }
}
