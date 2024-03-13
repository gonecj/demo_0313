package step2.old;

interface TV {
    public void work(boolean tunStatus);
}

class SmartTV implements TV{
    @Override
    public void work(boolean tunStatus) {
        if(tunStatus)
            System.out.println("원격 조정...");
        else
            System.out.println("원격 조정 종료...");
    }
}
class localTV implements TV {
    @Override
    public void work(boolean tunStatus) {
        if(tunStatus)
            System.out.println("로컬 조정...");
        else
            System.out.println("로컬 조정 종료...");
    }
}
class modelTV {
    TV head ;
    modelTV(TV head) { // 의존성 주입 (생성자 주입)
        this.head = head;
    }
    public void connect(){
        head.work(true);
    }
    public void disconnect(){
        head.work(false);
    }
}

public class oldmain {
    public static void main(String[] args) {
        localTV ptv = new localTV();
        modelTV tv = new modelTV(ptv);
        tv.connect();
        tv.disconnect();
    }
}
