package pasta;

public class Queue extends SQStruct {

    public int pop(){
        if(!content.isEmpty())
        {
            return content.removeFirst();
        }
        return 0;
    }

    @Override
    public void push(int i){
       content.add(i);
    }

    public void back(int i){
        content.getLast();
    }

    public void front(int i){
        content.getFirst();
    }
}