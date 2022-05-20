package i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationTest {
    @Test
    void testLocalizationServiceRu() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String result = localizationService.locale(Country.RUSSIA);
        String expected = "Добро пожаловать";

        Assertions.assertEquals(result, expected);
    }

    @Test
    void testLocalizationServiceUsa() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String result = localizationService.locale(Country.USA);
        String expected = "Welcome";

        Assertions.assertEquals(result, expected);
    }
}
