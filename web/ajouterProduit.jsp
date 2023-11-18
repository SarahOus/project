<%-- 
    Document   : ajouterProduit
    Created on : 15 nov. 2023, 19:50:50
    Author     : TRETEC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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

   

    <form action="AjouterProduitServlet" method="post" enctype="multipart/form-data">
         <h2>Ajouter un nouveau produit</h2>

        <label for="libelle">Libellé :</label>
        <input type="text" id="libelle" name="libelle" required><br>

        <label for="photo">Photo :</label>
        <input type="file" id="photo" name="photo" accept="image/*" required><br>

        <label for="prix">Prix :</label>
        <input type="text" id="prix" name="prix" required><br>

        <label for="qts">Quantité :</label>
        <input type="text" id="qts" name="qts" required><br>

        <button type="submit">Ajouter</button>

    </form>

</body>

    
</html>
