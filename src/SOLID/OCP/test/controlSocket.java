package SOLID.OCP.test;

public class controlSocket {
    private socket targetSocket;
    public void choiceSocket(String type) {
        if ("A".equals(type)) {
            targetSocket = new Asocket();
        } else if ("B".equals(type)) {
            targetSocket = new Bsocket();
        } else {
            targetSocket = null;
        }
    }
    public void choicePush()
    {
        this.targetSocket.socketPush();
    }
}
