CREATE DATABASE projet_fil_rouge  CHARACTER SET 'utf8'; 
USE projet_fil_rouge;
create TABLE utilisateur (
utilisateurID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
email VARCHAR(255) NOT NULL UNIQUE,
password VARCHAR(100) NOT NULL
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
numeroTel varchar(10) unique,
FOREIGN KEY(adresseID) REFERENCES adresse (adresseID),
FOREIGN KEY(utilisateurID) REFERENCES utilisateur(utilisateurID)
);
create TABLE vendeur(
vendeurID INT PRIMARY KEY NOT NULL,
nomCompagnie VARCHAR(255),
SIRET VARCHAR(14) UNIQUE,
utilisateurID INT unique,
FOREIGN KEY(utilisateurID) REFERENCES utilisateur(utilisateurID)
);

CREATE TABLE produit(
produitID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
designation VARCHAR(100) NOT NULL,
 quantiteStock int NOT NULL,
 prixUnitaire FLOAT NOT NULL,
imageURL VARCHAR(255) NOT NULL,
vendeurID INT NOT NULL,
description varchar(300) not null,
FOREIGN KEY(vendeurID) REFERENCES vendeur(vendeurID)
);

create TABLE produitPanier(
produitPanierID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
quantiteCommandee INT Not Null,
produitID INT NOT NULL,
FOREIGN KEY(produitID) REFERENCES produit(produitID)
);

create TABLE panier(
idPanier INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
produitPanierID INT NOT NULL, 
acheteurID INT not null, 
FOREIGN KEY(produitPanierID) REFERENCES produitPanier (produitPanierID),
FOREIGN KEY(acheteurID) REFERENCES acheteur (acheteurID)
);


create table commande(
commandeID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
dateCommande DATETIME not Null,
acheteurID int not null,
FOREIGN KEY(acheteurID) REFERENCES acheteur(acheteurID)
);

create table ligneCommande(
 ligneCommandeID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
stockCommandee int not null,
produitID int not null,
commandeID int not null,
FOREIGN KEY(produitID) REFERENCES produit (produitID),
FOREIGN KEY(commandeID) REFERENCES commande (commandeID)
);