
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
The example project for Buri and DBFlute.


# ========================================================================================
#                                                                              Environment
#                                                                              ===========
[Maven2]
This project needs maven2 so you should prepare 'M2Eclipse'.

[JDBC]
Put ojdbc5.jar to both 'lib' and 'dbflute_maihamadb/extlib' and 'dbflute_newurayasudb/extlib'.

[Oracle]
/= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
This example requires two schemas 'maihamadb' and 'newurayasudb'.
= = = = = = = = = =/
The maihamadb and newurayasudb will be created by ReplaceSchema task. (contains creating user)
But if a password of your 'system' user is different from 'orcl',
Modify the password on additionalUserMap in replaceSchemaDefinitionMap.dfprop.

Are you ready? OK, execute the ReplaceSchema task!
At first execute the ReplaceSchema task by nextschema-renewal.bat(sh) for newurayasudb
Then after, execute the ReplaceSchema task by manage.bat(sh) 0 for maihamadb

-- _/_/_/_/_/_/_/_/_/_/_/
-- If ORA-01536 occurred
-- _/_/_/_/_/_/_/_/_/_/_/
-- [By system user]
alter user maihamadb quota unlimited on users;
alter user newurayasudb quota unlimited on users;


# ========================================================================================
#                                                                                     Memo
#                                                                                     ====
-- Synonym for Package Procedure has several problems:
-- o Cannot specify a schema name for a package procedure. Why?
-- CREATE SYNONYM VD_SYNONYM_NEXT_PKG_PROCEDURE FOR NEXTEXAMPLE.NEXTPKG.SP_NEXT_PKG_NO_PARAMETER;
--   ==> ORA-00933
-- o Cannot execute the synonym. Why?
-- call VD_SYNONYM_NEXT_PKG_PROCEDURE();
--   ==> ORA-04045
