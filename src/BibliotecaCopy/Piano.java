package BibliotecaCopy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Piano {
    HashMap<String, Scaffale> scaffali = new HashMap<String, Scaffale>();

    Piano(int nScaffaliPerPiano, int nRipianiPerScaffale, int nLibriPerRipiano) {
        for (int i = 0; i < nScaffaliPerPiano; i++) {
            Scaffale scaffale = new Scaffale(nRipianiPerScaffale, nLibriPerRipiano);
            scaffali.put("SC" + (i + 1), scaffale);
        }
    }
}
