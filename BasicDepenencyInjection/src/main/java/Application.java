import my.portfolio.model.Recipe;
import my.portfolio.service.RecipeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        RecipeService service = appContext.getBean("recipeService", RecipeService.class);

        service.findAll().stream().map(Recipe::getName).forEach(System.out::println);
    }
}
