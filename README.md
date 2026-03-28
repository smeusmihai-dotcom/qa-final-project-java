# QA Final Project – Java + Maven + Docker + CI/CD

![CI Pipeline](https://github.com/smeusmihai-dotcom/qa-final-project-java/actions/workflows/ci.yml/badge.svg)

## Descriere proiect
Acest proiect este o aplicație Java construită cu Maven, care include teste automate și un pipeline CI/CD configurat cu GitHub Actions. Pipeline-ul rulează testele, construiește imaginea Docker și o publică automat pe Docker Hub.

## Cum rulezi testele local
Asigură-te că ai instalat Java 17 și Maven. Pentru a rula testele local, folosește comanda:
mvn test

## Cum folosești Docker
Pentru a construi imaginea Docker:
docker build -t qa-final-project-java:latest .

Pentru a rula containerul:
docker run --rm -p 8080:8080 qa-final-project-java:latest

## CI/CD – GitHub Actions
Pipeline-ul rulează automat la fiecare push pe branch-ul main și include:
- Jobul test, care rulează mvn test
- Jobul build-and-push, care construiește imaginea Docker și o publică pe Docker Hub
- Jobul build-and-push rulează doar dacă testele trec (needs: test)

Fișierul workflow se află în:
.github/workflows/ci.yml

## Docker Hub
Imaginea Docker este publicată automat aici:
https://hub.docker.com/r/mihaismeu/qa-final-project-java