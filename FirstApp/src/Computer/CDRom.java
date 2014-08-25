/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Computer;

/**
 *
 * @author Judzhin Miles
 */
public class CDRom {

    private String name;
    private double speed;
    private boolean writeble;

    public void open() {
    }

    public void close() {
    }

    public void read() {
        
    }

    //<editor-fold defaultstate="collapsed" desc="Getter && Setter">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isWriteble() {
        return writeble;
    }

    public void setWriteble(boolean writeble) {
        this.writeble = writeble;
    }
    //</editor-fold>
}
