<%-- 
    Document   : pageAccueil
    Created on : 16 nov. 2023, 21:51:57
    Author     : TRETEC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Connexion</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 8px;
        }

        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 16px;
            box-sizing: border-box;
        }

        button {
            background-color: #4caf50;
            color: #fff;
            padding: 10px 15px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
    </style>
    </head>
    <body>
        
        <form method="post" action="verificationLogin.jsp">
        <label for="username">Nom d'utilisateur :</label>
        <input type="text" id="user" name="user" required>

        <label for="password">Mot de passe :</label>
        <input type="password" id="pwd" name="pwd" required>

        <button type="submit">Se Connecter</button>
    </form>
    </body>
</html>