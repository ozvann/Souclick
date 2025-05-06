### VARIABLES ###

JC = javac
JCFLAGS = -encoding UTF-8 -implicit:none

JVM = java

### REGLES ESSENTIELLES ###

Main.class : Main.java Jeux.class
	${JC} ${JCFLAGS} Main.java

Jeux.class : Jeux.java FenetreJeux.class PaintJeux.class ListenerGlobal.class
	${JC} ${JCFLAGS} Jeux.java

ListenerGlobal.class : ListenerGlobal.java
	${JC} ${JCFLAGS} ListenerGlobal.java

PaintJeux.class : PaintJeux.java
	${JC} ${JCFLAGS} PaintJeux.java

FenetreJeux.class : FenetreJeux.java
	${JC} ${JCFLAGS} FenetreJeux.java


### REGLES OPTIONNELLES ###

run : Main.class
	${JVM} ${JVMFLAGS} Main

clean :
	-rm -f *.class

mrproper : clean Main.class

### BUTS FACTICES ###

.PHONY : run clean mrproper

### FIN ###
