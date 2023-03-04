package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.Pair;

public class PairApp {
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<String, Integer>("Arief",85);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

    }
}
