package org.docksidestage.oracle.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.oracle.dbflute.allcommon.*;
import org.docksidestage.oracle.dbflute.exentity.*;

/**
 * The DB meta of VENDOR_CHECK. (Singleton)
 * @author oracleman
 */
public class VendorCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorCheckDbm _instance = new VendorCheckDbm();
    private VendorCheckDbm() {}
    public static VendorCheckDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((VendorCheck)et).getVendorCheckId(), (et, vl) -> ((VendorCheck)et).setVendorCheckId(ctl(vl)), "vendorCheckId");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfChar(), (et, vl) -> ((VendorCheck)et).setTypeOfChar((String)vl), "typeOfChar");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNchar(), (et, vl) -> ((VendorCheck)et).setTypeOfNchar((String)vl), "typeOfNchar");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfVarchar2(), (et, vl) -> ((VendorCheck)et).setTypeOfVarchar2((String)vl), "typeOfVarchar2");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfVarchar2Max(), (et, vl) -> ((VendorCheck)et).setTypeOfVarchar2Max((String)vl), "typeOfVarchar2Max");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNvarchar2(), (et, vl) -> ((VendorCheck)et).setTypeOfNvarchar2((String)vl), "typeOfNvarchar2");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfClob(), (et, vl) -> ((VendorCheck)et).setTypeOfClob((String)vl), "typeOfClob");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNclob(), (et, vl) -> ((VendorCheck)et).setTypeOfNclob((String)vl), "typeOfNclob");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfLong(), (et, vl) -> ((VendorCheck)et).setTypeOfLong((String)vl), "typeOfLong");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfXmltype(), (et, vl) -> ((VendorCheck)et).setTypeOfXmltype((String)vl), "typeOfXmltype");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumberInteger(), (et, vl) -> ((VendorCheck)et).setTypeOfNumberInteger(cti(vl)), "typeOfNumberInteger");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumberBigint(), (et, vl) -> ((VendorCheck)et).setTypeOfNumberBigint(ctl(vl)), "typeOfNumberBigint");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumberDecimal(), (et, vl) -> ((VendorCheck)et).setTypeOfNumberDecimal(ctb(vl)), "typeOfNumberDecimal");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumberIntegerMin(), (et, vl) -> ((VendorCheck)et).setTypeOfNumberIntegerMin(cti(vl)), "typeOfNumberIntegerMin");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumberIntegerMax(), (et, vl) -> ((VendorCheck)et).setTypeOfNumberIntegerMax(cti(vl)), "typeOfNumberIntegerMax");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumberBigintMin(), (et, vl) -> ((VendorCheck)et).setTypeOfNumberBigintMin(ctl(vl)), "typeOfNumberBigintMin");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumberBigintMax(), (et, vl) -> ((VendorCheck)et).setTypeOfNumberBigintMax(ctl(vl)), "typeOfNumberBigintMax");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumberSuperintMin(), (et, vl) -> ((VendorCheck)et).setTypeOfNumberSuperintMin(ctb(vl)), "typeOfNumberSuperintMin");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumberSuperintMax(), (et, vl) -> ((VendorCheck)et).setTypeOfNumberSuperintMax(ctb(vl)), "typeOfNumberSuperintMax");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfNumberMaxdecimal(), (et, vl) -> ((VendorCheck)et).setTypeOfNumberMaxdecimal(ctb(vl)), "typeOfNumberMaxdecimal");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfInteger(), (et, vl) -> ((VendorCheck)et).setTypeOfInteger(ctb(vl)), "typeOfInteger");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfBinaryFloat(), (et, vl) -> ((VendorCheck)et).setTypeOfBinaryFloat((String)vl), "typeOfBinaryFloat");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfBinaryDouble(), (et, vl) -> ((VendorCheck)et).setTypeOfBinaryDouble((String)vl), "typeOfBinaryDouble");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfDate(), (et, vl) -> ((VendorCheck)et).setTypeOfDate(ctld(vl)), "typeOfDate");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfTimestamp(), (et, vl) -> ((VendorCheck)et).setTypeOfTimestamp(ctldt(vl)), "typeOfTimestamp");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfIntervalYearToMonth(), (et, vl) -> ((VendorCheck)et).setTypeOfIntervalYearToMonth((String)vl), "typeOfIntervalYearToMonth");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfIntervalDayToSecond(), (et, vl) -> ((VendorCheck)et).setTypeOfIntervalDayToSecond((String)vl), "typeOfIntervalDayToSecond");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfBlob(), (et, vl) -> ((VendorCheck)et).setTypeOfBlob((byte[])vl), "typeOfBlob");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfRaw(), (et, vl) -> ((VendorCheck)et).setTypeOfRaw((byte[])vl), "typeOfRaw");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfBfile(), (et, vl) -> ((VendorCheck)et).setTypeOfBfile((String)vl), "typeOfBfile");
        setupEpg(_epgMap, et -> ((VendorCheck)et).getTypeOfRowid(), (et, vl) -> ((VendorCheck)et).setTypeOfRowid((String)vl), "typeOfRowid");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_CHECK";
    protected final String _tableDispName = "VENDOR_CHECK";
    protected final String _tablePropertyName = "vendorCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_CHECK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, Long.class, "vendorCheckId", null, true, false, true, "NUMBER", 16, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfChar = cci("TYPE_OF_CHAR", "TYPE_OF_CHAR", null, null, String.class, "typeOfChar", null, false, false, false, "CHAR", 3, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNchar = cci("TYPE_OF_NCHAR", "TYPE_OF_NCHAR", null, null, String.class, "typeOfNchar", null, false, false, false, "NCHAR", 3, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfVarchar2 = cci("TYPE_OF_VARCHAR2", "TYPE_OF_VARCHAR2", null, null, String.class, "typeOfVarchar2", null, false, false, false, "VARCHAR2", 32, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfVarchar2Max = cci("TYPE_OF_VARCHAR2_MAX", "TYPE_OF_VARCHAR2_MAX", null, null, String.class, "typeOfVarchar2Max", null, false, false, false, "VARCHAR2", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNvarchar2 = cci("TYPE_OF_NVARCHAR2", "TYPE_OF_NVARCHAR2", null, null, String.class, "typeOfNvarchar2", null, false, false, false, "NVARCHAR2", 32, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfClob = cci("TYPE_OF_CLOB", "TYPE_OF_CLOB", null, null, String.class, "typeOfClob", null, false, false, false, "CLOB", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNclob = cci("TYPE_OF_NCLOB", "TYPE_OF_NCLOB", null, null, String.class, "typeOfNclob", null, false, false, false, "NCLOB", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfLong = cci("TYPE_OF_LONG", "TYPE_OF_LONG", null, null, String.class, "typeOfLong", null, false, false, false, "LONG", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfXmltype = cci("TYPE_OF_XMLTYPE", "TYPE_OF_XMLTYPE", null, null, String.class, "typeOfXmltype", null, false, false, false, "XMLTYPE", 2000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumberInteger = cci("TYPE_OF_NUMBER_INTEGER", "TYPE_OF_NUMBER_INTEGER", null, null, Integer.class, "typeOfNumberInteger", null, false, false, false, "NUMBER", 5, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumberBigint = cci("TYPE_OF_NUMBER_BIGINT", "TYPE_OF_NUMBER_BIGINT", null, null, Long.class, "typeOfNumberBigint", null, false, false, false, "NUMBER", 12, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumberDecimal = cci("TYPE_OF_NUMBER_DECIMAL", "TYPE_OF_NUMBER_DECIMAL", null, null, java.math.BigDecimal.class, "typeOfNumberDecimal", null, false, false, false, "NUMBER", 5, 3, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumberIntegerMin = cci("TYPE_OF_NUMBER_INTEGER_MIN", "TYPE_OF_NUMBER_INTEGER_MIN", null, null, Integer.class, "typeOfNumberIntegerMin", null, false, false, false, "NUMBER", 1, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumberIntegerMax = cci("TYPE_OF_NUMBER_INTEGER_MAX", "TYPE_OF_NUMBER_INTEGER_MAX", null, null, Integer.class, "typeOfNumberIntegerMax", null, false, false, false, "NUMBER", 9, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumberBigintMin = cci("TYPE_OF_NUMBER_BIGINT_MIN", "TYPE_OF_NUMBER_BIGINT_MIN", null, null, Long.class, "typeOfNumberBigintMin", null, false, false, false, "NUMBER", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumberBigintMax = cci("TYPE_OF_NUMBER_BIGINT_MAX", "TYPE_OF_NUMBER_BIGINT_MAX", null, null, Long.class, "typeOfNumberBigintMax", null, false, false, false, "NUMBER", 18, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumberSuperintMin = cci("TYPE_OF_NUMBER_SUPERINT_MIN", "TYPE_OF_NUMBER_SUPERINT_MIN", null, null, java.math.BigDecimal.class, "typeOfNumberSuperintMin", null, false, false, false, "NUMBER", 19, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumberSuperintMax = cci("TYPE_OF_NUMBER_SUPERINT_MAX", "TYPE_OF_NUMBER_SUPERINT_MAX", null, null, java.math.BigDecimal.class, "typeOfNumberSuperintMax", null, false, false, false, "NUMBER", 38, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfNumberMaxdecimal = cci("TYPE_OF_NUMBER_MAXDECIMAL", "TYPE_OF_NUMBER_MAXDECIMAL", null, null, java.math.BigDecimal.class, "typeOfNumberMaxdecimal", null, false, false, false, "NUMBER", 38, 127, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfInteger = cci("TYPE_OF_INTEGER", "TYPE_OF_INTEGER", null, null, java.math.BigDecimal.class, "typeOfInteger", null, false, false, false, "NUMBER", 22, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfBinaryFloat = cci("TYPE_OF_BINARY_FLOAT", "TYPE_OF_BINARY_FLOAT", null, null, String.class, "typeOfBinaryFloat", null, false, false, false, "BINARY_FLOAT", 4, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfBinaryDouble = cci("TYPE_OF_BINARY_DOUBLE", "TYPE_OF_BINARY_DOUBLE", null, null, String.class, "typeOfBinaryDouble", null, false, false, false, "BINARY_DOUBLE", 8, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfDate = cci("TYPE_OF_DATE", "TYPE_OF_DATE", null, null, java.time.LocalDate.class, "typeOfDate", null, false, false, false, "DATE", 7, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfTimestamp = cci("TYPE_OF_TIMESTAMP", "TYPE_OF_TIMESTAMP", null, null, java.time.LocalDateTime.class, "typeOfTimestamp", null, false, false, false, "TIMESTAMP(6)", 11, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfIntervalYearToMonth = cci("TYPE_OF_INTERVAL_YEAR_TO_MONTH", "TYPE_OF_INTERVAL_YEAR_TO_MONTH", null, null, String.class, "typeOfIntervalYearToMonth", null, false, false, false, "INTERVAL YEAR(2) TO MONTH", 2, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfIntervalDayToSecond = cci("TYPE_OF_INTERVAL_DAY_TO_SECOND", "TYPE_OF_INTERVAL_DAY_TO_SECOND", null, null, String.class, "typeOfIntervalDayToSecond", null, false, false, false, "INTERVAL DAY(2) TO SECOND(6)", 2, 6, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfBlob = cci("TYPE_OF_BLOB", "TYPE_OF_BLOB", null, null, byte[].class, "typeOfBlob", null, false, false, false, "BLOB", 4000, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfRaw = cci("TYPE_OF_RAW", "TYPE_OF_RAW", null, null, byte[].class, "typeOfRaw", null, false, false, false, "RAW", 512, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfBfile = cci("TYPE_OF_BFILE", "TYPE_OF_BFILE", null, null, String.class, "typeOfBfile", null, false, false, false, "BFILE", 530, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTypeOfRowid = cci("TYPE_OF_ROWID", "TYPE_OF_ROWID", null, null, String.class, "typeOfRowid", null, false, false, false, "ROWID", 10, 0, null, null, false, null, null, null, null, null, false);

    /**
     * VENDOR_CHECK_ID: {PK, NotNull, NUMBER(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    /**
     * TYPE_OF_CHAR: {CHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfChar() { return _columnTypeOfChar; }
    /**
     * TYPE_OF_NCHAR: {NCHAR(3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNchar() { return _columnTypeOfNchar; }
    /**
     * TYPE_OF_VARCHAR2: {VARCHAR2(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarchar2() { return _columnTypeOfVarchar2; }
    /**
     * TYPE_OF_VARCHAR2_MAX: {VARCHAR2(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfVarchar2Max() { return _columnTypeOfVarchar2Max; }
    /**
     * TYPE_OF_NVARCHAR2: {NVARCHAR2(32)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNvarchar2() { return _columnTypeOfNvarchar2; }
    /**
     * TYPE_OF_CLOB: {CLOB(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfClob() { return _columnTypeOfClob; }
    /**
     * TYPE_OF_NCLOB: {NCLOB(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNclob() { return _columnTypeOfNclob; }
    /**
     * TYPE_OF_LONG: {LONG}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfLong() { return _columnTypeOfLong; }
    /**
     * TYPE_OF_XMLTYPE: {XMLTYPE(2000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfXmltype() { return _columnTypeOfXmltype; }
    /**
     * TYPE_OF_NUMBER_INTEGER: {NUMBER(5)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberInteger() { return _columnTypeOfNumberInteger; }
    /**
     * TYPE_OF_NUMBER_BIGINT: {NUMBER(12)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberBigint() { return _columnTypeOfNumberBigint; }
    /**
     * TYPE_OF_NUMBER_DECIMAL: {NUMBER(5, 3)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberDecimal() { return _columnTypeOfNumberDecimal; }
    /**
     * TYPE_OF_NUMBER_INTEGER_MIN: {NUMBER(1)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberIntegerMin() { return _columnTypeOfNumberIntegerMin; }
    /**
     * TYPE_OF_NUMBER_INTEGER_MAX: {NUMBER(9)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberIntegerMax() { return _columnTypeOfNumberIntegerMax; }
    /**
     * TYPE_OF_NUMBER_BIGINT_MIN: {NUMBER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberBigintMin() { return _columnTypeOfNumberBigintMin; }
    /**
     * TYPE_OF_NUMBER_BIGINT_MAX: {NUMBER(18)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberBigintMax() { return _columnTypeOfNumberBigintMax; }
    /**
     * TYPE_OF_NUMBER_SUPERINT_MIN: {NUMBER(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberSuperintMin() { return _columnTypeOfNumberSuperintMin; }
    /**
     * TYPE_OF_NUMBER_SUPERINT_MAX: {NUMBER(38)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberSuperintMax() { return _columnTypeOfNumberSuperintMax; }
    /**
     * TYPE_OF_NUMBER_MAXDECIMAL: {NUMBER(38, 127)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfNumberMaxdecimal() { return _columnTypeOfNumberMaxdecimal; }
    /**
     * TYPE_OF_INTEGER: {NUMBER(22)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfInteger() { return _columnTypeOfInteger; }
    /**
     * TYPE_OF_BINARY_FLOAT: {BINARY_FLOAT(4)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBinaryFloat() { return _columnTypeOfBinaryFloat; }
    /**
     * TYPE_OF_BINARY_DOUBLE: {BINARY_DOUBLE(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBinaryDouble() { return _columnTypeOfBinaryDouble; }
    /**
     * TYPE_OF_DATE: {DATE(7)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfDate() { return _columnTypeOfDate; }
    /**
     * TYPE_OF_TIMESTAMP: {TIMESTAMP(6)(11, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfTimestamp() { return _columnTypeOfTimestamp; }
    /**
     * TYPE_OF_INTERVAL_YEAR_TO_MONTH: {INTERVAL YEAR(2) TO MONTH(2)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfIntervalYearToMonth() { return _columnTypeOfIntervalYearToMonth; }
    /**
     * TYPE_OF_INTERVAL_DAY_TO_SECOND: {INTERVAL DAY(2) TO SECOND(6)(2, 6)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfIntervalDayToSecond() { return _columnTypeOfIntervalDayToSecond; }
    /**
     * TYPE_OF_BLOB: {BLOB(4000)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBlob() { return _columnTypeOfBlob; }
    /**
     * TYPE_OF_RAW: {RAW(512)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfRaw() { return _columnTypeOfRaw; }
    /**
     * TYPE_OF_BFILE: {BFILE(530)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfBfile() { return _columnTypeOfBfile; }
    /**
     * TYPE_OF_ROWID: {ROWID(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTypeOfRowid() { return _columnTypeOfRowid; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnTypeOfChar());
        ls.add(columnTypeOfNchar());
        ls.add(columnTypeOfVarchar2());
        ls.add(columnTypeOfVarchar2Max());
        ls.add(columnTypeOfNvarchar2());
        ls.add(columnTypeOfClob());
        ls.add(columnTypeOfNclob());
        ls.add(columnTypeOfLong());
        ls.add(columnTypeOfXmltype());
        ls.add(columnTypeOfNumberInteger());
        ls.add(columnTypeOfNumberBigint());
        ls.add(columnTypeOfNumberDecimal());
        ls.add(columnTypeOfNumberIntegerMin());
        ls.add(columnTypeOfNumberIntegerMax());
        ls.add(columnTypeOfNumberBigintMin());
        ls.add(columnTypeOfNumberBigintMax());
        ls.add(columnTypeOfNumberSuperintMin());
        ls.add(columnTypeOfNumberSuperintMax());
        ls.add(columnTypeOfNumberMaxdecimal());
        ls.add(columnTypeOfInteger());
        ls.add(columnTypeOfBinaryFloat());
        ls.add(columnTypeOfBinaryDouble());
        ls.add(columnTypeOfDate());
        ls.add(columnTypeOfTimestamp());
        ls.add(columnTypeOfIntervalYearToMonth());
        ls.add(columnTypeOfIntervalDayToSecond());
        ls.add(columnTypeOfBlob());
        ls.add(columnTypeOfRaw());
        ls.add(columnTypeOfBfile());
        ls.add(columnTypeOfRowid());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnVendorCheckId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.oracle.dbflute.exentity.VendorCheck"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.oracle.dbflute.cbean.VendorCheckCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.oracle.dbflute.exbhv.VendorCheckBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorCheck> getEntityType() { return VendorCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public VendorCheck newEntity() { return new VendorCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((VendorCheck)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((VendorCheck)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
