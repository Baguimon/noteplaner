
# NotePlaner

NotePlaner est une API RESTful développée avec Spring Boot permettant aux enseignants de gérer les notes des étudiants dans différents cours.

## Fonctionnalités principales

### Gestion des étudiants
- Ajouter un nouvel étudiant
- Modifier un étudiant existant
- Supprimer un étudiant
- Récupérer la liste des étudiants
- Récupérer un étudiant par ID

### Gestion des cours
- Ajouter un nouveau cours
- Modifier un cours existant
- Supprimer un cours
- Récupérer la liste des cours
- Récupérer un cours par ID

### Gestion des notes
- Enregistrer une note pour un étudiant dans un cours spécifique
- Modifier une note existante
- Supprimer une note
- Récupérer toutes les notes d’un étudiant
- Récupérer toutes les notes pour un cours

### Génération de rapports
- Moyenne des notes par cours
- Moyenne des notes par étudiant

## Technologies utilisées

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL**
- **Jakarta Validation**
- **Maven**

## Configuration

Dans `src/main/resources/application.properties`, configurer son accès MySQL :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/noteplaner
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

Crée la base de données `noteplaner` dans MySQL avant de lancer l'application.

## Lancer le projet

1. Cloner le projet :
```bash
git clone https://github.com/Baguimon/NotePlaner.git
```

2. Ouvrir dans votre IDE

3. S’assurer que MySQL tourne et que la base `noteplaner` existe

4. Lancer la classe principale :
```bash
NoteplanerApplication.java
```

---

## Endpoints disponibles

| Ressource  | Méthode | URL                          | Description                         |
|------------|---------|------------------------------|-------------------------------------|
| Étudiants  | POST    | `/students`                  | Ajoute un étudiant                 |
|            | GET     | `/students`                  | Liste les étudiants                 |
|            | GET     | `/students/{id}`             | Étudiant par ID                     |
|            | PUT     | `/students/{id}`             | Modifie un étudiant                |
|            | DELETE  | `/students/{id}`             | Supprime un étudiant               |
| Notes      | POST    | `/grades`                    | Ajoute une note                    |
|            | GET     | `/grades`                    | Liste des notes                     |
|            | GET     | `/grades/{id}`               | Note par ID                         |
|            | PUT     | `/grades/{id}`               | Modifie une note                   |
|            | DELETE  | `/grades/{id}`               | Supprime une note                  |
| Cours      | POST    | `/courses`                   | Ajoute un cours                    |
|            | GET     | `/courses`                   | Liste des cours                     |
|            | GET     | `/courses/{id}`              | Cours par ID                        |
|            | PUT     | `/courses/{id}`              | Modifie un cours                   |
|            | DELETE  | `/courses/{id}`              | Supprime un cours                  |
| Rapports   | GET     | `/reports/course/{courseId}` | Moyenne d'un cours                  |
|            | GET     | `/reports/student/{studentId}` | Moyenne d'un étudiant             |

---

## Auteur

- **Timothé Winkler**
- **NotePlaner** — réalisé dans le cadre d’un devoir d'API Java Spring Boot.  
- GitHub : [@Baguimon](https://github.com/Baguimon)

