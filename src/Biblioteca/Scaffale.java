package Biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class Scaffale {

    HashMap<String, Ripiano> ripiani = new HashMap<String, Ripiano>();

    @Override
    public String toString() {
        String s = "";
        for (String key : ripiani.keySet()) {
            s = s + key + " " + ripiani.get(key).toString() + "\n";
        }
        return s;
    }
}
