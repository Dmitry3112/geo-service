package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {
    LocalizationService localizationService = new LocalizationServiceImpl();

    @Test
    void RussiaLocaleTest() {
        Assertions.assertEquals(localizationService.locale(Country.RUSSIA), "Добро пожаловать");
    }

    @Test
    void OtherLocaleTest() {
        Assertions.assertEquals(localizationService.locale(Country.USA), "Welcome");
    }
}
