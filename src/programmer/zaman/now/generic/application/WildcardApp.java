package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {

        print(new MyData<Integer>(100));
        print(new MyData<String>("Arief"));
        print(new MyData<MultipleConstraintApp.Manajer>(new MultipleConstraintApp.Manajer()));
    }

    public static void print(MyData<?>myData){
        System.out.println(myData.getData());
    }
}