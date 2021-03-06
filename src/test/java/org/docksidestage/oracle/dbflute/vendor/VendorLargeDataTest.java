package org.docksidestage.oracle.dbflute.vendor;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.scoping.AndQuery;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.cbean.scoping.UnionQuery;
import org.dbflute.dbmeta.info.ColumnInfo;
import org.dbflute.helper.HandyDate;
import org.dbflute.util.DfCollectionUtil;
import org.dbflute.util.DfResourceUtil;
import org.dbflute.util.DfTraceViewUtil;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.oracle.dbflute.bsentity.dbmeta.VendorLargeDataDbm;
import org.docksidestage.oracle.dbflute.bsentity.dbmeta.VendorLargeDataRefDbm;
import org.docksidestage.oracle.dbflute.cbean.VendorLargeDataCB;
import org.docksidestage.oracle.dbflute.cbean.VendorLargeDataRefCB;
import org.docksidestage.oracle.dbflute.exbhv.VendorLargeDataBhv;
import org.docksidestage.oracle.dbflute.exbhv.VendorLargeDataRefBhv;
import org.docksidestage.oracle.dbflute.exentity.VendorLargeData;
import org.docksidestage.oracle.dbflute.exentity.VendorLargeDataRef;
import org.docksidestage.oracle.unit.UnitContainerTestCase;

/**
 * The test of vendor's large data handling.
 * <p>
 * These test cases should work if the data does not exist
 * because large data files for ReplaceSchema is treated as SVN-ignore.
 * </p>

 * @author jflute
 * @since 0.9.7.5 (2010/10/22 Friday)
 */
