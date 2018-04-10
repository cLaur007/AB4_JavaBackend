Descriere Implementare:

	- "Activity" - Enum cu diverse activitati
	- In clasa "Place" incapsulez o serie de informatii referitoare la fiecare loc in parte,
cum ar fi :  - Activitati
	     - Pret
	     - Rating
	Aceasta clasa implementeaza interfata Comparable astfel ca fiecare oras in parte isi va tine
constant locurile (Place - urile) sortate dupa pretul acestora descrescator. Deci la un user - request
aplicatia va putea raspunde promt cu cele mai bune oferte.
	Dispune de metode precum addActivity, getActivities, getName etc..
		
	
	- In clasa "City", dupa cum spuneam mai sus, pe langa informatiile despre oras : rating, nume
.., avem un ArrayList de locuri (Place - uri) sortat.
	"City" implementeaza si ea la randul ei interfata Comparable astfel ca fiecare tara in parte
isi va mentine orasele ei dupa rating ul dat de turisti. In acest mod useri primesc informatii in timp
real cu privire la cele mai populare orase unde doresc sa calatoreasca.
	Dispune de metode precum addPlace, getPlaces, getName
	La fiecare add rating - ul, evident se va reactualiza si lista celor mai ieftine locatii
se va sorta din nou.

	- In clasa "Country" - pastrez ierarhia oraselor sortate in functie de rating, cele mai populare
primele.
	Dispune de metode precum addCity, getCities, getName
	La fiecare add se va re sorta lista oraselor 

Clasa Test este un exemplu de functionare a aplicatiei:
	Initial user ul poate vizualiza lista tarilor cu care compania are acord
	Dupa care acesta tasteaza numele uneia dintre ele pentru a vedea mai multe optiuni
despre aceasta.
	Astfel ca aplicatia va printa pe ecran cele mai populare 5 orase, iar pentru fiecare
dintre acestea cea mai ieftina locatie.


*****
	Aceasta ierarhie de clase poate fi usor impinsa mai departe de dumneavoastra
spre exemplu incapsuland si tarile in continente, sau orasele in regiuni si asa mai departe....
*****

	
	