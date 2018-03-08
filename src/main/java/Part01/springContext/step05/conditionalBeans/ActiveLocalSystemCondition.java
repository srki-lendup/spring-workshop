package Part01.springContext.step05.conditionalBeans;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ActiveLocalSystemCondition implements Condition{
    @Override
    public boolean matches( final ConditionContext context, final AnnotatedTypeMetadata metadata ) {
        Environment env = context.getEnvironment();
        String activeSystem = env.getProperty( "system.active.name" );
        return "Legacy".equals( activeSystem );
    }
}
