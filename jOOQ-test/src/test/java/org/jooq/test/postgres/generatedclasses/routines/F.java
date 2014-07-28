/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class F extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 1995087668;

	/**
	 * The parameter <code>public.f.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>public.f.f</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> F = createParameter("f", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>public.f.f_</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> F_ = createParameter("f_", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public F() {
		super("f", org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(F);
		addInParameter(F_);
	}

	/**
	 * Set the <code>f</code> parameter IN value to the routine
	 */
	public void setF(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.F.F, value);
	}

	/**
	 * Set the <code>f</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public F setF(org.jooq.Field<java.lang.Integer> field) {
		setField(F, field);
		return this;
	}

	/**
	 * Set the <code>f_</code> parameter IN value to the routine
	 */
	public void setF_(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.F.F_, value);
	}

	/**
	 * Set the <code>f_</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public F setF_(org.jooq.Field<java.lang.Integer> field) {
		setField(F_, field);
		return this;
	}
}
