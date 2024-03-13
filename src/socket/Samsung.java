package socket;

import inif.Socket;

public class Samsung implements Socket {

    @Override
    public boolean plugin()    {
        return true;
    }

    @Override
    public boolean unplugin() {
        return false;
    }
}
