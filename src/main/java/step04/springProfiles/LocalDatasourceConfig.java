package step04.springProfiles;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile( "local" )
public class LocalDatasourceConfig implements  DatasourceConfig{

    @Override
    public void setup() {
        System.out.println("Setting up datasource for Local environment");
    }
}
