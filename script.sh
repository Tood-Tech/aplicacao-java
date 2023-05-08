sudo apt update && sudo apt upgrade –y
sudo apt install docker.io
sudo docker pull mysql:5.7
docker stop $(docker ps -a -q)
docker rm $(docker ps -a -q)
sudo docker run -d -p 3306:3306 --name ContainerBD -e "MYSQL_DATABASE=ToodDatabase" -e "MYSQL_ROOT_PASSWORD=sptech" mysql:5.7
sudo docker exec -it ContainerBD bash
mysql –u aluno -psptech
CREATE TABLE IF NOT EXISTS `ToodDatabase`.`DadoTotem` (
  `idDadosTotem` INT NOT NULL AUTO_INCREMENT,
  `dataHora` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  `qtdRam` varchar(100),
  `qtdDisco` varchar(100),
  `qtdProcessador` varchar(100),
  PRIMARY KEY (`idDadosTotem`)
);
exit;
exit;
chmod 777 login-tood-java-swing-1.0-SNAPSHOT-jar-with-dependencies.jar
java -jar login-tood-java-swing-1.0-SNAPSHOT-jar-with-dependencies.jar
