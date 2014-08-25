/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer;

/**
 *
 * @author Judzhin Miles
 */
abstract class Notebook extends Computer {

    /**
     * 
     * @param name
     * @param ram
     * @param cdrom
     * @param keyboard
     * @param mouse 
     */
    public Notebook(String name, Ram ram, CDRom cdrom, Keyboard keyboard, Mouse mouse) {
        super(name, ram, cdrom, keyboard, mouse);
    }
}
