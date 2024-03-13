package homework0313.init;

import homework0313.model.abcSort;
import homework0313.model.bubbleSort;

import java.util.ArrayList;

public class processPrinter {
    printer print;
    String resultMsg;
    private ArrayList<Integer> printData;
    public void printChoide(String type) {
        printData = new ArrayList<Integer>();
        switch (type) {
            case "A": print = new abcSort(); break;
            case "B": print = new bubbleSort(); break;
            default: print = null; break;
        }
    }

    public void run()
    {
        if(print != null && checkMemory() > 0) {
            print.inputData(printData);
            print.run();
        }
        else
            System.out.println(checkPrintStatus());
    }

    public void show()
    {
        if(print != null && checkMemory() > 0)
            System.out.println("처리결과("+print.name()+") : " +print.result());
        else
            System.out.println(checkPrintStatus());
    }

    public void insertData(int a)
    {
        try {
            printData.add(a);
            resultMsg = "good";
        }
        catch (Exception e)
        {
            resultMsg = e.getMessage();
        }
    }

    public int checkMemory() {
        return this.printData.size();
    }

    public String checkPrintStatus(){
        String resultMessage;
        if(print == null || printData == null)
            resultMessage = "지정된 프린트가 없습니다.";
        else if(printData.size() < 1)
            resultMessage = "입력된 데이터가 없습니다.";
        else
            resultMessage = "Exception Message Check.";
        return resultMessage;
    }
}
