package org.docksidestage.oracle.dbflute.cbean.nss;

import org.docksidestage.oracle.dbflute.cbean.cq.VendorLargeDataRefCQ;

/**
 * The nest select set-upper of VENDOR_LARGE_DATA_REF.
 * @author oracleman
 */
public class VendorLargeDataRefNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected VendorLargeDataRefCQ _query;
    public VendorLargeDataRefNss(VendorLargeDataRefCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * VENDOR_LARGE_DATA by my LARGE_DATA_ID, named 'vendorLargeData'.
     */
    public void withVendorLargeData() {
        _query.xdoNss(() -> _query.queryVendorLargeData());
    }
    /**
     * With nested relation columns to select clause. <br>
     * VENDOR_LARGE_DATA_REF by my SELF_PARENT_ID, named 'vendorLargeDataRefSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public VendorLargeDataRefNss withVendorLargeDataRefSelf() {
        _query.xdoNss(() -> _query.queryVendorLargeDataRefSelf());
        return new VendorLargeDataRefNss(_query.queryVendorLargeDataRefSelf());
    }
}
