CREATE DATABASE projet_file_rouge  SET 'utf8'; 
USE projet_file_rouge;
create TABLE utilisateur (
utilisateurID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
email VARCHAR(255) NOT NULL UNIQUE,
password VARCHAR(100) NOT NULL,
);

CREATE TABLE adresse(
adresseID INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
adresse varchar(255), 
ville varchar(255),
codePostale varchar(20)
);
create TABLE acheteur(
acheteurID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
carteBancaire VARCHAR(100) NOT NULL,
nom VARCHAR(100) NOT NULL,
prenom VARCHAR(100) NOT NULL,
utilisateurID INT unique,
adresseID INT unique,
FOREIGN KEY(adresseID) REFERENCES utilisateur(adresseID),
FOREIGN KEY(utilisateurID) REFERENCES utilisateur(utilisateurID)
);
create TABLE vendeur(
vendeurID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
nomCompagnie VARCHAR(255),
SIRET VARCHAR(14) UNIQUE,
utilisateurID INT unique,
FOREIGN KEY(utilisateurID) REFERENCES utilisateur(utilisateurID)
);

CREATE TABLE produit(
produitID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
designation VARCHAR(100) NOT NULL,
int quantiteStock NOT NULL,
int prixUnitaire NOT NULL,
imageURL VARCHAR(255) NOT NULL,
designation VARCHAR(500) NOT NULL,
vendeurID INT NOT NULL,
FOREIGN KEY(vendeurID) REFERENCES vendeur(vendeurID)
);

create TABLE produitPanier(
produitPanierID INT PRIMARY KEY NOT NULL AUTO_INCREMENT
produitID INT,
quantiteCommandee INT,
FOREIGN KEY(produitID) REFERENCES produit (produitID)
);

create TABLE panier(
idPanier INT PRIMARY KEY NOT NULL AUTO_INCREMENT
produitPanierID INT NOT NULL, 
acheteurID INT, 
FOREIGN KEY(produitPanierID) REFERENCES produitPanier (produitPanierID),
FOREIGN KEY(acheteurID) REFERENCES acheteur (pacheteurID)
);


create table commande(
commandeID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
dateCommande DATETIME not Null,
acheteurID int,
FOREIGN KEY(acheteurID) REFERENCES acheteur (acheteurID),

);

create table ligneCommande(
 ligneCommandeID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
stockCommandee int,
produitID int,
commandeID int,
FOREIGN KEY(produitID) REFERENCES produit (produitID),
FOREIGN KEY(commandeID) REFERENCES produit (commandeID),
);