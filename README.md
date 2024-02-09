# m1-test

Voici le Repository des TPs de test pour le M1GIL de l'université de Rouen.

La première chose que vous avez à faire est de cloner ce repository, pour ce faire, utilisez
`git clone https://github.com/7170/m1-test.git`

La seconde chose à faire est de prendre la branche correspondante au TP en cours.
`git branch -a` pour afficher toutes les branches
`git checkout <branch-name>` pour passer la branche désirée en branche courante.

Dans ce TP nous allons utiliser AssertJ https://assertj.github.io/doc/ ainsi que JaCoCo https://www.jacoco.org/jacoco/

Ils sont déjà dans votre pom.xml

L'objectif va être de tester vos classes
- BankAccount -> Test Unitaire
- BankAccountWithDao -> Test Unitaire et Test d'Intégration
  Il vous faudra des mocks dans ces tests unitaires pour garantir l'isolation, et pour cela il faudra utiliser Mockito https://site.mockito.org/
