public class TestConfigRunner {

    public static void main(String[] args) {

        // Instanță folosind constructorul 1 (toți parametrii)
        BrowserConfig config1 = new BrowserConfig(
                BrowserType.FIREFOX,
                "120.0",
                true
        );

        // Instanță folosind constructorul 2 (browser + version)
        BrowserConfig config2 = new BrowserConfig(
                BrowserType.EDGE,
                "118.2"
        );

        // Instanță folosind constructorul 3 (doar browser)
        BrowserConfig config3 = new BrowserConfig(
                BrowserType.CHROME
        );

        // Instanță folosind metoda statică Factory
        BrowserConfig config4 = BrowserConfig.createDefaultChromeConfig();

        // Afișare configurații
        config1.afiseazaConfig();
        config2.afiseazaConfig();
        config3.afiseazaConfig();
        config4.afiseazaConfig();
    }
}