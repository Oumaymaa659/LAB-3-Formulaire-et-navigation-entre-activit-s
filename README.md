# LAB 3 — Formulaire et navigation entre activités

## 📋 Description

Application Android développée dans le cadre du **LAB 3** de développement mobile. Ce projet illustre la création de **formulaires** et la **navigation entre activités** en utilisant les `Intent` et les `Extra` d'Android.

## 🎯 Objectifs du TP

- Créer un formulaire de saisie avec différents types de champs (`EditText`, `Spinner`)
- Transmettre des données entre activités via des `Intent` avec `putExtra()`
- Récupérer et afficher les données transmises dans une seconde activité
- Implémenter un écran de démarrage (Splash Screen) avec animation

## 🏗️ Structure du projet

```
app/src/main/java/com/example/tp1/
├── splashActivity.java     # Écran de démarrage avec animation de rotation du logo
├── MainActivity.java       # Formulaire de saisie (nom, email, téléphone, adresse, ville)
└── MainActivity2.java      # Affichage des données saisies
```

## 📱 Fonctionnalités

### 1. Splash Screen (`splashActivity`)
- Affiche un logo avec une **animation de rotation** (180°) pendant 5 secondes
- Redirige automatiquement vers le formulaire principal

### 2. Formulaire de saisie (`MainActivity`)
- **Nom et Prénom** — Champ texte (`EditText`)
- **Email** — Champ email avec validation de type
- **Téléphone** — Champ numérique pour le numéro de téléphone
- **Adresse** — Champ texte libre
- **Ville** — Liste déroulante (`Spinner`) avec les villes disponibles
- **Bouton "Envoyer"** — Envoie les données vers la deuxième activité

### 3. Affichage des données (`MainActivity2`)
- Récupère les données transmises via `getIntent().getExtras()`
- Affiche les informations saisies : nom, téléphone, email, adresse et ville

## 🛠️ Technologies utilisées

| Technologie | Version |
|---|---|
| **Langage** | Java |
| **SDK cible** | Android SDK 35 |
| **SDK minimum** | Android SDK 24 |
| **Build System** | Gradle (Kotlin DSL) |
| **UI** | XML Layouts (LinearLayout, ConstraintLayout) |
| **Bibliothèques** | AndroidX AppCompat, Material Design, ConstraintLayout |

## 🚀 Comment exécuter

1. Cloner le dépôt :
   ```bash
   git clone https://github.com/Oumaymaa659/LAB-3-Formulaire-et-navigation-entre-activit-s.git
   ```
2. Ouvrir le projet dans **Android Studio**
3. Synchroniser les dépendances Gradle
4. Exécuter l'application sur un émulateur ou un appareil physique

## 📸 Démonstration

https://github.com/user-attachments/assets/e743598a-bfbb-489e-822c-596fa651107e

## 📝 Concepts Android abordés

- **Intent explicite** — Navigation entre activités
- **putExtra / getExtras** — Transmission de données entre activités
- **Spinner** — Liste déroulante avec données prédéfinies
- **RotateAnimation** — Animation de rotation pour le Splash Screen
- **EdgeToEdge** — Interface immersive bord à bord

---

> **Réalisé par** : Oumayma — LAB 3, Développement Mobile
