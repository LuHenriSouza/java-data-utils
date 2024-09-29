package pasta;

import java.util.ArrayList;

abstract class SQStruct {

    protected ArrayList<Integer> content;

    public boolean empty(){
        return content.isEmpty();
    }

    public int size(){
        return content.size();
    }

    public void push(int i){}

    public void pop(){}
}
