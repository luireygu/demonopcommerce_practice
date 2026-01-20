package asserts;

import pages.pages.PageComputers;
import static org.junit.jupiter.api.Assertions.*;
import utils.data.ProductsComputers;

public class assertsPageComputers {
    private  final PageComputers computers;

    public assertsPageComputers(){
        this.computers = new PageComputers();
    }

    public void assertSoftwareProducts(){
        assertEquals(ProductsComputers.productosEsperados , computers.elementsSoftwareProducts() ,"Los productos de Software no coinciden");

    }
}
