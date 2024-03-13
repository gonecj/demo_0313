package socket;

import inif.Socket;

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
