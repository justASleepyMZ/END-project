package main;

import java.util.ArrayList;
import java.util.List;

public class RoomService {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public boolean isAvailable(String roomType) {
        // Check availability logic (stubbed for simplicity)
        return true;
    }

    public void changeRoomStatus(String status) {
        notifyObservers("Room status changed to " + status);
    }
}
