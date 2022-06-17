import java.util.Scanner;

public class ElevatorApp {
    static void showFloor(int currentFloor, int targetFloor) {
        String floor = (targetFloor == currentFloor) ? ("Elevator stop at floor: " + currentFloor)
                : ("Elevator at floor: " + currentFloor);
        System.out.println(floor);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("press -1 to terminate the application");
        int targetFloor = 1;
        int currentFloor = 1;
        while (targetFloor >= 0) {
            System.out.println("Go to Floor: ");
            targetFloor = input.nextInt();
            if (targetFloor < 0 || targetFloor>30) {
                System.out.println("Oops! the floor is not found");
                System.out.println("(application is terminate)");
                break;
            } else {
                System.out.println("Elevator at floor: " + currentFloor);
            }
            while (targetFloor > currentFloor) {
                currentFloor++;
                showFloor(currentFloor, targetFloor);
            }
            while (targetFloor < currentFloor) {
                currentFloor--;
                showFloor(currentFloor, targetFloor);
            }
        }
    }
}
