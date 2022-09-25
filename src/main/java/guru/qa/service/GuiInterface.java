package guru.qa.service;

import guru.qa.domain.Car;
import guru.qa.domain.Track;
import guru.qa.repo.CarStore;
import guru.qa.repo.TrackStore;

import javax.swing.*;

public class GuiInterface {

    private CarStore carStore;
    private TrackStore trackStore;

    public GuiInterface(final CarStore carStore, final TrackStore trackStore) {
        this.carStore = carStore;
        this.trackStore = trackStore;
    }

    public Car choiceCarInGui() {
        String[] choices = carStore.cars();

        String desiredCar = (String) JOptionPane.showInputDialog(null, "Choose a car...",
                "Car:", JOptionPane.QUESTION_MESSAGE, null, // Use
                // default
                // icon
                choices, // Array of choices
                ""); // Initial choice
        return carStore.lookup(desiredCar);
    }

    public Track choiceTrackInGui() {
        String[] choices = trackStore.tracks();

        String desiredTrack = (String) JOptionPane.showInputDialog(null, "Choose a track...",
                "Track:", JOptionPane.QUESTION_MESSAGE, null, // Use
                // default
                // icon
                choices, // Array of choices
                ""); // Initial choice
        return trackStore.lookup(desiredTrack);
    }

    public void showResult(final Car car, final Track track) {
        if (car.isPitstopNeeded(track)) {
            JOptionPane.showMessageDialog(
                    null,
                    "Pit-stop needed in " + car.maxLapsForTrack(),
                    "Результат:",
                    1);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Pit-stop not needed",
                    "Результат:",
                    1);
        }
    }
}
