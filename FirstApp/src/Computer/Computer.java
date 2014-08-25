/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer;

/**
 *
 * @author Judzhin Miles
 */
abstract class Computer {

    protected String name;
    protected Ram ram;
    protected CDRom cdrom;
    protected Keyboard keyboard;
    protected Mouse mouse;

    /**
     *
     * @param name
     * @param ram
     * @param cdrom
     * @param keyboard
     * @param mouse
     */
    public Computer(String name, Ram ram, CDRom cdrom, Keyboard keyboard, Mouse mouse) {
        this.name = name;
        this.ram = ram;
        this.cdrom = cdrom;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public abstract void on();

    public abstract void off();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public CDRom getCdrom() {
        return cdrom;
    }

    public void setCdrom(CDRom cdrom) {
        this.cdrom = cdrom;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
