
class=Parser

build:
	javac *.java

jflex: $(class).jfelx
	jflex $(class).jfelx

run:
	java $(class) ../test/in/4.4.in

clean:
	rm *.class
