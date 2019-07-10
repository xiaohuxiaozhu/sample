
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class HomeController {
    @RequestMapping("/")
    public String indexPage() {
        return "index";
    }


    @RequestMapping("/Home")
    public String homePage() {
        return "Home";
    }


    @RequestMapping("/Blending")
    public String blendingPage() {
        return "Blending";
    }


    @RequestMapping("/FrozenStrawberryGrapeJuice")
    public String frozenStrawberryGrapeJuicePage() {
        return "FrozenStrawberryGrapeJuice";
    }


    @RequestMapping("/FrozenWhiskySour")
    public String frozenWhiskySourPage() {
        return "FrozenWhiskySour";
    }


    @RequestMapping("/MilkShake")
    public String milkShakePage() {
        return "MilkShake";
    }


    @RequestMapping("/TripleBerrySmoothie")
    public String tripleBerrySmoothiePage() {
        return "TripleBerrySmoothie";
    }


    @RequestMapping("/WholeFruitMargarita")
    public String wholeFruitMargaritaPage() {
        return "WholeFruitMargarita";
    }
}

