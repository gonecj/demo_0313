package homework.model;

import homework.init.printer;

import java.util.ArrayList;

public class abcSort implements printer{
    @Override
    public String name()
    {
        return "abcSort";
    }
    private ArrayList<Integer> lst;
    @Override
    public void run()
    {
        for(int i = 0 ; i < lst.size(); i++) {
            for(int j = i + 1 ; j < lst.size(); j ++) {
                if(lst.get(i) > lst.get(j)){
                    int tmp = lst.get(i);
                    lst.set(i, lst.get(j));
                    lst.set(j, tmp);
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
