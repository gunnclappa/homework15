package guru.qa.service;

import guru.qa.domain.Car;
import guru.qa.domain.Track;
import guru.qa.repo.CarStore;
import guru.qa.repo.TrackStore;

import javax.swing.*;
import java.util.Scanner;

public class ConsoleInterface {

    private CarStore carStore;
    private TrackStore trackStore;
    private Scanner sc = new Scanner(System.in);

    public ConsoleInterface(final CarStore carStore, final TrackStore trackStore) {
        this.carStore = carStore;
        this.trackStore = trackStore;
    }

    public Car choiceCarInConsole() {
        System.out.println("Choose a car:");
        carStore.showCars();
        String desiredCar = sc.next();
        return carStore.lookup(desiredCar);
    }

    public Track choiceTrackInConsole() {
        System.out.println("Choose a track:");
        trackStore.showTracks();
        String desiredTrack = sc.next();
        return trackStore.lookup(desiredTrack);
    }

    public void showResult(final Car car, final Track track) {
        if (car.isPitstopNeeded(track)) {
            System.out.println("Pit-stop needed in " + car.maxLapsForTrack());
        } else {
            System.out.println("Pit-stop not needed");
        }
    }
}
