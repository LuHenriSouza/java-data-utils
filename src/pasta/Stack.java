package pasta;

import java.util.ArrayList;

public class Stack extends SQStruct {

    @Override
    public void push(int i){

        System.out.println("Element added with sucess!");
    }

    public void pop(){
        content.remove(content.size());
        System.out.println("Deleted the most recent element!");
    }

    public void top(){
        System.out.println("The last element added was " + content.size());
    }



}
