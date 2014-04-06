package org.whole.lang.reusables.model;


/**
 *  @generator  Whole
 */
public interface Adapt extends IReusablesEntity {


    public Reusable getOriginal();

    public void setOriginal(Reusable original);

    public PathExpression getAdapter();

    public void setAdapter(PathExpression adapter);

    public Reusable getAdapted();

    public void setAdapted(Reusable adapted);

    public Revision getAdaptedRevision();

    public void setAdaptedRevision(Revision adaptedRevision);
}
