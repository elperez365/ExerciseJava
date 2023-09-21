package BibliotecaCopy;

import java.util.ArrayList;
import java.util.HashMap;

public class Scaffale {

    HashMap<String, Ripiano> ripiani = new HashMap<String, Ripiano>();

    Scaffale(int nRipianiPerScaffale, int nLibriPerRipiano) {
        for (int i = 0; i < nRipianiPerScaffale; i++) {
            Ripiano ripiano = new Ripiano(nLibriPerRipiano);
            ripiani.put("ripiano" + (i + 1), ripiano);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (String key : ripiani.keySet()) {
            s = s + key + " " + ripiani.get(key).toString() + "\n";
        }
        return s;
    }
}
