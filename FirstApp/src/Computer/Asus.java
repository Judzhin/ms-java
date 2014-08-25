/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer;

/**
 *
 * @author Judzhin Miles
 */
public class Asus extends Notebook {

    public Asus(String name, Ram ram, CDRom cdrom, Keyboard keyboard, Mouse mouse) {
        super(name, ram, cdrom, keyboard, mouse);
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
