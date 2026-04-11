public class BrowserConfig {

    private BrowserType browser;
    private String version;
    private boolean isHeadless;

    // Constructor 1: primește toate cele 3 valori
    public BrowserConfig(BrowserType browser, String version, boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }

    // Constructor 2: primește browser + version, headless = false
    public BrowserConfig(BrowserType browser, String version) {
        this(browser, version, false);
    }

    // Constructor 3: primește doar browser, version = "latest", si primeste headless = false din al 2-lea constructor
    public BrowserConfig(BrowserType browser) {
        this(browser, "latest");
    }

    // Metoda statică Factory
    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    // Metoda de afișare
    public void afiseazaConfig() {
        System.out.println(
            "Browser: " + browser +
            ", Version: " + version +
            ", Headless: " + isHeadless
        );
    }
}