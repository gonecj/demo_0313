package SOLID.OCP.test;

public class HOME {
    public void run2()
    {
        controlSocket cc = new controlSocket();
        cc.choiceSocket("A");
        cc.choicePush();
    }
    public void run1()
    {
        Asocket asocket= new Asocket();
        asocket.push();

        Bsocket bsocket= new Bsocket();
        asocket.push();
    }
}
