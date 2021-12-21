import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class FirstStep extends BaseTest{

    @Test
    @Order(1)
    public void search (){
        mainPage.search("Bilgisayar");
    }

    @Test
    @Order(2)
    public void openSecondPage(){
        mainPage.openSecondPage();
        Assertions.assertEquals("active ", mainPage.checkOnSecondPage(), "You are not on Second Page!");
    }

    @Test
    @Order(3)
    public void chooseAnyItem(){
        mainPage.chooseAnyItem();
    }

    @Test
    @Order(4)
    public void addBasket(){
        mainPage.addBasket();
    }

    @Test
    @Order(5)
    public void oneMoreOnBasket(){
        mainPage.oneMoreOnBasket();
        Assertions.assertEquals("2", mainPage.checkNumberOfProduct(), "You could not add second product!");
    }

    @Test
    @Order(6)
    public void deleteItem(){
        mainPage.deleteItem();
    }

    @Test
    @Order(7)
    public void checkEmptyBasket(){
        Assertions.assertEquals("Sepetiniz Boş", mainPage.checkNumberOfProduct(), "You could not delete all product!");
    }
}
