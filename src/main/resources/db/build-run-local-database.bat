docker build -t template-db .
docker run -d -p 3306:3306 --name template-db template-db