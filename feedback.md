#soort oplossing
In de klasse Vak  heb je ook een abstracte methode nodig om punten toe te voegen. Doe je dit niet, dan kun je nooit op niveau van vak punten toevoegen, wat vervelend is. Bedoeling is nl. dat wanneer een student punten moet krijgen voor een vak, je eerst dat vak zoekt in z'n traject. Op dat moment weet je enkel dat het een Vak zal zijn, maar weet je eigenlijk niet of het een PraktijkVak, TheorieVak of VakMetCases zal zijn. Maw, dan weet je ook niet welke setPunten() er uitgevoerd zal moeten worden... En dan loop je vast in veel controles...
Je was er bijna, je had nog een techniek nodig die het mogelijk maakt om Praktijkvak ook de Punten-interface te laten implementeren.
(type van parameter Object maken, was hier een mogelijke oplossing)

Voor de rest zit alles goed in elkaar! 

#algemeen
Bekijk zeker de oplossingen op Toledo. Ik voegde ook hier en daar wat commentaar toe in je code (start altijd met TODO-LEUKA en vind je dus terug in de lijst bij de TODO's (onderaan in IntelliJ kun je die lijst opvragen.))