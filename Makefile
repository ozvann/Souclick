### VARIABLES ###

JC = javac
JCFLAGS = -encoding UTF-8 -implicit:none

JVM = java

### REGLES ESSENTIELLES ###

Main.class : Main.java Jeux.class
	${JC} ${JCFLAGS} Main.java

ListenerGlobal.class : ListenerGlobal.java Jeux.class
	${JC} ${JCFLAGS} ListenerGlobal.java

PaintJeux.class : PaintJeux.java
	${JC} ${JCFLAGS} PaintJeux.java

FenetreJeux.class : FenetreJeux.java
	${JC} ${JCFLAGS} FenetreJeux.java

Jeux.class : Jeux.java FenetreJeux.class
	${JC} ${JCFLAGS} Jeux.java


### REGLES OPTIONNELLES ###

run : Main.class
	${JVM} ${JVMFLAGS} Main

clean :
	-rm -f *.class

mrproper : clean Main.class

### BUTS FACTICES ###

.PHONY : run clean mrproper

### FIN ###
