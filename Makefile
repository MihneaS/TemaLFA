
class=Parser

build:
	javac *.java

jflex:
	jflex $(class).jfelx

run:
	java $(class) ../test/in/6.in

clean:
	rm *.class
