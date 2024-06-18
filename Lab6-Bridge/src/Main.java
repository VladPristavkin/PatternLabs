import Abstractions.Light;
import Abstractions.LightImplementation;
import Lights.FluorescentLight;
import Lights.LedLight;
import Lights.OsramLightImplementation;
import Lights.PhilipsLightImplementation;

public class Main {
    public static void main(String[] args) {
        LightImplementation philipsLightImpl = new PhilipsLightImplementation();
        LightImplementation osramLightImpl = new OsramLightImplementation();

        Light ledLight = new LedLight(philipsLightImpl);
        ledLight.turnOn();
        ledLight.dim();
        ledLight.turnOff();

        Light fluorescentLight = new FluorescentLight(osramLightImpl);
        fluorescentLight.turnOn();
        fluorescentLight.dim();
        fluorescentLight.turnOff();
    }
}
