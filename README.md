# Аутентификация на основе сессий

Реализован пример простейшей аутентификации пользователей на основе сессий.  
  
Сценарий взаимодействия пользователя и сервера:
1. Пользователь заходит на страницу (в нашем примере это `http://localhost:8080/start`)
2. Пользователь перенаправляется на страницу входа в систему (`http://localhost:8080/login`)
3. Пользователь вводит логин и пароль, далее сервер запоминает сессию данного пользователя
4. Пользователь может посещать разные страницы в рамках сессии без необходимости снова вводить данные (в нашем примере доступны страницы `/start`, `/other`)
5. Сессия инвалидируется по таймауту или при выходе пользователя из системы (ручной log out не реализован)
