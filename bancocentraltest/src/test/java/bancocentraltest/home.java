package bancocentraltest; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class home {

    public static void main(String[] args) {
        // Configura la ubicación del controlador de Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\antonella.munoz\\Desktop\\PruebaFinalQA\\Software\\chromedriver.exe");

        // Inicializa el navegador Chrome
        WebDriver driver = new ChromeDriver();

        // Abre el sitio del Banco Central
        driver.get("http://www.bcentral.cl");

        // Muestra la cantidad de etiquetas H1 e imprime los textos existentes en ellas
        System.out.println("Cantidad de etiquetas H1: " + driver.findElements(By.tagName("h1")).size());
        for (WebElement h1Element : driver.findElements(By.tagName("h1"))) {
            System.out.println("Texto en etiqueta H1: " + h1Element.getText());
        }

        // Cuenta la cantidad de etiquetas de párrafo (<p>) que existen en el sitio
        System.out.println("Cantidad de etiquetas <p>: " + driver.findElements(By.tagName("p")).size());

        // Validar que el título del sitio sea "Inicio - Banco Central de Chile"
        String tituloEsperado = "Inicio - Banco Central de Chile";
        String tituloReal = driver.getTitle();
        if (tituloReal.equals(tituloEsperado)) {
            System.out.println("Título correcto!!");
        } else {
            System.out.println("Error en el título");
        }

        // Encuentra y muestra el valor de UF, UTM, Dólar observado y Euro
        
        WebElement ufElement = driver.findElement(By.xpath("//*[@id=\"_BcentralIndicadoresViewer_INSTANCE_pLcePZ0Eybi8_myTooltipDelegate\"]/div/div/div[1]/div/div/div[1]/div/p[2]"));
        WebElement utmElement = driver.findElement(By.xpath("//*[@id=\"_BcentralIndicadoresViewer_INSTANCE_pLcePZ0Eybi8_myTooltipDelegate\"]/div/div/div[1]/div/div/div[2]/div/p[2]"));
        WebElement dolarElement = driver.findElement(By.xpath("//*[@id=\"_BcentralIndicadoresViewer_INSTANCE_pLcePZ0Eybi8_myTooltipDelegate\"]/div/div/div[1]/div/div/div[3]/div/p[2]"));
        WebElement euroElement = driver.findElement(By.xpath("//*[@id=\"_BcentralIndicadoresViewer_INSTANCE_pLcePZ0Eybi8_myTooltipDelegate\"]/div/div/div[1]/div/div/div[4]/div/p[2]"));
        

        System.out.println("Valor UF: " + ufElement.getText());
        System.out.println("Valor UTM: " + utmElement.getText());
        System.out.println("Valor Dólar observado: " + dolarElement.getText());
        System.out.println("Valor Euro: " + euroElement.getText());

        // Cierra el navegador
         driver.quit();
    }
}