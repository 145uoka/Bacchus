package com.Bacchus.webbase.common.util;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Touple2<A, B> {
	public final A value1;
	public final B value2;

	public Touple2(A value1, B value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Touple2) {
			@SuppressWarnings("unchecked")
			Touple2<A, B> other = (Touple2<A, B>) obj;
			return new EqualsBuilder().append(other.value1, this.value1).append(other.value2, this.value2).isEquals();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(value1).append(value2).toHashCode();
	}

	@Override
	public String toString() {
		return "[" + String.valueOf(value1) + " , " + String.valueOf(value2) + "]";
	}

}
