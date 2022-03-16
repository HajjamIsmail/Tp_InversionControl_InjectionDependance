<h1>Introduction</h1>
<hr/>
<p>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tout d'abord quand on travaille sur un projet Informatique, il faut respecter certaine Exigence obligatoire.<br/>
    Parmi eux :
</p>
    <ul>
        <li>Exigence fonctionnelles</li>
        <li>Exigence Techniques</li>
    </ul>
<p>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Alors pour répondre à ces exigences on doit répondre aux Besoins fonctionnels (code métier) ; et en termes de performance et maintenance (Application doit évoluer dans le temps et doit être Fermée aux modifications et ouverte à l'extension.<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;pour respecter ces exigences il faut travailler avec le principe de l'inversion de control et l'injection des dépendances.<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;L'objectif de ce TP est de comprendre est de pratiquer ce principe avec différentes méthodes.<br/>
</p>
<hr/>
<h1>Inversion de control</h1>
<hr/>
<p>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Il Permet au développeur de s'occuper uniquement de code métier(Exigence Fonctionnelle).
</p>
<p>
    Pour Appliquer ce concept il y a 2 méthodes pour y faire
</p>
<ul>
    <li><strong>Couplage Fort :</strong> Quand une classe dépend d'une autre classe (lié à une classe)</li>
    <li><strong>Couplage Faible :</strong> Quand une classe dépend d'une Interface et non par une classe</li>
</ul>

<h6>N.B :</h6>
<p>
    Pour respecter le principe de l'inversion de control il faut utiliser le <strong>Couplage Faible</strong>
</p>
<h4>1-Exemple de Diagramme de class :</h4>
<img src="photo/1.png">
<h4>2-Code : </h4>
<div style="display: flex; align-items: center;">
    <img src="photo/1-1.png">
    <img src="photo/1-2.png">
</div>
<hr/>
<h1>Injection des dépendances : </h1>
<hr/>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Il sert à Gérer l'inversion de controle.</p>
<ul>
    <p>pour faire l'injection des dépendances il existe 3 méthodes : </p>
    <li>Instanciation Static.</li>
    <li>Instanciation Dynamic.</li>
    <li>Faire appel à <strong>Spring :</strong></li>
    <ul>
        <li>Par fichier XML</li>
        <li>Par Annotation</li>
    </ul>
</ul>
<h4>1-Instanciation static : </h4>
<p>à l'aide de <strong>new</strong></p>
<h6>1-1-code et execution : </h6>
<img src="photo/2.png">
<h4>2-Instanciation Dynamic : </h4>
<p>à l'aide de <strong>file : config.txt</strong></p>
<h6>2-1-code et execution : </h6>
<img src="photo/3.png">
<h6>2-3-file config.txt : </h6>
<img src="photo/3-1.png">
<h4>3-Spring : </h4>
<p>pour travailler avec spring(faire injection des dépendances) nous pouvons utiliser 2 versions : </p>
<h6>N.B :</h6>
<p>Pour utiliser spring il faut inclure le framework(la dépendance) dans le fichier "pom.xml"</p>
<p>Dépendance qu'il faut ajouter : <strong>spring-core</strong> && <strong>spring-Contexte</strong> && <strong>spring-beans</strong></p>
<img src="photo/5.png">
<h6>3-1-Version XML </h6>
<strong>File XML : </strong>
<img src="photo/4-1.png">
<strong>Code et exécution : </strong>
<img src="photo/4-2.png">
<h6>3-2-Version Annotation : </h6>
<p>En travaillons avec spring il faut ajouter les annotations dans chaque classe : <strong>@Component</strong></p>
<img src="photo/6.png">
<Strong>Code et Execution : </Strong>
<img src="photo/7.png">
<hr/>
<h1>Conclusions : </h1>
<p>L'objectif de ce TP et de pratiquer ce que spring fait comme role et aussi concevoir une application évolutive (pourrai évoluer avec le temps : besoins client)</p>
