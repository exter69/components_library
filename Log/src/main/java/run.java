import service.Log;

import java.io.IOException;

public class run {
    public static void main(String[] args) throws IOException {

        Log log = new Log(12, 32);
        log.log(new Log(4561515, 45));
    }
}
