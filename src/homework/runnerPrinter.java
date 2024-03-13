package homework;

import homework.init.processPrinter;

public class runnerPrinter {
    public void main() {
        processPrinter dd = new processPrinter();
        dd.printChoide("C");
        dd.run();
        dd.show();

        dd.printChoide("B");
        dd.run();
        dd.insertData(1);
        dd.insertData(2);
        dd.insertData(3);
        dd.insertData(4);
        dd.insertData(5);
        dd.run();
        dd.show();

        dd.printChoide("B");
        dd.run();
        dd.insertData(5);
        dd.insertData(2);
        dd.insertData(1);
        dd.insertData(3);
        dd.insertData(6);
        dd.run();
        dd.show();

        dd.printChoide("A");
        dd.run();
        dd.insertData(5);
        dd.insertData(2);
        dd.insertData(1);
        dd.insertData(3);
        dd.insertData(6);
        dd.run();
        dd.show();
    }
}
