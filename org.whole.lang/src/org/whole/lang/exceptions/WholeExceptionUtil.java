package org.whole.lang.exceptions;

import org.whole.lang.bindings.IBindingManager;
import org.whole.lang.model.IEntity;

/**
 * Copied from <code>org.whole.lang.exceptions.IWholeRuntimeException</code>
 * @author costav
 * @see org.whole.lang.exceptions.IWholeRuntimeException
 */
public class WholeExceptionUtil {
	public static RuntimeException asWholeException(Throwable e, IEntity sourceEntity, IBindingManager bm) {
		if (e instanceof IWholeRuntimeException) {
			IWholeRuntimeException wre = (IWholeRuntimeException) e;
			return wre.getSourceEntity() != null ? wre.asException() : wre.withSourceEntity(sourceEntity).withBindings(bm).asException();
		} else if (e instanceof IllegalArgumentException)
			return new WholeIllegalArgumentException(e).withSourceEntity(sourceEntity).withBindings(bm);
		else if (e instanceof IllegalStateException)
			return new WholeIllegalStateException(e).withSourceEntity(sourceEntity).withBindings(bm);
		else if (e instanceof IWholeFrameworkException)
			return ((IWholeFrameworkException) e).asException();
		else
			return new WholeRuntimeException(e).withSourceEntity(sourceEntity).withBindings(bm);
	}
	public static RuntimeException withCause(RuntimeException e, IEntity sourceEntity, IBindingManager bm) {
		return withCause(e, new WholeRuntimeException().withSourceEntity(sourceEntity).withBindings(bm));
	}
	public static RuntimeException withCause(RuntimeException e, Throwable we) {
		Throwable cause = e.getCause();
		while (cause != null && !(cause instanceof IWholeRuntimeException))
			cause = cause.getCause();
		if (cause == null)
			e.initCause(we);
		//TODO else add lazy complete
		return e;
	}
}
