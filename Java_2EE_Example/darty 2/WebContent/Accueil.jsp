<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>
	<h1 align=center>Bienvenue chez Darty</h1>

	<p>
		1 - TV Samsung : Téléviseur LED rond 900.00eur
	</p>

	<p>
		2 - Four LG : Four micro-onde à double rotative 70.00eur
	</p>

	<p>
		3 - Frigo Siemens : Frigo qui fait du froid 200.00eur
	</p>

	<form action="DartyServlet" method="get">
		<b>Nom :</b> <input name="nom" /><br /> 
		<b>Adresse :</b> <input name="adresse" /><br /> <br /> 
		<b>Livraison :</b> <br /> 
			A domicile : <input type="radio" name="livraison" value="domicile" /><br /> 
			Express : <input type="radio" name="livraison" value="express" /><br /> 
			Point relais : <input type="radio" name="livraison" value="relais" /><br /> 
			A retirer : <input type="radio" name="livraison" value="surPlace" /><br /> 
		<b>liste produits :</b> (produit:quantité, un produit par ligne) : <br />
		<textarea name="produits"></textarea>
		<br /> <button>Valider</button>
	</form>

</body>
</html>