#!/usr/bin/env bash

mvn clean package

echo 'Copy files...'

scp -i ~/.ssh/id_rsa \
    target/SpringTraineeWebServiceMVC-1.0-SNAPSHOT.jar \
    user@???:/home/user/

echo 'Restart server...'

ssh -i ~/.ssh/id_rsa user@??? << EOF

pgrep java | xargs kill -9
nohup java -jar SpringTraineeWebServiceMVC-1.0-SNAPSHOT.jar > log.txt &

EOF

echo 'Bye'
