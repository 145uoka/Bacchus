package com.Bacchus.webbase.common.web.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;

import org.springframework.web.servlet.tags.form.AbstractDataBoundFormElementTag;
import org.springframework.web.servlet.tags.form.TagWriter;

@SuppressWarnings("serial")
public class IsErrorsTag extends AbstractDataBoundFormElementTag {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

	private String value;

	@Override
	protected int writeTagContent(TagWriter tagWriter) throws JspException {
		if (getBindStatus().getErrors().hasFieldErrors(this.getPath())) {
			if (value == null) {
				return EVAL_BODY_INCLUDE;
			}
			try {
				pageContext.getOut().print(value);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return SKIP_BODY;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}

}
