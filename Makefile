
class=Parser

build:
	javac *.java

jflex: $(class).jfelx
	jflex $(class).jfelx

run:
	java $(class) ../test/in/5.1.in

clean:
	rm *.class
