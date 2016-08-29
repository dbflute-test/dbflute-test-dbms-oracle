#!/bin/bash

cd `dirname $0`

export answer=y

pushd ../dbflute_resortlinedb
sh manage.sh replace-schema
popd

sh nextschema-renewal.sh
sh manage.sh replace-schema
