package Part01.springContext.step05.conditionalBeans;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional( ActiveLocalSystemCondition.class )
public class LegacySystemApiClient implements ApiClient{
    @Override
    public void executeRemoteCall() {
        System.out.println("Making a call to Legacy System...");
    }
}
