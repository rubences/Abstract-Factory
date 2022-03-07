package Abstract_Factory.factories;

import Abstract_Factory.buttons.Button;
import Abstract_Factory.buttons.WindowsButton;
import Abstract_Factory.buttons.LinuxButton;
import Abstract_Factory.checkboxes.Checkbox;
import Abstract_Factory.checkboxes.WindowsCheckbox;
import Abstract_Factory.checkboxes.LinuxCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}