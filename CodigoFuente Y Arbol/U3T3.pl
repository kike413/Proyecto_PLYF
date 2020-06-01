progenitor(leo, enrique).
progenitor(leo, brenda).
progenitor(leo, adrian).
progenitor(maria, enrique).
progenitor(maria, brenda).
progenitor(maria, adrian).
progenitor(maria, jorge).
progenitor(enrique, anna).
progenitor(enrique, luis).
progenitor(enrique, carlos).
progenitor(brenda, marlene).
progenitor(brenda, giovanni).
progenitor(brenda, emily).
progenitor(adrian, jose).
progenitor(adrian, carla).
progenitor(adrian, sandra).
progenitor(jorge, pablo).

persona(pablo).
persona(sandra).
persona(carla).
persona(jose).
persona(emily).
persona(giovanni).
persona(marlene).
persona(carlos).
persona(luis).
persona(anna).
persona(jorge).
persona(adrian).
persona(brenda).
persona(enrique).
persona(maria).
persona(leo).

mujer(maria).
mujer(brenda).
mujer(anna).
mujer(marlene).
mujer(emily).
mujer(carla).
mujer(sandra).


hombre(leo).
hombre(enrique).
hombre(adrian).
hombre(luis).
hombre(carlos).
hombre(giovanni).
hombre(jose).
hombre(jorge).
hombre(pablo).





madre(X, Y) :- progenitor(X, Y), mujer(X).
padre(A, B) :- progenitor(A, B), hombre(A).

tienehijos(X) :- progenitor(X,Y), hombre(Y).
tienehijas(X) :- progenitor(X,Y), mujer(Y).
tieneabuelo(X):- abuelo(Y,X), hombre(Y).
tieneabuela(X):- abuela(Y,X), mujer(Y).
tienemadre(X):- madre(Y,X), mujer(Y).
tienepadre(X):- padre(Y,X), hombre(Y).
tieneprimas(X):- prima(Y,X), mujer(Y).
tieneprimos(X):- primo(Y,X), hombre(Y).



% hermana, hermano, prima, primo, tio, tia, abuelo, abuela
hermana(X,Y) :-progenitor(Z,X),
    progenitor(Z,Y),
    mujer(X),
    X\=Y.
hermano(X,Y) :-progenitor(Z,X),
    progenitor(Z,Y),
    hombre(X),
    X\=Y.

tio(TIO,Y) :- progenitor(PAPA,Y),
    progenitor(ABUELO, PAPA),
    progenitor(ABUELO, TIO),
    hombre(TIO),
    mujer(ABUELO),
    TIO\=PAPA.

tia(TIA,Y) :- progenitor(PAPA,Y),
    progenitor(ABUELO, PAPA),
    progenitor(ABUELO, TIA),
    mujer(TIA),
    mujer(ABUELO),
    TIA\=PAPA.

primo(PRIMO,Y) :- progenitor(PAPA,Y),
    progenitor(ABUELO, PAPA),
    progenitor(ABUELO, TIO),
    progenitor(TIO, PRIMO),
    mujer(ABUELO),
    hombre(PRIMO),
    PRIMO\= hermano(PRIMO,y),
    PRIMO\= hermana(PRIMO,y),
    PRIMO\=Y.

prima(PRIMA,Y) :- progenitor(PAPA,Y),
    progenitor(ABUELO, PAPA),
    progenitor(ABUELO, TIO),
    progenitor(TIO, PRIMA),
    mujer(ABUELO),
    mujer(PRIMA),
    PRIMA\= hermano(PRIMA,y),
    PRIMA\= hermana(PRIMA,y),
    PRIMA\=Y.

abuelo(ABUELO,Y) :- progenitor(PAPA,Y),
    progenitor(ABUELO, PAPA),
    hombre(ABUELO).

abuela(ABUELA,Y) :- progenitor(PAPA,Y),
    progenitor(ABUELA, PAPA),
    mujer(ABUELA).














