import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class N11MainPage {

    private WebDriver driver;
    private final By SearchFeild = By.id("searchData");
    private final By SearchButton = By.className("searchBtn");
    private final By SecondPageButton = By.xpath("//*[@id=\"contentListing\"]/div/div/div[2]/div[5]/a[2]");
    private final By SecondPageButtonActive = By.xpath("//*[@id=\"contentListing\"]/div/div/div[2]/div[5]/a[3]");
    private final By AnyItem = By.className("productName");
    private final By AddBasketButton = By.className("btn btnGrey addBasketUnify");
    private final By BasketButton = By.className("icon iconBasket");
    private final By AddMoreButton = By.className("spinnerUp spinnerArrow");
    private final By NumberOfProduct = By.xpath("//*[@id=\"quantity_127051369245\"]");
    private final By DeleteItemButton = By.className("removeProd svgIcon svgIcon_trash");
    private final By EmptyBasketText = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div[1]/div[1]/h2");

    public N11MainPage(WebDriver driver){
        this.driver = driver;
    }

    public void search(String name){
        WebElement searchField = driver.findElement(SearchFeild);
        WebElement searchButton = driver.findElement(SearchButton);

        searchField.click();
        searchField.sendKeys(name);
        searchButton.click();

    }

    public void openSecondPage(){
        WebElement secondPageButton = driver.findElement(SecondPageButton);

        secondPageButton.click();
    }


    public String checkOnSecondPage(){
        WebElement secondPageButton = driver.findElement(SecondPageButtonActive);

        return secondPageButton.getAttribute("class");
    }

    public void chooseAnyItem(){
        WebElement anyItem = driver.findElement(AnyItem);

        anyItem.click();
    }

    public void addBasket(){
        WebElement addBasketButton = driver.findElement(AddBasketButton);

        addBasketButton.click();
    }

    public void oneMoreOnBasket(){
        WebElement basketButton = driver.findElement(BasketButton);
        basketButton.click();

        WebElement addMoreButton = driver.findElement(AddMoreButton);
        addMoreButton.click();
    }

    public String checkNumberOfProduct(){
        WebElement numberOfProduct = driver.findElement(NumberOfProduct);

        return numberOfProduct.getAttribute("value");
    }

    public void deleteItem(){
        WebElement deleteItem = driver.findElement(DeleteItemButton);

        deleteItem.click();
    }

    public String checkEmptyBasket(){
        WebElement emptyBasketText = driver.findElement(EmptyBasketText);

        return emptyBasketText.getAttribute("title");
    }
}
