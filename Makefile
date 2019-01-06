
class=Parser

build:
	javac *.java

jflex:
	jflex $(class).jfelx

run:
	java $(class) ../test/in/7.1.in

clean:
	rm *.class
