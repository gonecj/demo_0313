package step1.socket;

import step1.inif.Socket;

public class Lg implements Socket {
    @Override
    public boolean plugin() {
        return true;
    }

    @Override
    public boolean unplugin() {
        return false;
    }
}
