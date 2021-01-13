package cloud.jordaan.juan.poker.exception;

import java.util.function.Function;

public interface CheckedExceptionWrapper {

	public static <R, T> R thowsRuntimeException(Function<T, R> f, T t) {
		try {
			return f.apply(t);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
