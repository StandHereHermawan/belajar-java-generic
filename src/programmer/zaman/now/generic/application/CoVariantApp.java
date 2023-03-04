package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class CoVariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Arief");
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData;
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());

        // mydata.setData(1); tidak boleh, berbahaya
        // CoVariant Read-Only, tidak bisa merubah data generic
    }
}
