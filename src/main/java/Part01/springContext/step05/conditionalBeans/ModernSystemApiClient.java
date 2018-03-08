package Part01.springContext.step05.conditionalBeans;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional( ActiveModernSystemCondition.class )
public class ModernSystemApiClient implements ApiClient{
    @Override
    public void executeRemoteCall() {
        System.out.println("Making a call to Modern System...");
    }
}
