package com.Bacchus.webbase.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


/**
 * 半角英数字記号のみ許可バリデーションロジック。
 *
 * @author kamimura_k
 *
 */
public class AlphaNumSymbolValidator implements ConstraintValidator<AlphaNumSymbol, CharSequence> {


    /* (非 Javadoc)
     * @see javax.validation.ConstraintValidator#initialize(A)
     */
    @Override
    public void initialize(AlphaNumSymbol annotation) {
    }

    /* (非 Javadoc)
     * @see javax.validation.ConstraintValidator#isValid(T, javax.validation.ConstraintValidatorContext)
     */
    @Override
    public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {

        if (charSequence.toString().matches(".*[A-Za-z].*") || charSequence.toString().matches(".*[0-9].*")
                || containsSymbol(charSequence)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 記号チェック。
     * <p>
     * !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
     * </p>
     *
     * @param src
     * @return
     */
    boolean containsSymbol(CharSequence src) {
        for (int i = 0; i < src.length(); i++) {
            char c = src.charAt(i);
            if (33 <= c && c <= 47) {
                return true;
            }
            if (58 <= c && c <= 64) {
                return true;
            }
            if (91 <= c && c <= 96) {
                return true;
            }
            if (123 <= c && c <= 126) {
                return true;
            }
        }
        return false;
    }
}
