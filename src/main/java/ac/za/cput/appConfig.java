package ac.za.cput;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class appConfig {

    @Bean(name = "col")
    public collection_Interface getService(){
        return  new collection_class();
    }
}
