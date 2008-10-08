package inc.glamdring.vtables;

/**
 *  midpoint between 2 casts
 * 
 * 
 * type,edge, delta, coersion points, etc.
 * 
 * User: jim
 * Date: Sep 18, 2008
 * Time: 6:05:14 AM
 */
public interface �<l, r> extends _proto<l> {

    /**
     * left type node with induction
     *
     * @param p copy ctor/factory proto
     * @return shift left
     */
    l l$(�<l, r> p);

    /**
     * right type node with induction
     *
     * @param p copy ctor/factory proto
     * @return right shift
     */
    r $r(�<l, r> p);

    /**
     * binds two types
     *
     * @param l
     * @param r
     * @return fused arc
     */
    �<l, r> bind(l l, r r);

}