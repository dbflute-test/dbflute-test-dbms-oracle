#!/bin/bash

cd `dirname $0`
. _project.sh

export answer=y

export DBFLUTE_ENVIRONMENT_TYPE=diffready

. manage.sh replace-schema
. manage.sh jdbc

export DBFLUTE_ENVIRONMENT_TYPE=diffworld

. manage.sh replace-schema
. manage.sh jdbc
. manage.sh doc

# call by native not to stop by failure 
sh $DBFLUTE_HOME/etc/cmd/_df-manage.sh $MY_PROPERTIES_PATH schema-sync-check
sh $DBFLUTE_HOME/etc/cmd/_df-manage.sh $MY_PROPERTIES_PATH alter-check

unset DBFLUTE_ENVIRONMENT_TYPE

. manage.sh refresh
