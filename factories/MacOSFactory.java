package Abstract_Factory;

import Abstract_Factory.buttons.Button;
import Abstract_Factory.buttons.MacOSButton;
import Abstract_Factory.checkboxes.Checkbox;
import Abstract_Factory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}