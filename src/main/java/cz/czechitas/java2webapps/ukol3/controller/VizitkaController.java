package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
    private final List<Vizitka> seznamPracovniku = List.of(
            new Vizitka("Kristýna Vojtěchová", "Kostitřas", "Kolodějská 7", "Praha 1O0 00", "vojtechova@kostitras.cz", "467 123 456", "www.kostitras.cz"),
            new Vizitka("Jan Polesnik", "Kostitřas", "Kolodějská 7", "Praha 10O 00", "polesnik@kostitras.cz", "467 123 457", null),
            new Vizitka("Petr Šipka", "Kostitřas", "Kolodějská 7", "Praha 10O 00", "sipka@kostitras.cz", "467 123 458", "www.kostitras.cz"),
            new Vizitka("Lenka Vrubková", "Kostitřas", "Kolodějská 7", "Praha 10O 00", "vrubkova@kostitras.cz", null, "www.kostitras.cz")
    );

    @GetMapping("/")
    public String seznam() {
        return "seznam";
    }

    @GetMapping("/detail")
    public String detail() {
        return "detail";
    }
}
