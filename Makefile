### VARIABLES ###

JC = javac
JCFLAGS = -encoding UTF-8 -implicit:none

JVM = java

### REGLES ESSENTIELLES ###

Main.class : Main.java Affichage.class
	${JC} ${JCFLAGS} Main.java

Affichage.class : Affichage.java
	${JC} ${JCFLAGS} Affichage.java


### REGLES OPTIONNELLES ###

run : Main.class
	${JVM} ${JVMFLAGS} Main

clean :
	-rm -f *.class

mrproper : clean Main.class

### BUTS FACTICES ###

.PHONY : run clean mrproper

### FIN ###
