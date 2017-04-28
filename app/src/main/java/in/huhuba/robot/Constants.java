package in.huhuba.robot;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by juggernaut on 4/25/17.
 */

public class Constants {
    public static final String SERVER_URL = "tcp://10.131.27.28:1883";
    public static final String MQTT_TOPIC = "commands";
    public static final String CLIENT_ID = getClientId();

    private static String getClientId() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }
}
