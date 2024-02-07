import org.openqa.selenium.By;

public class InternetShopsLocators {
    // 1a.lv Shop locators
    private By SHOPPING_CART_ICON = By.xpath(".//div[@class='cart-block']");
    private By GIFT_ICON = By.xpath(".//img[@class='smart-net-banner__image'][2]");
    private By PAGE_LANGUAGE_SELECTOR = By.xpath(".//li[@class='site-top__menu-right-item language-switcher");
    private By DELIVERY_POINTS = By.xpath(".//a[@class='site-top__menu-right-link']");
    private By SEARCH_BUTTON = By.xpath(".//div[@class='main-search__submit']");
    private By BUSINESS_OFFER = By.xpath(".//li[@class='site-top__menu-left-item'][6]");
    private By SITE_LOGO = By.xpath(".//a[@class='main-logo']");
    private By BURGER_BUTTON = By.xpath(".//i[@class='main-menu__handle-icon icon-svg']");
    private By SMART_NET_LOGO = By.xpath(".//img[@class='smart-net-banner__logo']");
    // BOOKING.COM locators
    private By BOOKING_COM_LOGO_BTN = By.xpath(".//span[@data-testid='header-logo']");
    private By AIRPORT_TAXIS_BTN = By.xpath(".//a[@id='airport_taxis']");
    private By CURRENCY_PICKER = By.xpath(".//button[@data-testid='header-currency-picker-trigger']");
    private By NOTIFICATIONS = By.xpath(".//span[@class='f419a93f12'][4]");
    private By USER_LEVEL = By.xpath(".//span[@class='abf093bdfe b0e3176faf']");
    private By SEARCH_BTN = By.xpath(".//button[@type='submit']");
    private By GREETING_MESSAGE = By.xpath(".//span[@data-testid='herobanner-title1']");
    private By CALENDAR_FIELD = By.xpath(".//div[@class='a1139161bf']");
    private By TRAVEL_PURPOSE = By.xpath(".//input[@name='sb_travel_purpose']");
    private By RECENT_SEARCH_TITLE = By.xpath(".//span[@class='bui-title__text']");
    // coronavirus notification missing on my side, I found few another items
    private By LEARN_MORE_ABT_UR_REWARDS = By.xpath(".//span[text()=\"Learn more about your rewards\"]");
    private By DISCOVER_HOMES_BANNER = By.xpath(".//div[@data-qmab-component-id='19']");
    // Amazon.de locators
    private By AMAZON_HOME_LOGO = By.xpath(".//div[@id='nav-logo']");
    private By ALL_BURGER_BTN = By.xpath(".//a[@id='nav-hamburger-menu']");
    private By SEARCH_FIELD = By.xpath(".//form[@id='nav-search-bar-form']");
    private By ACCOUNTS_AND_LISTS = By.xpath(".//a[@id='nav-link-accountList']");
    private By SHOPPING_BASKET = By.xpath(".//a[@id='nav-cart']");
    private By NEXT_BANNER_SWITCH = By.xpath(".//i[@class='a-icon a-icon-next-rounded']");
    private By TOP_DEALS_BANNER = By.xpath(".//div[@data-card-metrics-id='deal-of-the-day_desktop-gateway-atf_1']");
    //Google page locators
    private By SEARCH_INPUT_FIELD = By.xpath(".//div[@class='RNNXgb']");
    private By SETTINGS_ICON = By.xpath(".//div[@class='c58wS']");
    private By USER_PROFILE_LOGO = By.xpath(".//div[@class='gb_g gb_bb gb_Zf gb_H']");
    private By ALL_FILTERS_BTN = By.xpath(".//span[@class='bSeRjc']");
    private By ALL_FILTERS_EXPAND_ARROW = By.xpath(".//span[@class='z1asCe K1bG5d']");
    private By ALL_FILTERS_AND_TOOLS_DIVIDING_LINE = By.xpath(".//div[@class='IDFSOe']");
    private By TOOLS_BTN = By.xpath(".//div[@ID='hdtb-tls']");
    private By TOTAL_RESULTS_FOUND = By.xpath(".//div[@id='result-stats']");
    private By MEATBALL_BTN = By.xpath("(.//div[@class='iTPLzd rNSxBe lUn2nc'])[1]");
    private By ABT_GOOGLE_DISCLAIMER = By.xpath(".//div[@class='I6TXqe']");
}
