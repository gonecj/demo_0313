package homework.model;

import homework.init.printer;

import java.util.ArrayList;

public class bubbleSort implements printer {
    @Override
    public String name()
    {
        return "bubbleSort";
    }
    private ArrayList<Integer> lst;
    @Override
    public void run()
    {
        for(int cycle = 0 ;cycle < lst.size(); cycle ++) {
            for(int i = 0 ; i < lst.size() - 1 - cycle; i ++) {
                if(lst.get(i) > lst.get(i + 1)){
                    //swap
                    int tmp = lst.get(i);
                    lst.set(i, lst.get(i + 1));
                    lst.set(i + 1, tmp);
                }
            }
        }

    }

    @Override
    public String result()
    {
        return lst.toString();
    }

    @Override
    public void inputData(ArrayList<Integer> printData)
    {
        lst = printData;
    }
}
