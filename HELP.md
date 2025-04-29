docker create --name web-store-container -p 8011:8080 my-app:latest

[//]: # (Connecting server)
ssh -p 392 student@161.97.105.143
Password: 123654

[//]: # (Creating SSH private key)
ssh-keygen -t rsa -b 4096 -f D:\CodersAze\Projects\WebStore