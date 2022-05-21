package factories;

import buttons.Button;
import buttons.WindowsButton;
import buttons.LinuxButton;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;
import checkboxes.LinuxCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}