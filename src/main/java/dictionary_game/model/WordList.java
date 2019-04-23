package dictionary_game.model;

import java.util.HashMap;
import java.util.Map;

public class WordList {

    private Map<String, String> dictionary = new HashMap<>();


    public WordList() {
        addStartDataBase();    //odwolanie do metody!  W KONSTRUKTORZE MUSI BYC STWORZONY OBIEKT, mowiacy nam do czergo sie odnosi (czystosc kodu)
    }

    private void addStartDataBase() {

        dictionary.put("spawanie", "welding");
        dictionary.put("spoina", "weld");
        dictionary.put("spawacz", "welder");
        dictionary.put("operator spawania", "welding operator");
        dictionary.put("spawarka", "welding machine");
        dictionary.put("spawanie ręczne", "hand welding");
        dictionary.put("spawanie częściowo zmechanizowane", "part mechanized welding");
        dictionary.put("spawanie zmechanizowane", "mechanized welding");
        dictionary.put("spawanie automatyczne", "automatic welding");
        dictionary.put("spoina nośna", "strenght weld");
        dictionary.put("metal rodzimy", "parent metal");
        dictionary.put("spoiwo", "filler material");
        dictionary.put("drut spawalniczy", "wire");
        dictionary.put("pręt spawalniczy", "filler rod");
        dictionary.put("topnik", "flux");
        dictionary.put("stopiwo", "deposited metal");
        dictionary.put("ścieg", "pass");
        dictionary.put("strefa spoiny", "weld zone");
        dictionary.put("strefa wpływu ciepła", "heat-affcted zone");
        dictionary.put("strefa wtopienia", "fusion zone");
        dictionary.put("technika spawania", "welding technique");
        dictionary.put("linia wtopienia", "fusion line");
        dictionary.put("technologia spawania", "welding procedure");
        dictionary.put("kolejność spawania", "weld sequence");
        dictionary.put("kolejność układania ściegów", "weld run sequence");
        dictionary.put("zgrzewanie kołków", "stud welding");
        dictionary.put("naświetlenie oczu", "arc eye");
        dictionary.put("uchwyt elektrodowy", "electrode holder");
        dictionary.put("szkło spawalnicze", "welding glass");
        dictionary.put("filtr spawalniczy", "welding filter");
        dictionary.put("spawanie ściegiem krokowym", "back-step welding");
        dictionary.put("spoina ciągła", "continuous weld");
        dictionary.put("spoina przerywana", "intermittent weld");
        dictionary.put("spoina czołowa", "butt weld");
        dictionary.put("spoina pachwinowa", "fillet weld");
        dictionary.put("spoina szczepna", "tack weld");
        dictionary.put("szczep", "tack");
        dictionary.put("spoina otworowa", "plug weld");
        dictionary.put("szczepianie", "tacking");
        dictionary.put("złącze doczołowe", "butt joint");
        dictionary.put("złącze zakładkowe", "lap joint");
        dictionary.put("niezgodność spawalnicza", "imperfection");
        dictionary.put("wyciek", "excessive penetration");
        dictionary.put("wklęśnięcie lica", "incompletely filled");
        dictionary.put("podtopienie", "undercut");
        dictionary.put("nawis", "overlap");
        dictionary.put("poziom oceny", "evaluation level");
        dictionary.put("pęknięcie", "crack");
        dictionary.put("dysza wewnętrzna(sitko)", "noozle");
        dictionary.put("uchwyt spawalniczy", "welding torch");
        dictionary.put("dysza zewnętrzna(porcelanka)", "cup");
        dictionary.put("argon", "argon");
        dictionary.put("hel", "helium");
        dictionary.put("butla z gazem", "gas bottle");
        dictionary.put("reduktor", "reductor");
        dictionary.put("certyfikat spawalniczy", "welding certificate");
        dictionary.put("wąż od gazu", "gas hose");
        dictionary.put("styk", "joint");
        dictionary.put("monter", "fitter");
        dictionary.put("montowanie", "fitting");
        dictionary.put("przecinarka plazmowa", "plasma cutter");
        dictionary.put("rysunek techniczny", "technical drawing");
        dictionary.put("rysunek izometryczny", "isometrical drawing");
        dictionary.put("szczelina", "gap");
        dictionary.put("ultradźwięki", "ultrasonic");
        dictionary.put("łamanie", "fracture");
        dictionary.put("część", "assembly");
        dictionary.put("przyłbica", "welding helmet");
        dictionary.put("końcówka prądowa", "contact tip");
        dictionary.put("elektroda", "electrode");
        dictionary.put("grubość", "thicknes");
        dictionary.put("średnica", "diameter");
        dictionary.put("palnik", "burner");
        dictionary.put("zaporowanie", "porosity");
        dictionary.put("szlaka spawalnicza", "welding slag");
        dictionary.put("odprysk", "spatter");
        dictionary.put("rdza", "rust");
        dictionary.put("blacha", "plate");
        dictionary.put("rura", "pipe");
        dictionary.put("kolanko", "elbow");
        dictionary.put("flansza", "flange");
        dictionary.put("stal nierdzewna", "stainless steel");
        dictionary.put("stal", "steel");
        dictionary.put("aluminium", "aluminium");
        dictionary.put("tytan", "titanium");
        dictionary.put("rękawice spawalnicze", "welding gloves");
        dictionary.put("okulary ochronne", "safety glasses");
        dictionary.put("rękaw", "sleeve");
        dictionary.put("ciepło", "heat");
        dictionary.put("szlifierka", "grinder");
        dictionary.put("szlifowanie", "grinding");
        dictionary.put("suwnica", "crane");
        dictionary.put("zbiornik", "tank");
        dictionary.put("spód", "bottom");
        dictionary.put("klucz", "key");
        dictionary.put("spawanie orbitalne", "orbital welding");
        dictionary.put("młotek", "hammer");
        dictionary.put("profil", "square");
        dictionary.put("kask ochronny", "safety helmet");
        dictionary.put("spawanie podwodne", "underwater welding");
        dictionary.put("hak", "hook");
        dictionary.put("szelki bezpieczeństwa", "safety belts");
        dictionary.put("rusztowanie", "scaffold");
        dictionary.put("elektroda wolframowa", "wolfram electrode");
        dictionary.put("uszczelka", "seal");
        dictionary.put("teflon", "teflon");
        dictionary.put("taśma", "tape");
        dictionary.put("szlifierka prosta", "straight grinder");
        dictionary.put("kamizelka", "vest");
        dictionary.put("wciągnik łańcuchowy", "chain block");
        dictionary.put("tarcza szlifierki", "grinder blade(or disc)");
        dictionary.put("nóż", "knife");
        dictionary.put("czapka spawalnicza", "welding cap");
        dictionary.put("łuk spawalniczy", "arc");
        dictionary.put("drut otulony", "covered wire");
        dictionary.put("miernik tlenu", "oxygen tester");
        dictionary.put("kombinerki", "pliers");
        dictionary.put("wiertarka", "driller");
        dictionary.put("wiertło", "drill");
        dictionary.put("narzędzia budowlane", "construction tools");
        dictionary.put("obcęgi", "pincers");
        dictionary.put("cęgi boczne", "diagonal pliers");
        dictionary.put("nożyce", "scissors");
        dictionary.put("gwóźdź", "nail");
        dictionary.put("przecinak", "chisel");
        dictionary.put("punktak", "punch");
        dictionary.put("wykrawarka", "punching machine");
        dictionary.put("wiertarka udarowa", "hammer drill");
        dictionary.put("młot pneumatyczny", "jackhammer");
        dictionary.put("skrobak", "hand scraper");
        dictionary.put("wózek warsztatowy", "workshop truck");
        dictionary.put("stół warsztatowy", "workbench");
        dictionary.put("pilnik", "file");
        dictionary.put("papier ścierny", "sandpaper");
        dictionary.put("piła", "saw");
        dictionary.put("piła łańcuchowa", "chainsaw");
        dictionary.put("szlifierka kątowa", "angle grinder");
        dictionary.put("frezarka", "milling machine");
        dictionary.put("tokarka", "lathe machine");
        dictionary.put("wkrętak", "screw driver");
        dictionary.put("klucz imbusowy", "hex key");
        dictionary.put("śruba", "bolt");
        dictionary.put("klucz nasadowy", "socket wrench");
        dictionary.put("klucz nastawny", "adjustable spanner");
        dictionary.put("klucz płaski", "wrench");
        dictionary.put("kątownik", "angle");
        dictionary.put("kowadło", "anvil");
        dictionary.put("rozwiertak", "reamer");
        dictionary.put("gilotyna", "guillotine");
        dictionary.put("spawarka światłowodowa", "fusion splicing");
        dictionary.put("spawarka inwentorowa", "inverter welder");
        dictionary.put("imadło", "iron");
        dictionary.put("rysik", "scriber");
        dictionary.put("poziomica", "level");


    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, String> dictionary) {

        this.dictionary = dictionary;
    }

    public void addWordToDictionary(String key, String value) {

        this.dictionary.put(key, value);
    }



    public WordList(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public String getWordFromDict(String key) {

        return dictionary.get(key);

    }
}