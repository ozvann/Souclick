### VARIABLES ###

JC = javac
JCFLAGS = -encoding UTF-8 -implicit:none

JVM = java

### REGLES ESSENTIELLES ###

Main.class : Main.java Accueil.class
	${JC} ${JCFLAGS} Main.java

Affichage.class : Affichage.java
	${JC} ${JCFLAGS} Affichage.java

Accueil.class : Accueil.java Affichage.class ListenerGlobal.class PaintAccueil.class
	${JC} ${JCFLAGS} Accueil.java

ListenerGlobal.class : ListenerGlobal.java
	${JC} ${JCFLAGS} ListenerGlobal.java

PaintAccueil.class : PaintAccueil.java
	${JC} ${JCFLAGS} PaintAccueil.java

### REGLES OPTIONNELLES ###

run : Main.class
	${JVM} ${JVMFLAGS} Main

clean :
	-rm -f *.class

mrproper : clean Main.class

### BUTS FACTICES ###

.PHONY : run clean mrproper

### FIN ###
