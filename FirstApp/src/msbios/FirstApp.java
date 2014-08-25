package msbios;

import Computer.Asus;
import Computer.CDRom;
import Computer.Grand;
import Computer.Keyboard;
import Computer.Mouse;
import Computer.Ram;

/**
 *
 * @author Judzhin Miles
 */
public class FirstApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Grand grand = new Grand("T-500", new Ram(), new CDRom(), new Keyboard(), new Mouse());
        Asus asus = new Asus("KM65", new Ram(), new CDRom(), new Keyboard(), new Mouse());
    }
}