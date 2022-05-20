package geo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceTest {
    @Test
    public void testGeoServiceRus() {
        GeoService geoService = new GeoServiceImpl();
        Location result = geoService.byIp("172.");
        Location expected = new Location("Moscow", Country.RUSSIA, null, 0);

        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testGeoServiceUsa() {
        GeoService geoService = new GeoServiceImpl();
        Location result = geoService.byIp("96.44.183.149");
        Location expected = new Location("New York", Country.USA, " 10th Avenue", 32);

        Assertions.assertEquals(result, expected);

    }
}
