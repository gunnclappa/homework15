package guru.qa;

import guru.qa.domain.Car;
import guru.qa.domain.Track;
import guru.qa.service.ConsoleInterface;
import guru.qa.service.GuiInterface;

public class Application {
    private final GuiInterface userGuiInterface;

    public Application(final GuiInterface userGuiInterface) {
        this.userGuiInterface = userGuiInterface;
    }

    void run() {
        Car car = userGuiInterface.choiceCarInGui();
        Track track = userGuiInterface.choiceTrackInGui();
        userGuiInterface.showResult(car, track);
    }

/* Для запуска консольного интерфейса раскомментируйте код и закомментируйте код выше.

    private final ConsoleInterface consoleInterface;

    public Application(final ConsoleInterface consoleInterface) {
        this.consoleInterface = consoleInterface;
    }

    void run() {
        Car car = consoleInterface.choiceCarInConsole();
       Track track = consoleInterface.choiceTrackInConsole();
       consoleInterface.showResult(car, track);
   }
*/
}
