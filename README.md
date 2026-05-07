# roman-number
provapratica

[![Java CI with Maven](https://github.com/dev-kerzu/roman-number/actions/workflows/maven.yml/badge.svg)](https://github.com/dev-kerzu/roman-number/actions/workflows/maven.yml)

[![Coverage Status](https://coveralls.io/repos/github/dev-kerzu/roman-number/badge.svg?branch=main&v=2)](https://coveralls.io/github/dev-kerzu/roman-number?branch=main)

PANORAMICA PROGETTO
Step di sviluppo seguiti:
1) Setup del repository
- Creazione del repository pubblico su GitHub
- Configurazione della Milestone, Project Board e Issue per la gestione delle attività
- Suddivisione delle Issue tra i due sviluppatori

2) Creazione del progetto Maven
- Generazione con archetipo `maven-archetype-quickstart`
- Configurazione di `groupId: it.unipd.mtss` e `artifactId: roman-number`

3) Configurazione del processo di build
- Aggiunta dipendenza JUnit 4
- Configurazione plugin Checkstyle 
- Configurazione plugin JaCoCo 
- Configurazione plugin Coveralls

4) Pipeline CI con GitHub Actions
- Definizione manuale del workflow `maven.yml`
- Esecuzione automatica ad ogni push e Pull Request

5) Sviluppo incrementale di `IntegerToRoman`
- Implementazione graduale: 1-10 → 20 → 50 → 100 → 200 → 500 → 1000
- Test di unità scritti ad ogni step seguendo il pattern Arrange/Act/Assert
- Gestione eccezione per valori fuori range (< 1 o > 1000)

6) Sviluppo di `RomanPrinter`
- Implementazione ASCII art per i simboli I, V, X, L, C, D, M
- Rendering riga per riga delle lettere affiancate

 7) Gestione del version control
- Workflow Git Flow con feature branch per ogni Issue
- Pull Request con revisione e merge su `main`
