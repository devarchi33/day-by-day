package kr.domaindriven.dailybook.record.template.expression;

import kr.domaindriven.dailybook.record.Won;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by jerry on 2016-03-01.
 */
public final class WonExpression {
    /**
     * <p> [Simbol출력] + [amount 3자리마다 콤마 추가] 총 두가지 String을 합하여 출력</p>
     * @return
     */
    public String getWon(Won won){
        BigDecimal amount = won.getAmount();
        DecimalFormat formatter = (DecimalFormat) NumberFormat.getInstance(Locale.KOREA);
        String result = won.getSymbol()+formatter.format(amount.longValue());
        return result;
    }
}
