# m1-test

Voici le Repository des TPs de test pour le M1GIL de l'université de Rouen.

La première chose que vous avez à faire est de loner ce repository, pour ce faire, utilisez
`git clone https://github.com/7170/m1-test.git`

La seconde chose à faire est de prendre la branche correspondante au TP en cours.
`git branch -a` pour afficher toutes les branches
`git checkout <branch-name>` pour passer la branche désirée en branche courante.

TP1
Vous aurez besoin d'écrire des tests unitaires sur les sources fournies. Pour cela vous utiliserez JUnit 5 (regardez votre pom.xml)
Une fonction de test doit être nommée convenablement
`shouldDoSomething() {...}`
chaque méthode de test doit être annotée avec `@Test` 

Et n'oubliez pas les commentaires 
`//GIVEN` => Préparation de vos variables (entrées, sorties...)
`//WHEN` => Le comportement que vous êtes entrain de tester
`//THEN` =>  Les assertions iront ici 

Une fois vos tests efefctués, allez voir la documentation d'assertJ https://assertj.github.io/doc/
Ajoutez le à votre pom et remplacez vos assertions pour l'utiliser (assertThat)

