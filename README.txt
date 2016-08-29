
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
The example project for Oracle and DBFlute.


# ========================================================================================
#                                                                              Environment
#                                                                              ===========
[Maven2]
This project needs maven2 so you should prepare 'M2E' (if Eclipse).

[JDBC]
Put ojdbc6.jar to both 'lib' and 'dbflute_maihamadb/extlib' and 'dbflute_newurayasudb/extlib'.

[Oracle]
/= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
This example requires three schemas 'maihamadb' and 'resortlinedb' and 'newurayasudb'.
= = = = = = = = = =/
The schemas will be created by ReplaceSchema task. (contains creating user)
But if a password of your 'system' user is different from 'orcl',
make "system-password.txt" (will be git-ignored) in dfprop directory with your system password.
(then both maihamadb's and resortlinedb's dfprop directory)

Are you ready? OK, execute the ReplaceSchema task!
First, execute ReplaceSchema by manage.bat(sh) for resortlinedb and selecting replace-schema(0).
Second, execute ReplaceSchema by nextschema-renewal.bat(sh) for newurayasudb.
Then after, execute ReplaceSchema by manage.bat(sh) for maihamadb and selecting replace-schema(0).

-- _/_/_/_/_/_/_/_/_/_/_/
-- If ORA-01536 occurred
-- _/_/_/_/_/_/_/_/_/_/_/
-- [By system user]
alter user maihamadb quota unlimited on users;
alter user newurayasudb quota unlimited on users;
alter user resortlinedb quota unlimited on users;


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
