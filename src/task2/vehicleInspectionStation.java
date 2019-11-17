package task2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class vehicleInspectionStation {
    public static void main(String[] args) {
        startServiceDay();
    }

    private static void startServiceDay() {
        Scanner scanner = new Scanner(System.in);
        Queue<Vehicle> queue = new LinkedList<>();
        int order = 0;
        String typeVehicle = "";
        String mark = "";
        String model = "";
        String yearbook = "";
        int vehicleMileage = 0;
        String vin = "";
        do {
            printMenu();
            System.out.println("Podaj opcję do wykonania:");
            order = scanner.nextInt();
            scanner.nextLine();
            if(order == 0) {
                System.out.println("Koniec pracy programu!");
            } else if (order == 1) {
                addToQueue(scanner, queue);
            } else if (order == 2) {
                doService(queue);
            } else {
                System.out.println("Nie ma takiej opcji programu " + order + " podaj opcję wybraną z MENU!");
            }
        } while (order!=0);
    }

    private static void doService(Queue<Vehicle> queue) {
        if(queue.peek() != null){
            System.out.println("Wykonuję przegląd dla: " + queue.peek());
            queue.poll();
        } else {
            System.out.println("Nie ma samochodu w kolejce który może przejśc przegląd!");
        }
    }

    private static void addToQueue(Scanner scanner, Queue<Vehicle> queue) {
        String typeVehicle;
        String mark;
        String model;
        String yearbook;
        int vehicleMileage;
        String vin;
        System.out.println("Rozpoczynam dodawanie do kolejki pojazd");
        System.out.println("Podaj typ pojazdu:");
        typeVehicle = scanner.nextLine();
        System.out.println("Podaj markę:");
        mark = scanner.nextLine();
        System.out.println("Podaj model:");
        model = scanner.nextLine();
        System.out.println("Podaj rocznik:");
        yearbook = scanner.nextLine();
        System.out.println("Podaj przebieg:");
        vehicleMileage = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj vin:");
        vin = scanner.nextLine();
        queue.add(new Vehicle(typeVehicle,mark,model,yearbook,vehicleMileage,vin));
        System.out.println("Pojazd dodany do kolejki");
    }

    private static void printMenu() {
        System.out.println("Opcje programu");
        System.out.println(" 0 program kończy działanie");
        System.out.println(" 1 program dodaj nowy pojazd do kolejki");
        System.out.println(" 2 wykonaj przegląd samochodu z kolejki");
    }
}
