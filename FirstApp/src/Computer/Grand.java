/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer;

/**
 *
 * @author Judzhin Miles
 */
public class Grand extends Computer {

    public Grand(String name, Ram ram, CDRom cdrom, Keyboard keyboard, Mouse mouse) {
        super(name, ram, cdrom, keyboard, mouse);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void on() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void off() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}