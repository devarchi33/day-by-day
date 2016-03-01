package kr.domaindriven.dailybook.record.template.dialect;

import kr.domaindriven.dailybook.record.template.expression.WonExpression;
import org.thymeleaf.context.IProcessingContext;
import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.dialect.IExpressionEnhancingDialect;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *      {@link kr.domaindriven.dailybook.record.Won}의 Object Util을 dialect로 등록.
 * </p>
 *
 * @author Jerry Ahn
 */
public class WonDialect extends AbstractDialect implements IExpressionEnhancingDialect {

    private static final String ExpressionName = "wonDialect";

    public WonDialect() {
        super();
    }

    @Override
    public Map<String, Object> getAdditionalExpressionObjects(IProcessingContext processingContext) {
        Map<String, Object> expressionObjects = new HashMap<String, Object>();
        expressionObjects.put(ExpressionName, new WonExpression());
        return expressionObjects;
    }

    @Override
    public String getPrefix() {
        // No attribute or tag processors, so we don't need a prefix at all and
        // we can return whichever value.
        return "WonDialect";
    }
}