public class VendorLargeDataTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorLargeDataBhv vendorLargeDataBhv;
    private VendorLargeDataRefBhv vendorLargeDataRefBhv;

    // ===================================================================================
    //                                                     QueryRelation or with InnerJoin
    //                                                     ===============================
    public void test_QueryRelation_or_with_InnerJoin_basic() throws Exception {
        // ## Arrange ##
        final LocalDate fromDate = toLocalDate("2010/11/17");
        final LocalDate toDate = new HandyDate(fromDate).addDay(7).getLocalDate();

        // ## Act ##
        compareByRef(new Callback<VendorLargeDataRefCB>() {

            public void exec(VendorLargeDataRefCB cb) {
                vendorLargeDataRefBhv.selectCount(cb);
            }

            public VendorLargeDataRefCB first() {
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.query().queryVendorLargeDataRefSelf().setDateIndex_DateFromTo(fromDate, toDate);
                return cb;
            }

            public VendorLargeDataRefCB second() {
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.query().queryVendorLargeDataRefSelf().setDateIndex_DateFromTo(fromDate, toDate);
                cb.query().queryVendorLargeDataRefSelf().innerJoin();
                return cb;
            }
        }, "QueryRelation", "with InnerJoin");
    }

    // ===================================================================================
    //                                                              OnClause or InlineView
    //                                                              ======================
    public void test_OnClause_or_InlineView_basic() throws Exception {
        // ## Arrange ##
        final LocalDate fromDate = toLocalDate("2010/11/17");
        final LocalDate toDate = new HandyDate(fromDate).addDay(7).getLocalDate();
        final LocalDateTime fromDateTime = toLocalDateTime("2010/11/17");
        final LocalDateTime toDateTime = new HandyDate(fromDate).addDay(7).getLocalDateTime();

        // ## Act ##
        compareByRef(new Callback<VendorLargeDataRefCB>() {

            public void exec(VendorLargeDataRefCB cb) {
                vendorLargeDataRefBhv.selectList(cb);
            }

            public VendorLargeDataRefCB first() {
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.setupSelect_VendorLargeDataRefSelf();
                cb.query().queryVendorLargeDataRefSelf().on()
                        .setDateNoIndex_FromTo(fromDate, toDate, op -> op.compareAsDate());
                cb.query().setTimestampIndex_FromTo(fromDateTime, toDateTime, op -> op.compareAsDate());
                return cb;
            }

            public VendorLargeDataRefCB second() {
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.setupSelect_VendorLargeDataRefSelf();
                cb.query().queryVendorLargeDataRefSelf().inline()
                        .setDateNoIndex_FromTo(fromDate, toDate, op -> op.compareAsDate());
                cb.query().setTimestampIndex_FromTo(fromDateTime, toDateTime, op -> op.compareAsDate());
                return cb;
            }
        }, "OnClause", "InlineView");
    }

    // ===================================================================================
    //                                                          OrScopeQuery or UnionQuery
    //                                                          ==========================
    public void test_OrScopeQuery_or_UnionQuery_basic() throws Exception {
        // ## Arrange ##
        final LocalDate fromDate = toLocalDate("2010/11/17");
        final LocalDate toDate = new HandyDate(fromDate).addDay(7).getLocalDate();

        // ## Act ##
        compareByRef(new Callback<VendorLargeDataRefCB>() {

            public void exec(VendorLargeDataRefCB cb) {
                vendorLargeDataRefBhv.selectCount(cb);
            }

            public VendorLargeDataRefCB first() {
                // select dflocal.LARGE_DATA_REF_ID as c1, dflocal.LARGE_DATA_ID as c2, ... 
                //   from VENDOR_LARGE_DATA_REF dflocal 
                //  where ((dflocal.DATE_INDEX >= date '2010-11-05' and dflocal.DATE_INDEX < date '2010-11-09')
                //      or dflocal.LARGE_DATA_ID = 3
                //     ) 
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.orScopeQuery(new OrQuery<VendorLargeDataRefCB>() {
                    public void query(VendorLargeDataRefCB orCB) {
                        orCB.orScopeQueryAndPart(new AndQuery<VendorLargeDataRefCB>() {
                            public void query(VendorLargeDataRefCB andPartCB) {
                                andPartCB.query().setDateIndex_DateFromTo(fromDate, toDate);
                            }
                        });
                        orCB.query().setLargeDataId_Equal(3L);
                    }
                });
                return cb;
            }

            public VendorLargeDataRefCB second() {
                // select dflocal.LARGE_DATA_REF_ID as c1, dflocal.LARGE_DATA_ID as c2, ... 
                //   from VENDOR_LARGE_DATA_REF dflocal 
                //  where dflocal.DATE_INDEX >= date '2010-11-05'
                //    and dflocal.DATE_INDEX < date '2010-11-09'
                //  union 
                // select dflocal.LARGE_DATA_REF_ID as c1, dflocal.LARGE_DATA_ID as c2, ... 
                //   from VENDOR_LARGE_DATA_REF dflocal 
                //  where dflocal.LARGE_DATA_ID = 3 
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.query().setDateIndex_DateFromTo(fromDate, toDate);
                cb.union(new UnionQuery<VendorLargeDataRefCB>() {
                    public void query(VendorLargeDataRefCB unionCB) {
                        unionCB.query().setLargeDataId_Equal(3L);
                    }
                });
                return cb;
            }
        }, "OrScopeQuery", "UnionQuery");
    }

    // ===================================================================================
    //                                                   ExistsReferrer or InScopeRelation
    //                                                   =================================
    public void test_ExistsReferrer_or_InScopeRelation_noCondition() throws Exception {
        // ## Arrange ##
        final List<Long> largeDataIdList = DfCollectionUtil.newArrayList();
        for (int i = 0; i < 20; i++) {
            largeDataIdList.add(Long.valueOf(i + 1));
        }

        // ## Act ##
        compareByMain(new Callback<VendorLargeDataCB>() {

            public void exec(VendorLargeDataCB cb) {
                vendorLargeDataBhv.selectCount(cb);
            }

            public VendorLargeDataCB first() {
                VendorLargeDataCB cb = new VendorLargeDataCB();
                cb.query().setLargeDataId_InScope(largeDataIdList);
                cb.query().existsVendorLargeDataRef(new SubQuery<VendorLargeDataRefCB>() {
                    public void query(VendorLargeDataRefCB subCB) {
                    }
                });
                return cb;
            }

            public VendorLargeDataCB second() {
                VendorLargeDataCB cb = new VendorLargeDataCB();
                cb.query().setLargeDataId_InScope(largeDataIdList);
                cb.query().existsVendorLargeDataRef(new SubQuery<VendorLargeDataRefCB>() {
                    public void query(VendorLargeDataRefCB subCB) {
                        subCB.useInScopeSubQuery();
                    }
                });
                return cb;
            }
        }, "ExistsReferrer", "InScopeRelation");
    }

    public void test_ExistsExistsReferrer_or_InScopeRelation_noIndexCondition() throws Exception {
        // ## Arrange ##
        final List<Long> largeDataIdList = DfCollectionUtil.newArrayList();
        for (int i = 0; i < 20; i++) {
            largeDataIdList.add(Long.valueOf(i + 1));
        }

        // ## Act ##
        compareByMain(new Callback<VendorLargeDataCB>() {

            public void exec(VendorLargeDataCB cb) {
                vendorLargeDataBhv.selectCount(cb);
            }

            public VendorLargeDataCB first() {
                VendorLargeDataCB cb = new VendorLargeDataCB();
                cb.query().setLargeDataId_InScope(largeDataIdList);
                cb.query().existsVendorLargeDataRef(new SubQuery<VendorLargeDataRefCB>() {
                    public void query(VendorLargeDataRefCB subCB) {
                        subCB.query().setDateNoIndex_GreaterEqual(currentLocalDate());
                    }
                });
                return cb;
            }

            public VendorLargeDataCB second() {
                VendorLargeDataCB cb = new VendorLargeDataCB();
                cb.query().setLargeDataId_InScope(largeDataIdList);
                cb.query().existsVendorLargeDataRef(new SubQuery<VendorLargeDataRefCB>() {
                    public void query(VendorLargeDataRefCB subCB) {
                        subCB.useInScopeSubQuery();
                        subCB.query().setDateNoIndex_GreaterEqual(currentLocalDate());
                    }
                });
                return cb;
            }
        }, "ExistsReferrer", "InScopeRelation");
    }

    // ===================================================================================
    //                                                                        Index or not
    //                                                                        ============
    public void test_Index_or_not_Date() throws Exception {
        // ## Arrange ##
        final LocalDate fromDate = toLocalDate("2010-01-01");
        final LocalDate toDate = toLocalDate("2010-02-01");

        // ## Act ##
        compareIndexByRef(new Callback<VendorLargeDataRefCB>() {

            public void exec(VendorLargeDataRefCB cb) {
                vendorLargeDataRefBhv.selectCount(cb);
            }

            public VendorLargeDataRefCB first() {
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.query().setDateIndex_DateFromTo(fromDate, toDate);
                return cb;
            }

            public VendorLargeDataRefCB second() {
                VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
                cb.query().setDateNoIndex_DateFromTo(fromDate, toDate);
                return cb;
            }
        });
    }

    // ===================================================================================
    //                                                                      Compare Helper
    //                                                                      ==============
    protected static interface Callback<CB extends ConditionBean> {
        void exec(CB cb);

        CB first();

        CB second();
    }

    protected void compareByMain(Callback<VendorLargeDataCB> callback, String first, String second) throws Exception {
        xcompare(callback, first, second);
    }

    protected void compareByRef(Callback<VendorLargeDataRefCB> callback, String first, String second) throws Exception {
        xcompare(callback, first, second);
    }

    protected void compareIndexByMain(Callback<VendorLargeDataCB> callback) throws Exception {
        xcompare(callback, "useIndex", "noIndex");
    }

    protected void compareIndexByRef(Callback<VendorLargeDataRefCB> callback) throws Exception {
        xcompare(callback, "useIndex", "noIndex");
    }

    protected <CB extends ConditionBean> void xcompare(Callback<CB> callback, String first, String second)
            throws Exception {
        // ## Arrange ##
        int totalTryCount = 20;

        // ## Act ##
        String firstResult;
        String secondResult;
        {
            CB firstCB = callback.first();
            CB secondCB = callback.second();

            // ignored (for initialization)
            callback.exec(firstCB);
            callback.exec(secondCB);

            long firstTotal = 0;
            long secondTotal = 0;
            for (int i = 0; i < totalTryCount; i++) {
                boolean firstTime = (i % 2 == 0);
                long before = currentUtilDate().getTime();
                CB currentCB = firstTime ? firstCB : secondCB;
                callback.exec(currentCB);
                long after = currentUtilDate().getTime();
                if (firstTime) {
                    firstTotal = firstTotal + (after - before);
                } else {
                    secondTotal = secondTotal + (after - before);
                }
            }
            firstResult = DfTraceViewUtil.convertToPerformanceView(firstTotal / (totalTryCount / 2));
            secondResult = DfTraceViewUtil.convertToPerformanceView(secondTotal / (totalTryCount / 2));
        }
        log(first + " = " + firstResult);
        log(second + " = " + secondResult);
    }

    // ===================================================================================
    //                                                                    Large Data Maker
    //                                                                    ================
    // You can make large data as TSV files for ReplaceSchema.
    // Switch the first method definition and execute it
    // and the data can be registered when ReplaceSchema.
    // (The TSV files are SVN-ignored)
    //public void test_making_TSV() throws Exception {
    protected void invalid_now() throws Exception {
        // for base data
        //final int dataSize = 1203;
        //final int dataInitialBaseId = 0;
        //final String dataPrefixNumber = "90";
        //final int refSize = 30000;
        //final int refInitialBaseId = 0;
        //final String refPrefixNumber = "91";
        // for super large data
        final int dataSize = 120003;
        final int dataInitialBaseId = 1203;
        final String dataPrefixNumber = "92";
        final int refSize = 1000000;
        final int refInitialBaseId = 30000;
        final String refPrefixNumber = "93";

        final String outputDir;
        {
            String canonicalPath = DfResourceUtil.getBuildDir(this.getClass()).getCanonicalPath();
            outputDir = canonicalPath + "/../../dbflute_maihamadb/playsql/data/ut/tsv/UTF-8";
        }
        final List<VendorLargeData> dataList = new ArrayList<VendorLargeData>();
        final int loopLimitCount = dataSize + dataInitialBaseId;
        for (int i = dataInitialBaseId; i < loopLimitCount; i++) {
            int currentId = (i + 1);
            VendorLargeData data = new VendorLargeData();
            data.setLargeDataId(Long.valueOf(currentId));
            data.setStringIndex("foo" + (currentId % 1000));
            data.setStringNoIndex(data.getStringIndex());
            data.setStringUniqueIndex("foo" + currentId);
            data.setIntflgIndex(currentId % 2);
            data.setNumericIntegerIndex(currentId);
            data.setNumericIntegerNoIndex(data.getNumericIntegerIndex());
            dataList.add(data);
        }
        writeLargeData(dataList, outputDir, dataPrefixNumber, dataSize);
        writeLargeDataRef(dataList, outputDir, refPrefixNumber, dataSize, refSize, refInitialBaseId);
    }

    protected void writeLargeData(List<VendorLargeData> dataList, String outputDir, String dataPrefixNumber,
            int dataSize) throws Exception {
        final String path = outputDir + "/" + dataPrefixNumber + "-VENDOR_LARGE_DATA.tsv";
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            final List<ColumnInfo> columnInfoList = VendorLargeDataDbm.getInstance().getColumnInfoList();
            int index = 0;
            for (ColumnInfo columnInfo : columnInfoList) {
                bw.write((index > 0 ? "\t" : "") + columnInfo.getColumnDbName());
                ++index;
            }
            log("...Writing LargeData(" + dataSize + ")");
            for (VendorLargeData data : dataList) {
                bw.write(ln() + buildRecord(VendorLargeDataDbm.getInstance().extractAllColumnMap(data)));
            }
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }

    protected void writeLargeDataRef(List<VendorLargeData> dataList, String outputDir, String refPrefixNumber,
            int dataSize, int refSize, int refInitialBaseId) throws Exception {
        final Calendar baseDateCal = DfTypeUtil.toCalendar("1900/01/01");
        final Calendar baseTimestampCal = DfTypeUtil.toCalendar("1970/01/01 00:00:00");
        final String path = outputDir + "/" + refPrefixNumber + "-VENDOR_LARGE_DATA_REF.tsv";
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            final List<ColumnInfo> columnInfoList = VendorLargeDataRefDbm.getInstance().getColumnInfoList();
            int index = 0;
            for (ColumnInfo columnInfo : columnInfoList) {
                bw.write((index > 0 ? "\t" : "") + columnInfo.getColumnDbName());
                ++index;
            }
            log("...Writing LargeDataRef(" + refSize + ")");
            Long selfParentId = null;
            final int loopLimitCount = refSize + refInitialBaseId;
            for (int i = refInitialBaseId; i < loopLimitCount; i++) {
                int currentId = (i + 1);
                VendorLargeDataRef ref = new VendorLargeDataRef();
                ref.setLargeDataRefId(Long.valueOf(currentId));
                ref.setLargeDataId(dataList.get(currentId % dataSize).getLargeDataId());
                ref.setDateIndex(DfTypeUtil.toLocalDate(baseDateCal));
                ref.setDateNoIndex(ref.getDateIndex());
                ref.setTimestampIndex(DfTypeUtil.toLocalDateTime(baseTimestampCal));
                ref.setTimestampNoIndex(ref.getTimestampIndex());
                if ((currentId % 3) == 0) {
                    ref.setNullableDecimalIndex(new BigDecimal(currentId + "." + (currentId % 1000)));
                    ref.setNullableDecimalNoIndex(ref.getNullableDecimalIndex());
                }
                if (currentId % 10 == 1) { // means parent
                    selfParentId = ref.getLargeDataRefId();
                } else if (selfParentId != null) {
                    ref.setSelfParentId(selfParentId);
                }
                bw.write(ln() + buildRecord(VendorLargeDataRefDbm.getInstance().extractAllColumnMap(ref)));

                if (baseDateCal.get(Calendar.YEAR) > 9990) {
                    baseDateCal.set(Calendar.YEAR, 1970);
                }
                baseDateCal.add(Calendar.DATE, 1);
                baseTimestampCal.add(Calendar.HOUR, 4);
                baseTimestampCal.add(Calendar.SECOND, 20);
                baseTimestampCal.add(Calendar.MILLISECOND, 6);
            }
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }

    protected String buildRecord(Map<String, Object> columnValueMap) {
        StringBuilder sb = new StringBuilder();
        Set<Entry<String, Object>> entrySet = columnValueMap.entrySet();
        int index = 0;
        for (Entry<String, Object> entry : entrySet) {
            Object value = entry.getValue();
            if (index > 0) {
                sb.append("\t");
            }
            if (value == null) {
                sb.append("");
            } else if (value instanceof LocalDate) {
                sb.append(DfTypeUtil.toString(value, "yyyy-MM-dd"));
            } else if (value instanceof LocalDateTime) {
                sb.append(DfTypeUtil.toString(value, "yyyy-MM-dd HH:mm:ss.SSS"));
            } else if (value instanceof LocalTime) {
                sb.append(DfTypeUtil.toString(value, "HH:mm:ss"));
            } else if (value instanceof Timestamp) {
                sb.append(DfTypeUtil.toString(value, "yyyy-MM-dd HH:mm:ss.SSS"));
            } else if (value instanceof java.util.Date) {
                sb.append(DfTypeUtil.toString(value, "yyyy-MM-dd"));
            } else {
                sb.append(value);
            }
            ++index;
        }
        return sb.toString();
    }
}
