package guru.qa;

import guru.qa.repo.CarStore;
import guru.qa.repo.TrackStore;
import guru.qa.service.ConsoleInterface;
import guru.qa.service.GuiInterface;

public class Main {
    public static void main(final String[] args) {
        new Application(new GuiInterface(new CarStore(), new TrackStore())).run();

        /* Для запуска консольного интерфейса раскомментируйте код и закомментируйте код выше.

        new Application(new ConsoleInterface(new CarStore(), new TrackStore())).run();
        */
    }
}
