package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller()
@RequestMapping("/")
public class VizitkaController {
    private final List<Vizitka> seznamPracovniku = List.of(
            new Vizitka("Kristýna Vojtěchová", "Kostitřas", "Kolodějská 7", "Praha 100 00", "vojtechova@kostitras.cz", "467 123 456", "www.kostitras.cz"),
            new Vizitka("Jan Polesnik", "Kostitřas", "Meluzínova 13", "Brno 615 00", "polesnik@kostitras.cz", "467 123 457", null),
            new Vizitka("Petr Šipka", "Kostitřas", "Kolodějská 7", "Praha 100 00", "sipka@kostitras.cz", "467 123 458", "www.kostitras.cz"),
            new Vizitka("Lenka Vrubková", "Kostitřas", "Mládí 3", "Ostrava 709 00", "vrubkova@kostitras.cz", null, "www.kostitras.cz")
    );

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("/seznam");
        modelAndView.addObject("seznamPracovniku", seznamPracovniku);
        return modelAndView;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("/detail");
        modelAndView.addObject("vizitka", seznamPracovniku.get(id));
        return modelAndView;
    }
}
